import java.util.Scanner;

public class Classobjects {
    public static void main(String[] args) {
        //call the class and initialize the object
        Trainer trainer = new Trainer();
        System.out.println("enter the trainer name");
        Scanner scanner = new Scanner(System.in);
        trainer.trainername = scanner.nextLine();
        System.out.println("enter the trainer technology");
        trainer.trainerTechnology = scanner.nextLine();
        System.out.println(trainer.trainername);
        System.out.println(trainer.trainerTechnology);
        Student student = new Student();
        student.studentname = scanner.nextLine();
        student.studentTechnology = scanner.nextLine();
        System.out.println(student.studentname);
        System.out.println(student.studentTechnology);
    }
}
class Trainer{
    String trainername;
    String trainerTechnology;
}
class Student {
    String studentname;
    String studentTechnology;
}
