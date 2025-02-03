package ir.cherry.hibernate.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

/**
 * @author : Negin Mousavi - 2/2/2025, Sunday
 **/
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Exam {

    @EmbeddedId
    CompositeKeySC compositeKeySC;

    @MapsId("studentId")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @MapsId("courseId")
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @CreationTimestamp
    Date date;

    int grade;

    public Exam(CompositeKeySC compositeKeySC, Student student, Course course, int grade) {
        this.compositeKeySC = compositeKeySC;
        this.student = student;
        this.course = course;
        this.grade = grade;
    }
}
