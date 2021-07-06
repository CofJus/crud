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

    @Insert("Insert INTO project (p_name, p_type, p_stage, p_owner, p_group, p_design_institute, p_date)" +
            "VALUE(#{pname}, #{ptype}, #{pstage}, #{powner}, #{pgroup}, #{pdesigninstitute}, #{pdate})")
    void insert(Project project);

    @Update("UPDATE project SET p_type = #{ptype},p_stage = #{pstage},p_owner = #{powner},p_group = #{pgroup},p_design_institute = #{pdesigninstitute},p_date = #{pdate} WHERE p_name = #{pname}")
    void update(Project project);

    @Select("SELECT * FROM project;")
    List<Project> queryAll();

    @Select("SELECT * FROM project WHERE p_name = #{pname}")
    Project queryByName(String pname);

    @Delete("DELETE FROM project WHERE p_name = #{pname}")
    void delete(String pname);
}
