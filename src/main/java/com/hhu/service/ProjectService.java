package com.hhu.service;

import com.hhu.domain.Project;

import java.util.List;

/**
 * @author Ji Rui
 * @date 2021/6/28 22:33
 */
public interface ProjectService {

    void add(Project project);

    void update(Project project);

    List<Project> getAll();

    Project getProjectByName(String projectName);

    void deleteByName(String projectName);
}
