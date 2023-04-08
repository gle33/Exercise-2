import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
public class Main{
    public static void main(String[] args){
        
        JFrame main_frame = new JFrame("Celsius to Fahrenheit Converter");
        main_frame.setSize(1000, 500);

        JLabel results = new JLabel("F is equivalent to C");
        results.setBounds(400, 150, 200, 20);
        results.setBackground(Color.GREEN);
        results.setOpaque(true);
        main_frame.add(results);
        results.setVisible(false);

        JLabel errorMsg = new JLabel("Not a valid number.");
        errorMsg.setBounds(400, 150, 200, 20);
        errorMsg.setBackground(Color.RED);
        errorMsg.setOpaque(true);
        main_frame.add(errorMsg);
        errorMsg.setVisible(false);

        JLabel prompt = new JLabel("Enter the temperature in CELSIUS to get the equivalent in FAHRENHEIT:");
        prompt.setBounds(325, 50, 400, 50);
        main_frame.add(prompt);

        JTextField user_input = new JTextField();
        user_input.setBounds(390, 100, 200, 25);
        main_frame.add(user_input);

        JButton convert = new JButton("Convert");
        convert.setBounds(600, 100, 80, 25);
        main_frame.add(convert);
        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String user_input_string = user_input.getText();
                double fahrenheit = 0;
                double celsius = 0;
                try{
                    celsius = Double.parseDouble(user_input_string);
                    fahrenheit = (celsius * 9/5) + 32;
                    results.setText(fahrenheit + " F is equivalent to " + celsius + "C");
                    errorMsg.setVisible(false);
                    results.setVisible(true);
                    
                }
                catch(NumberFormatException err){
                    results.setVisible(false);
                    errorMsg.setVisible(true);
                    
                }
                finally{
                    main_frame.revalidate();
                    main_frame.repaint();
                }
            }
        });
        main_frame.setLayout(null);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setVisible(true);
    }
}