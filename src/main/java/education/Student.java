package education;

public class Student {
    String firstName;
    String lastName;
    int studentID;
    float GPA;
    String homeAddress;

        public static String combineName(String firstName,String lastName){
                String fullName = this.firstName+" "+this.lastName;
                return fullName;
    }
}
