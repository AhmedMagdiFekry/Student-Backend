package com.task.task.Service;

import com.task.task.Entity.Faculty;
import com.task.task.Repository.FacultyRepository;
import com.task.task.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public List<Faculty> getAll(){
        return facultyRepository.findAll();
    }
}
