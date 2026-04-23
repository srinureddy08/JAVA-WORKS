class Person {
    String name;
    int age;

    void getPersonDetails(String n, int a) {
        name = n;
        age = a;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollNo;
    String course;

    void getStudentDetails(int r, String c) {
        rollNo = r;
        course = c;
    }
    void displayStudentDetails() {
        displayPersonDetails(); 
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class ResearchStudent extends Student {
    String researchTopic;
    String guideName;
    void getResearchDetails(String topic, String guide) {
        researchTopic = topic;
        guideName = guide;
    }
    void displayResearchDetails() {
        displayStudentDetails(); 
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Guide Name: " + guideName);
    }
}

public class main7 {
    public static void main(String[] args) {
        ResearchStudent rs = new ResearchStudent();
        rs.getPersonDetails("srinu", 18);
        rs.getStudentDetails(19, "M.Tech");
        rs.getResearchDetails("Artificial Intelligence", "Dr. Reddy");

        rs.displayResearchDetails();
    }
}
