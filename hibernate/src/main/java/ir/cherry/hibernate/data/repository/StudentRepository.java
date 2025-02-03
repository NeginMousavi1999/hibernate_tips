package ir.cherry.hibernate.data.repository;

import ir.cherry.hibernate.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Negin Mousavi - 2/2/2025, Sunday
 **/
public interface StudentRepository extends JpaRepository<Student, Long> {
}
