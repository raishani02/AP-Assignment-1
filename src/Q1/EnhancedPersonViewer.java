package Q1;

public class EnhancedPersonViewer {
    public static void main(String[] args) throws Exception {
        SubPersonViewer personViewer = new SubPersonViewer();
        Lecturer lecturer = new Lecturer();
        Employee employee = new Employee();
        Student student = new Student();
        personViewer.view(student);
        personViewer.view(employee);
        personViewer.view(lecturer);
    }
}
