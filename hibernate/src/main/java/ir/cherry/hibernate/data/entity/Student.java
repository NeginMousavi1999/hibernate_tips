package ir.cherry.hibernate.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author : Negin Mousavi - 2/2/2025, Sunday
 **/
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student extends BaseEntity {

    private String name;

    private int term;

    private float grade;

    @OneToMany(mappedBy = "student")
    List<Exam> exams;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    StudentDetailsInfo info;

    public Student(String name, int term, float grade) {
        this.name = name;
        this.term = term;
        this.grade = grade;
    }
}
