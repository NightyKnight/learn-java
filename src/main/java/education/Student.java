package education;

public class Student {
    String firstName;
    String lastName;
    int studentID;
    float GPA;
    String homeAddress;

        public String combineName(){
                String fullName = firstName+" "+lastName;
                return fullName;
    }
}
