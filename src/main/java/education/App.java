package education;

/**
 * Create a new course and add a some students
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student john = new Student();

        john.firstName = "John";
        john.lastName = "Snow";
        john.studentID = 111;
        john.GPA = 2.5f;
        john.homeAddress = "1 Direwolf Lane, Winterfell, Westeros";
        System.out.println(john.fullName);

        Student sansa = new Student();

        sansa.firstName = "Sansa";
        sansa.lastName = "Stark";
        sansa.studentID = 222;
        sansa.GPA = 3.5f;
        sansa.homeAddress = "1 Direwolf Lane, Winterfell, Westeros";

        Course english = new Course();

        english.courseName = "English 101";
        english.courseNumber = "ENG101";
        english.schedule = "MWF 10AM-12PM";
        english.enrolled[0] = john;
        english.enrolled[1] = sansa;

        System.out.println("Course: "+english.courseName);
        System.out.println("Course Number: "+english.courseNumber);
        System.out.println("Schedule: "+english.schedule);
        System.out.println("Enrolled Students: ");
        System.out.println(english.enrolled[0].studentID+" "+john.combineName());
        System.out.println(english.enrolled[1].studentID+" "+sansa.combineName());
    }
}
