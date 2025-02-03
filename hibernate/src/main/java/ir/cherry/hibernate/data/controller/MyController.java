package ir.cherry.hibernate.data.controller;

import ir.cherry.hibernate.data.entity.*;
import ir.cherry.hibernate.data.repository.CourseRepository;
import ir.cherry.hibernate.data.repository.ExamRepository;
import ir.cherry.hibernate.data.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Negin Mousavi - 2/2/2025, Sunday
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class MyController {
    private final ExamRepository examRepository;
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    @GetMapping("grade")
    public ResponseEntity<Integer> getGrade() {
        Student negin = new Student(
                "negin",
                4,
                19.8f
        );
        negin.setInfo(
                new StudentDetailsInfo(
                        negin,
                        "تهران تهران",
                        "1377/12/08"
                )
        );
        negin = studentRepository.saveAndFlush(
                negin
        );
        Course math = new Course("math");
        math = courseRepository.saveAndFlush(
                math
        );


        CompositeKeySC id = new CompositeKeySC(
                negin.getId(),
                math.getId()
        );

        examRepository.save(
                new Exam(
                        id,
                        negin,
                        math,
                        20
                )
        );

        return ResponseEntity.ok(20);
    }
}
