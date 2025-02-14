package ir.cherry.hibernate.data.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

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

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "student_fav_numbers")
    @Column(name = "number")
    List<Integer> favNumbers;

    public StudentDetailsInfo(Student student, String address, String birthDate, List<Integer> favNumbers) {
        this.student = student;
        this.address = address;
        this.birthDate = birthDate;
        this.favNumbers = favNumbers;
    }
}
