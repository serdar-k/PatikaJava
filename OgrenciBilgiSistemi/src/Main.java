// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FIZ101", "FIZ");
        Course kimya = new Course("Kimya", "KIM101", "KIM");

        Teacher teacher1 = new Teacher("Serdar Korkmaz", "963258741", "MAT");
        Teacher teacher2 = new Teacher("John Doe", "789654123", "FIZ");
        Teacher teacher3 = new Teacher("Lorem Ipsum", "147852369", "KIM");

        mat.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        kimya.addTeacher(teacher3);

        Student student1 = new Student("Nadia Mercia", 4, "159357", mat, fizik, kimya);
        student1.addBulkExamNote(50, 50, 20, 20, 40, 40);
        student1.isPass();

        Student student2 = new Student("Nacer Montoya", 4, "357951", mat, fizik, kimya);
        student2.addBulkExamNote(100, 100, 50, 50, 40, 40);
        student2.isPass();
    }
}