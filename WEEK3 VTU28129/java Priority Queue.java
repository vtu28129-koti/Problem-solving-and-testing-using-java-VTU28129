import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pq = new PriorityQueue<>(
            new Comparator<Student>() {

                public int compare(Student a, Student b) {

                    // Higher CGPA first
                    if (a.getCGPA() > b.getCGPA()) {
                        return -1;
                    }

                    if (a.getCGPA() < b.getCGPA()) {
                        return 1;
                    }

                    // Same CGPA -> name ascending
                    int nameCompare =
                        a.getName().compareTo(b.getName());

                    if (nameCompare != 0) {
                        return nameCompare;
                    }

                    // Same name -> smaller ID first
                    return a.getID() - b.getID();
                }
            }
        );

        for (String event : events) {

            String[] parts = event.split(" ");

            if (parts[0].equals("ENTER")) {

                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                pq.add(new Student(id, name, cgpa));

            } else if (parts[0].equals("SERVED")) {

                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }

        List<Student> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<String> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            events.add(sc.nextLine());
        }

        Priorities priorities = new Priorities();

        List<Student> students =
            priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }

        sc.close();
    }
}

OUTPUT:
Input (stdin)
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
Your Output (stdout)
Dan
Ashley
Shafaet
Maria
