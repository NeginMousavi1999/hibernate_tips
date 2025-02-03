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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "course")
    List<Exam> exams;

    public Course(String name) {
        this.name = name;
    }
}
