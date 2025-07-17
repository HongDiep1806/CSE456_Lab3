package vn.edu.eiu.cse456.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Major {
    @Id
    @Column(name = "MajorId", columnDefinition = "CHAR(4)")
    private String majorId;
    @Column(name = "MajorName", columnDefinition = "VARCHAR(100)", nullable = false)
    private String majorName;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SchoolId")
    private School school;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "major")
    private List<Student> students = new ArrayList<>();
    public Major(String majorId, String majorName) {
        this.majorId = majorId;
        this.majorName = majorName;

    }
    public void addStudent(Student student) {
        students.add(student);
        student.setMajor(this);
    }
}
