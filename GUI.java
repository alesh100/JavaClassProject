import javax.swing.*;

public class GUI {
    public static void main (String [] args){
        String name = JOptionPane.showInputDialog("what is your name");
        JOptionPane.showInputDialog(null, "hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age"));
        JOptionPane.showInputDialog(null, "you are " + age + " years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("what is your height"));
        JOptionPane.showInputDialog(null, "I'm  " + height + " cm");
    }
}
