package com.hhu.service.impl;

import com.hhu.domain.Project;

import com.hhu.repository.ProjectMapper;

import com.hhu.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ji Rui
 * @date 2021/6/28 22:37
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    public void add(Project project) {
        projectMapper.insert(project);
    }

    public void update(Project project) {
        projectMapper.update(project);
    }

    public List<Project> getAll() {
        return projectMapper.queryAll();
    }

    public Project getProjectByName(String pname) {
        return projectMapper.queryByName(pname);
    }

    public void deleteByName(String pname) {
        projectMapper.delete(pname);
    }
}
