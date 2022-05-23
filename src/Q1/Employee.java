package Q1;

import intro2java.Person;
public class Employee implements Person{

    String dept_name;
    public String getDepartment(){
        return "CS Dept";
    }
    @Override
    public String getEmail() {
        
        return "employee@gmail.com";
    }

    @Override
    public String getName() {
        return "Employee";
    }

    @Override
    public String getDescription() {
        return "Belongs to " + getDepartment();
    }
    
}
