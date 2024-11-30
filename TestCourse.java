public class TestCourse {
    public static void main(String [] args){
        Course course1 = new Course("data structure");
        Course course2 = new Course("data structure");

        course1.addStudent("john");
        course1.addStudent("bat");
        course1.addStudent("moon");
        //course1.dropStudent("moon");

        course2.addStudent("john moon");
        course2.addStudent("toyyib moon");

        System.out.println("number of students in course1: " +
                course1.getNumberOfStudents() + " " + course1.getCourseName());

        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++){
            System.out.print(students[i] + " ");
        }
    }
}
