
package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.College;
import com.tnsif.placementmanagement.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    public void deleteCollege(Long id) {
        collegeRepository.deleteById(id);
    }
}