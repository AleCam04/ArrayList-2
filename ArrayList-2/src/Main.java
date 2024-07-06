import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        char c = 27;

        students.add(new Student("Gabriele", 15));
        students.add(new Student("Giovanni", 22));
        students.add(new Student("Giulia", 8));
        students.add(new Student("Carlotta", 28));
        students.add(new Student("Alice", 24));
        students.add(new Student("Francesco", 19));
        students.add(new Student("Pietro", 30));
        students.add(new Student("Alessandro", 20));
        students.add(new Student("Christian", 26));
        students.add(new Student("Mattia", 23));
        students.add(new Student("Kim", 21));
        students.add(new Student("Leo", 18));

        System.out.println(c + "[33mArrayList non ordinata" + c + "[0m");
        for(Student student : students){
            System.out.println(student);
        }
        System.out.println("/----------------------------------------------------------------------------/");
        Collections.sort(students,Comparator.comparing(Student::getName));
        System.out.println(c + "[33mArrayList in ordine alfabetico" + c + "[0m");
        for(Student student : students){
            System.out.println(student);
        }

        System.out.println("/----------------------------------------------------------------------------/");
        Collections.sort(students,Comparator.comparing(Student::getAge));
        System.out.println(c + "[33mArrayList in ordine d'età" + c + "[0m");
        for(Student student : students){
            System.out.println(student);
        }

    }
}