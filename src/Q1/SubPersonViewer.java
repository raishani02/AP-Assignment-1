package Q1;

import intro2java.*;

public class SubPersonViewer extends PersonViewer {
    
    public void view(Person person)
    {
        String type=person.getClass().getName();
        if(type.equals("Q1.Employee"))
        {
            //person=(Employee)person;
            viewPerson((Employee) person);
        }
        else if(type.equals("Q1.Student"))
        {
            //person=(Student)person;
            viewPerson((Student) person);
        }
        else if(type.equals("Q1.Lecturer"))
        {
           //person=(Lecturer)person;
            viewPerson((Lecturer) person);
        }
        else{
            System.out.println("Invalid Type");
        }
        
    }
    public void viewPerson(Student objStudent)
    {
        System.out.println("Student");
        System.out.println("Name: " + objStudent.getName());
        System.out.println("Email: " + objStudent.getEmail());
        System.out.println("Description: " + objStudent.getDescription());
        System.out.println("\n");
    }
    public void viewPerson(Employee objEmployee)
    {
        System.out.println("Employee");
        System.out.println("Name: " + objEmployee.getName());
        System.out.println("Email: " + objEmployee.getEmail());
        System.out.println("Description: " + objEmployee.getDescription());
        System.out.println("\n");
    }
    public void viewPerson(Lecturer objLecturer)
    {
        System.out.println("Lecturer");
        System.out.println("Name: " + objLecturer.getName());
        System.out.println("Email: " + objLecturer.getEmail());
        System.out.println("Description: " + objLecturer.getDescription());
        System.out.println("\n");
    }
}
