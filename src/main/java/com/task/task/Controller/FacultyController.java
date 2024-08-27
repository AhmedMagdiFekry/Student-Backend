package com.task.task.Controller;

import com.task.task.Entity.Faculty;
import com.task.task.Service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/faculties")
public class FacultyController {
    @Autowired
   private FacultyService facultyService;
    @GetMapping
    public List<Faculty> getAllFaculties() {
        return facultyService.getAll();
    }

}
