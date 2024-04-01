import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.*;

public class CopyFile {
    public void CopyToUploadSQL(String filePath) {
        filePath.replace("\\", "\\\\");
        File sourceFile = new File(filePath);
        System.out.println((sourceFile.getAbsolutePath()).replace("\\", "\\\\"));
        File destinationFolder = new File("C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads");

        // Create the destination folder if it doesn't exist
        if (!destinationFolder.exists()) {
            destinationFolder.mkdirs(); // creates parent directories if needed
        }

        File destinationFile = new File(destinationFolder, sourceFile.getName());

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

