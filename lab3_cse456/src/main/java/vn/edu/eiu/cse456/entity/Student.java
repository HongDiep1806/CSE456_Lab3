package vn.edu.eiu.cse456.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentId")
    private int studentId;
    @Column(name = "FullName", columnDefinition = "VARCHAR(100)", nullable = false)
    private String fullName;
    @Column(name = "Gender", nullable = false)
    private Gender gender;
    @Column(name = "Date of Birth", nullable = false)
    private LocalDate dob;
    @Column(name = "Gpa")
    private double gpa;
    @Column(name = "EnrollmentYear", nullable = false)
    private int enrollmentYear;
    @ManyToOne
    @JoinColumn(name = "MajorId")
    private Major major;

    public Student(String fullName, Gender gender, LocalDate dob, double gpa, int enrollmentYear) {
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.gpa = gpa;
        this.enrollmentYear = enrollmentYear;
    }
}
