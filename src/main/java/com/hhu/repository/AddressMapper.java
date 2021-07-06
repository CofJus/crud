package com.hhu.repository;

import com.hhu.domain.Address;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cjh49
 */
@Repository
@Mapper
public interface AddressMapper {

        @Insert("Insert INTO address (location_name, install_capacity, land_area, alitute,  latitude,longitude, total_solar_radiation1, total_solar_radiation2, radition_angle)" +
                "VALUE(#{locationName}, #{installCapacity}, #{landArea}, #{alitute},  #{latitude},#{longitude}, #{totalSolarRadiation1}, #{totalSolarRadiation2}, #{raditionAngle})")
        void insert(Address address);

        @Update("UPDATE address SET install_capacity = #{installCapacity},land_area = #{landArea},alitute = #{alitute},latitude = #{latitude},longitude = #{longitude},total_solar_radiation1 = #{totalSolarRadiation1},total_solar_radiation2 = #{totalSolarRadiation2},radition_angle = #{raditionAngle} WHERE location_name = #{locationName}")
        void update(Address address);

        @Select("SELECT * FROM address;")
        List<Address> queryAll();

        @Select("SELECT * FROM address WHERE location_name = #{locationName}")
        Address queryBylocationName(String locationName);

        @Delete("DELETE FROM address WHERE location_name = #{locationName}")
        void delete(String locationName);


}
