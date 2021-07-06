package com.hhu.repository;

import com.hhu.domain.Project;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fyl
 * @date 2021/7/6 
 */
@Repository
@Mapper
public interface ProjectMapper {

    @Insert("Insert INTO project (project_name, project_type, project_stage, project_owner, project_group, project_design_institute, project_date)" +
            "VALUE(#{projectName}, #{projectType}, #{projectStage}, #{projectOwner}, #{projectGroup}, #{projectDesignInstitute}, #{projectDate})")
    void insert(Project project);

    @Update("UPDATE project SET project_type = #{projectType},project_stage = #{projectStage},project_owner = #{projectOwner},project_group = #{projectGroup},project_design_institute = #{projectDesignInstitute},project_date = #{projectDate} WHERE project_name = #{projectName}")
    void update(Project project);

    @Select("SELECT * FROM project;")
    List<Project> queryAll();

    @Select("SELECT * FROM project WHERE project_name = #{projectName}")
    Project queryByName(String projectName);

    @Delete("DELETE FROM project WHERE project_name = #{projectName}")
    void delete(String projectName);
}
