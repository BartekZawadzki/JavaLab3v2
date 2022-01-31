public class test {
    public static void main(String[] args) {
       /* Student bartek = new Student("Bartek", "Zawadzki", 21, true);
        Student kacper = new Student("Kacper", "Buczynski", 21, false);
        Student mateusz = new Student("Mateusz", "Wozniak", 22, false); */
        Student[] students = new Student[3];
        students[0] = new Student("Bartek", "Zawadzki", 21, true);
        students[1] = new Student("Kacper", "Buczynski", 21, false);
        students[2] = new Student("Mateusz", "Wozniak", 22, false);
        for (int i = 0; i < 3; i++)
            System.out.println("Student: " + students[i]);
        }
    }
