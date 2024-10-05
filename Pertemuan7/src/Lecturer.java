// Concrete class Lecturer
class Lecturer extends Person {
    private String department;
    private String[] coursesTeaching;

    public Lecturer(String id, String name, int age, String department, String[] coursesTeaching) {
        super(id, name, age);
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer: " + getName() + " (ID: " + getId() + ")");
        System.out.println("Age: " + getAge() + ", Department: " + department);
        System.out.println("Courses teaching: " + String.join(", ", coursesTeaching));
    }

    public void teach(Course course) {
        System.out.println(getName() + " is teaching " + course.getCourseName());
    }
}