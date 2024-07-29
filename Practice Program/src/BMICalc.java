import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalc {
    public static void main(String[] args) {
        //Calculate The user BMI
        JFrame frame= new JFrame("BMI Calculator");
        JLabel heightlabel= new JLabel("Enter YourHeight In M");
        JLabel weightLabel = new JLabel("Enter Your weight in Kg");
        JTextField heightfield =new JTextField();
        JTextField weightfield =new JTextField();
        JButton bmiButton =new JButton("Calculate BMI");

        JLabel resultLabel = new JLabel();
        heightlabel.setBounds(30,30,150,40);
        heightfield.setBounds(180,30,50,40);
        frame.add(heightlabel);
        frame.add(heightfield);
        weightLabel.setBounds(30,70,150,40);
        weightfield.setBounds(180,70,50,40);
        frame.add(weightLabel);
        frame.add(weightfield);
        bmiButton.setBounds(80,120,120,40);
        resultLabel.setBounds(30,170,200,40);
        frame.add(resultLabel);
        frame.add(bmiButton);
        //To Calculate on the calculate BMI Button
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (weightfield.getText().isEmpty()|| weightfield.getText().isEmpty());
                {
                    resultLabel.setText(("Please enter the weight and Height"));
                }
                float weight =Float.parseFloat(weightfield.getText().toString());
                float height =Float.parseFloat(heightfield.getText().toString());
        float result = weight/(height*height);

        if (result<=18.5) {
            resultLabel.setText("I am Under Weight");
        }   else if (result>18.5&& result<24.9) {
            resultLabel.setText("I am Normal");
        } else if (result>24.9&& result<29.9) {
            resultLabel.setText("Im Overweight");
        } else {
            resultLabel.setText("Im Obesity");

        }
            }

        });
        frame.setLayout(null);
        frame.setSize(300,250);
        frame.setVisible(true);
    }
}
