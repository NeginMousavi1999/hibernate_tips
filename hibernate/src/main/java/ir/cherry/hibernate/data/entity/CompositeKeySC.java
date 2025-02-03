package ir.cherry.hibernate.data.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;


/**
 * @author : Negin Mousavi - 2/2/2025, Sunday
 **/
@Embeddable
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CompositeKeySC implements Serializable {
    private Long studentId;
    private Long courseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKeySC compositeKeySC = (CompositeKeySC) o;
        return Objects.equals(studentId, compositeKeySC.studentId) && Objects.equals(courseId, compositeKeySC.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseId);
    }
}
