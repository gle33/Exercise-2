//import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
public class Main{
    public static void main(String[] args){
        JFrame main_frame = new JFrame("Exercise 2 - Celsius to Fahrenheit converter");
        main_frame.setSize(1000, 500);

        JLabel prompt = new JLabel("Enter the temperature in CELSIUS to get the equivalent in FAHRENHEIT:");
        prompt.setBounds(500, 50, 400, 50);
        main_frame.add(prompt);

        JTextField user_input = new JTextField();
        user_input.setBounds(500, 100, 200, 25);
        main_frame.add(user_input);

        JButton convert = new JButton("Convert");
        convert.setBounds(500, 200, 100, 50);
        main_frame.add(convert);
        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String user_input_string = user_input.getText();
                double fahrenheit;
                double celsius;
                JLabel results;
                JLabel errorMsg;

                try{
                    celsius = Double.parseDouble(user_input_string);
                    fahrenheit = (celsius * 9/5) + 32;
                    results = new JLabel(fahrenheit + "F is equivalent to " + celsius + "C");
                    results.setBounds(200, 50, 200, 20);
                    main_frame.add(results);
                }
                catch(NumberFormatException err){
                    errorMsg = new JLabel("Not a valid number.");
                    errorMsg.setBounds(200, 10, 200, 20);
                    main_frame.add(errorMsg);
                }
                main_frame.revalidate();
                main_frame.repaint();

            }
        });


        main_frame.setLayout(null);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setVisible(true);
    }
}