package Threads;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public interface IoUtils {
    public static void storeData(List<Student> students,String filename) throws IOException{
        // FileWriter writer = new FileWriter(filename);
        // for (Student student : students) {
        //     writer.append(student.toString());
        // }
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))){
            for (Student student : students) {
                pw.append(student.toString());
            }
        } catch (Exception e) {
            //TODO: handle exception
            throw new IOException("Error");
        }
    }
}
