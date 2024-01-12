package app.repotisory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.model.Student;

@Repository
public interface StudentRepotisory extends JpaRepository<Student, Long> {

}
