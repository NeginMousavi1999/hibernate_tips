package ir.cherry.hibernate.data.repository;

import ir.cherry.hibernate.data.entity.Course;
import ir.cherry.hibernate.data.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Negin Mousavi - 2/2/2025, Sunday
 **/
public interface CourseRepository extends JpaRepository<Course, Long> {
}
