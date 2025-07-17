package vn.edu.eiu.cse456.service;

import vn.edu.eiu.cse456.entity.Major;
import vn.edu.eiu.cse456.repository.MajorRepo;

import java.util.List;

public class MajorService {
    public void createMajor(Major major) {
        MajorRepo.save(major);
    }

    public List<Major> getAllMajor() {
        return MajorRepo.findAll();
    }

    public void updateMajor(Major major) {
        MajorRepo.update(major);
    }

    public void deleteMajor(Major major) {
        MajorRepo.delete(major);
    }
}
