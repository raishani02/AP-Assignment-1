package Q1;

import intro2java.Person;
public class Lecturer implements Person{

    String subject="Biology";

    public String getSubject(){
        return subject;
    }

    @Override
    public String getEmail() {
        
        return "lecturer@gmail.com";
    }

    @Override
    public String getName() {
        
        return "Lecturer";
    }

    @Override
    public String getDescription() {
        
        return "Teaches " + getSubject();
    }
    
}
