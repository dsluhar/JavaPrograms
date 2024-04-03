package AutomationScripts;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class UpdateStudentCityInStudentObject {
	
    public static int updateCity(ArrayList<Student> students) {
        int count = 0;

        // Iterate through the ArrayList
        for (Student student : students) {
            // Check if the city is "Mumbai"
            if (student.getCity().equalsIgnoreCase("Mumbai")) {
                // Update city to "Delhi"
                student.setCity("Delhi");
                count++; // Increment count of updated records
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, "Mumbai"));
        students.add(new Student("Bob", 21, "Delhi"));
        students.add(new Student("Charlie", 23, "Mumbai"));

        // Update city records and get count of updated records
        int updatedRecords = updateCity(students);

        // Print the count of updated records
        System.out.println("Number of student records updated: " + updatedRecords);

        // Print the updated student list
        System.out.println("Updated student list:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", City: " + student.getCity());
        }
    }
}
