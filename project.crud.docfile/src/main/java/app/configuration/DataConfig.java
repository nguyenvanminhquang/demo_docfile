package app.configuration;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import app.model.Student;
import app.repotisory.StudentRepotisory;


@Configuration
public class DataConfig {
    @Bean
    CommandLineRunner data(StudentRepotisory re) {
        return arg -> {
            Student[] data = {
                    new Student(1, "Nguyen Van A", "nam", 10),
                    new Student(2, "Nguyen Thi B", "nu", 9),
                    new Student(3, "Le Van C", "nam", 5)
            };
            List<Student> dataList = Arrays.asList(data);

            re.saveAll(dataList);
        };
    }
}
