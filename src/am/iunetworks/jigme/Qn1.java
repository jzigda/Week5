package am.iunetworks.jigme;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Qn1 {
    public static void main(String[] args) {
        BufferedReader read = null;
        BufferedWriter writer = null;

        ArrayList<String> details = new ArrayList<String>();
        try {
            read = new BufferedReader(new FileReader("/home/jigs/IdeaProjects/Week5/src/am/iunetworks/jigme/input.txt"));
            String currentLine = read.readLine();
            while (currentLine != null) {
                details.add(currentLine);
                currentLine = read.readLine();
            }
            Collections.sort(details);//sorting ArrayList
            read.close();

            writer = new BufferedWriter(new FileWriter("/home/jigs/IdeaProjects/Week5/src/am/iunetworks/jigme/output.txt"));
            //Writing sorted into output file
            for (String line : details) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
