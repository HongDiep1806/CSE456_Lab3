package vn.edu.eiu.cse456;

import jakarta.persistence.EntityManager;
import vn.edu.eiu.cse456.entity.Gender;
import vn.edu.eiu.cse456.entity.Major;
import vn.edu.eiu.cse456.entity.School;
import vn.edu.eiu.cse456.entity.Student;
import vn.edu.eiu.cse456.infra.JpaUtil;
import vn.edu.eiu.cse456.service.MajorService;
import vn.edu.eiu.cse456.service.SchoolService;
import vn.edu.eiu.cse456.service.StudentService;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        School school = new School("BBS", "Business","BD" );
        Major cse = new Major("CSE", "Software");
        Major csq = new Major("CSA", "Data");
        school.addMajor(cse);
        school.addMajor(csq);
        Student st1 = new Student("Diep Tu", Gender.FEMALE, LocalDate.parse("2003-06-18"),3.2, 2021);
        Student st2 = new Student("Nhi Truong", Gender.FEMALE, LocalDate.parse("2003-06-18"),3.2, 2021);
        cse.addStudent(st1);
        csq.addStudent(st2);

        SchoolService schoolService = new SchoolService();
        schoolService.createSchool(school);

    }
}