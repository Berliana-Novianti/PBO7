// Concrete class Student
class Student extends Person {
    private String major;
    private double gpa;

    public Student(String id, String name, int age, String major, double gpa) {
        super(id, name, age);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + " (ID: " + getId() + ")");
        System.out.println("Age: " + getAge() + ", Major: " + major + ", GPA: " + gpa);
    }

    public void study(Course course) {
        System.out.println(getName() + " is studying " + course.getCourseName());
    }
}