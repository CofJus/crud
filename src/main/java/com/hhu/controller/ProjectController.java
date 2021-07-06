package com.hhu.controller;

import com.hhu.domain.Project;
import com.hhu.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fyl  
 * @date 2021/7/6 
 */

@RestController
@RequestMapping("/project")

@Slf4j
public class ProjectController {


    @Autowired
    private ProjectService projectService;

    @PostMapping("/add")
    public void add(@RequestBody Project project) {
        projectService.add(project);
    }

    @PostMapping("/update")
    public void update(@RequestBody Project project) {
        projectService.update(project);
    }

    @GetMapping("/delete/{pname}")
    public void delete(@PathVariable String pname) {
        projectService.deleteByName(pname);
    }

    @GetMapping("/getAll")
    public List<Project> getAll() {
        List<Project> list = projectService.getAll();
        list.forEach(System.out::println);
        return list;
    }

    @GetMapping("/getProjectByName/{pname}")
    public Project getProjectByName(@PathVariable String pname) {
        return projectService.getProjectByName(pname);
    }
}
