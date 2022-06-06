import javax.swing.*;

public class TEst{
    public static void main(String... args){
        JLabel originalString =  new JLabel("Original String: " /*+ str.getMutator()*/);
        JLabel currentString = new JLabel("Current String: "/* + str.getMutator()*/);
        JLabel finalString =  new JLabel("Final String: " /* + str.getTarget()*/);

        JPanel panel = new JPanel();
        panel.add(originalString);
        panel.add(currentString);
        panel.add(finalString);

        JFrame frame = new JFrame("Mutating String!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}