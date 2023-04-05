import javax.swing.*;
public class Main{
    public static void main(String[] args){
        JFrame main_frame = new JFrame("Exercise 2 - Celsius to Fahrenheit converter");
        main_frame.setSize(1000, 500);

        JTextField user_input = new JTextField();
        user_input.setBounds(500, 100, 200, 25);
        main_frame.add(user_input);




        main_frame.setLayout(null);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setVisible(true);
    }
}