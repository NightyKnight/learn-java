package education;

/**
 * Create a new student and print out a few stats
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

        System.out.println("Name: "+john.firstName+" "+john.lastName);
        System.out.println("Student ID: "+john.studentID);
        System.out.println("GPA: "+john.GPA);
    }
}
