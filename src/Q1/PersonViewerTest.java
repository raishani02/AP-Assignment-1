package Q1;

import intro2java.*;
public class PersonViewerTest {
    public static void main(String[] args) throws Exception {
        PersonViewer personViewer = new PersonViewer();
        Lecturer lecturer = new Lecturer();
        Employee employee = new Employee();
        Student student = new Student();
        personViewer.view(student);
        personViewer.view(employee);
        personViewer.view(lecturer);
    }
}
