public class AcademicManagement {
    public static void main(String[] args) {
        Student student = new Student("072", "Berliana", 18, "Teknik Informatika", 3.8);
        Lecturer lecturer = new Lecturer("IF001", "Yadhi Aditya", 45, "Teknik Komputer dan informatika ", 
                                         new String[]{"PBO", "PRPL"});
        Course course = new Course("PP101", "Inheritance", 4);

        System.out.println("Student Information:");
        student.displayInfo();
        System.out.println();

        System.out.println("Lecturer Information:");
        lecturer.displayInfo();
        System.out.println();

        System.out.println("Course Information:");
        course.displayInfo();
        System.out.println();

        student.study(course);
        lecturer.teach(course);
    }
}