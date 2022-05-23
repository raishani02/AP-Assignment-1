package Q1;

import intro2java.Person;
import java.lang.String;
public class Student implements Person{

    String name="Student";
    String mail="studen@gmail.com";
    String grade="A";

    public String getGrade(){

        return grade;
    }
    @Override
    public String getEmail() {
        
        return mail;
    }

    @Override
    public String getName() {
        
        return name;
    }

    @Override
    public String getDescription() {
        
        return "A C grade student" + getGrade();
    }
    
}
