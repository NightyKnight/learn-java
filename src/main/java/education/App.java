package education;

/**
 * Create a new course and add a some students
 */
public class App {
    public static void main(String[] args) {
        Student john = new Student();

        john.firstName = "John";
        john.lastName = "Snow";
        john.studentID = 111;
        john.GPA = 2.5f;
        john.homeAddress = "1 Direwolf Lane, Winterfell, Westeros";

        Student sansa = new Student();

        sansa.firstName = "Sansa";
        sansa.lastName = "Stark";
        sansa.studentID = 222;
        sansa.GPA = 3.5f;
        sansa.homeAddress = "1 Direwolf Lane, Winterfell, Westeros";

        Course english = new Course();

        //Add Students to course
        english.courseName = "English 101";
        english.courseNumber = "ENG101";
        english.schedule = "MWF 10AM-12PM";
        english.enrolled.add(john);
        english.enrolled.add(sansa);

        //Print out the results
        System.out.println("Course: " + english.courseName);
        System.out.println("Course Number: " + english.courseNumber);
        System.out.println("Schedule: " + english.schedule);
        System.out.println("Enrolled Students: ");

            //Use enhanced for loop to iterate and print out all of the students
            for (Student i : english.enrolled) {
                System.out.print(i);
            }
    }
}
