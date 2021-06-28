package com.hhu.repository;

import com.hhu.domain.Element;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ji Rui
 * @date 2021/6/28 22:04
 */
@Repository
@Mapper
public interface ElementMapper {

    //TODO 完成注解

    void insert(Element element);

    void update(Element element);

    @Select("SELECT * FROM element;")
    List<Element> queryAll();

    @Select("SELECT * FROM element WHERE name = #{name}")
    Element queryByName(String name);

    int delete(String name);
}
