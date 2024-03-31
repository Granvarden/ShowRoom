import javax.swing.*;
import java.io.File;

public class TestBlob {
    public static void main(String[] args) {
        File selectedFile;
        JFrame frame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        
        int result = fileChooser.showOpenDialog(frame);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No file selected.");
        }
        File sourceFile = selectedFile;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}