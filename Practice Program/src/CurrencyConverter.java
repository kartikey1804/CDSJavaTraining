import javax.swing.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Currency Converter");
        double USD_TO_INR= 83.72;
        double INR_TO_USD= 1/ USD_TO_INR;
        JLabel USDTOINRLalbel= new JLabel("Enter Amount In USD");
        JTextField USDTOINRfield =new JTextField();
        JLabel INRTOUSDLabel = new JLabel("Enter Amount In INR");
        JTextField INRTOUSDfield =new JTextField();
        JButton ConvertButton =new JButton("Convert");
        JLabel resultLabel = new JLabel();
        USDTOINRLalbel.setBounds(30,30,150,40);
        USDTOINRfield.setBounds(180,30,50,40);
        frame.add(USDTOINRLalbel);
        frame.add(USDTOINRfield);
        INRTOUSDLabel.setBounds(30,70,150,40);
        INRTOUSDfield.setBounds(180,70,50,40);
        frame.add(INRTOUSDLabel);
        frame.add(INRTOUSDfield);
        ConvertButton.setBounds(80,120,120,40);
        resultLabel.setBounds(40,180,250,40);

        frame.add(resultLabel);
        frame.add(ConvertButton);
        frame.setLayout(null);
        frame.setSize(300,350);
        frame.setVisible(true);


    }
}

