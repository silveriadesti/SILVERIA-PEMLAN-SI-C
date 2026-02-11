public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Pemrograman Java");

        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");

        course.dropStudent("Bob");

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Jumlah siswa: " + course.getNumberOfStudents());

        String[] students = course.getStudents();
        System.out.print("Daftar siswa: ");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();

        course.clear();
        System.out.println("Setelah clear, jumlah siswa: " + course.getNumberOfStudents());
    }
}