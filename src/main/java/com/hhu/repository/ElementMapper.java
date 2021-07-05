package com.hhu.repository;

import com.hhu.domain.Element;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ji Rui
 * @date 2021/6/28 22:04
 */
@Repository
@Mapper
public interface ElementMapper {

    @Insert("Insert INTO element (name, avg_temperature, lowest_temperature, highest_temperature, avg_temperature_in_hottest, max_frozen_depth, avg_wind_speed, max_wind_speed, avg_thunderstorm, pollution_grade)" +
            "VALUE(#{name}, #{avgTemperature}, #{lowestTemperature}, #{highestTemperature}, #{avgTemperatureInHottest}, #{maxFrozenDepth}, #{avgWindSpeed}, #{maxWindSpeed}, #{avgThunderstorm}, #{pollutionGrade})")
    void insert(Element element);

    @Update("UPDATE element SET avg_temperature = #{avgTemperature},lowest_temperature = #{lowestTemperature},highest_temperature = #{highestTemperature},avg_temperature_in_hottest = #{avgTemperatureInHottest},max_frozen_depth = #{maxFrozenDepth},avg_wind_speed = #{avgWindSpeed},max_wind_speed = #{maxWindSpeed},avg_thunderstorm = #{avgThunderstorm},pollution_grade = #{pollutionGrade} WHERE name = #{name}")
    void update(Element element);

    @Select("SELECT * FROM element;")
    List<Element> queryAll();

    @Select("SELECT * FROM element WHERE name = #{name}")
    Element queryByName(String name);

    @Delete("DELETE FROM element WHERE name = #{name}")
    void delete(String name);
}
