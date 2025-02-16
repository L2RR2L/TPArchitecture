package com.directi.training.dip.exercise_refactored;

import com.directi.training.dip.exercise.MyDatabase;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class DatabaseEncoder implements IEncoder {
    public void encode(){
        URL url;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
            InputStream in;
            in = url.openStream();
            InputStreamReader reader = new InputStreamReader(in);
            StringBuilder inputString1 = new StringBuilder();
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
            String inputString = inputString1.toString();
            String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
            MyDatabase database = new MyDatabase();
            database.write(encodedString);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
