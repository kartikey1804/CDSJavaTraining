import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeGUI {

    public static void main(String[] args) {
        System.out.println("Jframe is used to build GUI Java appliation");
        JFrame jFrame =new JFrame("BMI Calculator");
        //to get the input from user JTextfield
        //to display  any message to user JLabel
        //to perform any action by click on the button JButton

        JLabel userWeightLabel =new JLabel("Enter Your Weight in Kg:");
        userWeightLabel.setBounds(40,40,200,40);
        JTextField userWeightTextField =new JTextField("");
        userWeightTextField.setBounds(250,40,60,40);
        jFrame.add(userWeightLabel);
        jFrame.add(userWeightTextField);



        JLabel userHeightLabel =new JLabel("Enter Your Height in M:");
        userHeightLabel.setBounds(40,100,200,40);
        JTextField userHeightTextField =new JTextField("");
        userHeightTextField.setBounds(250,100,60,40);
        jFrame.add(userHeightLabel);
        jFrame.add(userHeightTextField);

        JButton calculateBmi=new JButton("Calculate BMI");
        calculateBmi.setBounds(200,200,150,50);
        jFrame.add(calculateBmi);
        //to click on the button

        calculateBmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float weight =Float.parseFloat(userWeightTextField.getText().toString());
                float height =Float.parseFloat(userHeightTextField.getText().toString());
                float bmiValue =weight/(height*height);
                calculateBmi.setText(String.valueOf(bmiValue));
            }
        });
        //logic bmi calculator user height and user weight
        //formula Weight/(height*height)
        //to use the default layout

        jFrame.setLayout(null);
        jFrame.setSize(400,500);
        //set visible the frame
        jFrame.setVisible(true);
    }
}
