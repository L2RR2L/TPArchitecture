package com.directi.training.dip.exercise_refactored;

import java.io.*;
import java.util.Base64;

public class FileEncoder implements IEncoder {
    public void encode()
    {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                    new FileReader("DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt"));
            writer = new BufferedWriter(
                    new FileWriter("DIP/src/com/directi/training/dip/exercise_refactored/afterEncryption.txt"));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
