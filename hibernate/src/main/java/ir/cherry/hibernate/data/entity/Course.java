package ir.cherry.hibernate.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Course extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "course")
    List<Exam> exams;

    public Course(String name) {
        this.name = name;
    }
}
