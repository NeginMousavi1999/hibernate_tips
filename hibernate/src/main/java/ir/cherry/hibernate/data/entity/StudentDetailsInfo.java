package ir.cherry.hibernate.data.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * @author : Negin Mousavi - 2/3/2025, Monday
 **/
@Entity
@Setter
@Getter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDetailsInfo {
    @Id
    @Column(name = "student_id")
    Long id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "student_id")
    Student student;

    String address;

    String birthDate;

    public StudentDetailsInfo(Student student, String address, String birthDate) {
        this.student = student;
        this.address = address;
        this.birthDate = birthDate;
    }
}
