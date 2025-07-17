package vn.edu.eiu.cse456.service;

import vn.edu.eiu.cse456.entity.School;
import vn.edu.eiu.cse456.repository.SchoolRepo;

import java.util.List;

public class SchoolService {
    public void createSchool(School school) {
        SchoolRepo.save(school);
    }

    public List<School> getAllSchools() {
        return SchoolRepo.findAll();
    }

    public void updateSchool(School school) {
        SchoolRepo.update(school);
    }

    public void deleteSchool(School school) {
        SchoolRepo.delete(school);
    }
}
