package vn.edu.eiu.cse456.service;

import vn.edu.eiu.cse456.entity.Student;
import vn.edu.eiu.cse456.repository.StudentRepo;

import java.util.List;

public class StudentService {
    public void createStudent(Student student) {
        StudentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return StudentRepo.findAll();
    }

    public void updateStudent(Student student) {
        StudentRepo.update(student);
    }

    public void deleteStudent(Student student) {
        StudentRepo.delete(student);
    }
}
