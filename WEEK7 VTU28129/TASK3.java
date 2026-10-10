import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    // Helper class to store check-in details for a user
    private static class CheckInInfo {
        String stationName;
        int time;

        CheckInInfo(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    // Helper class to store aggregated trip data between two stations
    private static class RouteInfo {
        double totalTime = 0;
        int count = 0;

        void addTrip(int duration) {
            totalTime += duration;
            count++;
        }

        double getAverage() {
            return totalTime / count;
        }
    }

    // Maps customerId -> CheckInInfo
    private Map<Integer, CheckInInfo> checkIns;
    
    // Maps "startStation->endStation" -> RouteInfo
    private Map<String, RouteInfo> routes;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        routes = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInInfo(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        CheckInInfo startInfo = checkIns.remove(id);
        String routeKey = startInfo.stationName + "->" + stationName;
        int tripDuration = t - startInfo.time;

        routes.putIfAbsent(routeKey, new RouteInfo());
        routes.get(routeKey).addTrip(tripDuration);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String routeKey = startStation + "->" + endStation;
        return routes.get(routeKey).getAverage();
    }
}
OUTPUT:
Input
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]
Output
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
