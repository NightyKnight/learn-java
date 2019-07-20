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

        //Override the default toString method to format the Student object for printing
        @Override
        public String toString() {
            return studentID + "\t" + combineName() + "\n";
    }
}
