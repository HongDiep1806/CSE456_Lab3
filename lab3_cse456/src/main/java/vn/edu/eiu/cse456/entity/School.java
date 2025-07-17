package vn.edu.eiu.cse456.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class School {
    @Id
    @Column(name = "SchoolId", columnDefinition = "CHAR(3)")
    private String schoolId;
    @Column(name = "SchoolName", nullable = false, columnDefinition = "VARCHAR(100)")
    private String schoolName;
    @Column(name = "Location", nullable = true, columnDefinition = "VARCHAR(100)")
    private String location;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "school")
    List<Major> majors = new ArrayList<>();
    public void addMajor(Major major){
        majors.add(major);
        major.setSchool(this);
    }
    public School(String schoolId, String schoolName, String location) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.location = location;
    }

}
