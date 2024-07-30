import javax.swing.*;
import java.util.Random;

public class GameinJava {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Ability Tester");
        Random random = new Random();
        JLabel Num1 =new JLabel (int num = random.nextInt(10000));
        System.out.println(""+num);
        frame.setLayout(null);
        frame.setSize(300,350);
        frame.setVisible(true);
    }
}
