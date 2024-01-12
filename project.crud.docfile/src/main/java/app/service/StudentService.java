package app.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Student;
import app.repotisory.StudentRepotisory;
import app.util.iostream.ReadFile;

@Service
public class StudentService {

    @Autowired
    StudentRepotisory re;

    @Autowired
    ReadFile iO;

    public List<Student> getAll() {
        return re.findAll();
    }

    public boolean save(File file) {
        List<Student> list = new ArrayList<>();
        // Goi io de doc file
        iO.readFile(list, file);
        if (list.isEmpty()) {
            return false;
        }
        re.saveAll(list);
        return true;
    }

    public void remove(Student student) {
        re.delete(student);
    }

    public void update(List<Student> students) {
        re.saveAll(students);
    }
}
