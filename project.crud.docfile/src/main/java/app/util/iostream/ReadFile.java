package app.util.iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import app.model.Student;

@Component
public class ReadFile {
    public void readFile(List<Student> list, File file) {
        System.out.println("readfile");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                Student student = new Student();
                student.setName(arr[0]);
                student.setGender(arr[1]);
                student.setPoint(Integer.parseInt(arr[2]));
                list.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
