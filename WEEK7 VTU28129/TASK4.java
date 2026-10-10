import java.util.ArrayList;
import java.util.List;

class BrowserHistory {
    private List<String> history;
    private int current;
    private int maxBoundary;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        current = 0;
        maxBoundary = 0; // Tracks the valid forward boundary
    }
    
    public void visit(String url) {
        current++;
        // If we are within existing array bounds, overwrite the url
        if (current < history.size()) {
            history.set(current, url);
        } else {
            history.add(url);
        }
        // Visiting a new page clears all forward history
        maxBoundary = current;
    }
    
    public String back(int steps) {
        // Move back at most to the beginning (index 0)
        current = Math.max(0, current - steps);
        return history.get(current);
    }
    
    public String forward(int steps) {
        // Move forward at most to maxBoundary
        current = Math.min(maxBoundary, current + steps);
        return history.get(current);
    }
}
OUTPUT:
Input
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
Output
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
