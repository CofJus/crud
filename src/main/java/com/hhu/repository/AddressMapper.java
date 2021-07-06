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

        @Insert("Insert INTO Address (L_name, Install_capacity, Land_area, Alitute,  Latitude,Longitude, Total_solarradiation1, Total_solarradiation2, Radition_angle)" +
                "VALUE(#{lname}, #{installcapacity}, #{landarea}, #{alitute},  #{latitude},#{longitude}, #{totalsolarradiation1}, #{totalsolarradiation2}, #{raditionangle})")
        void insert(Address address);

        @Update("UPDATE Address SET Install_capacity = #{installcapacity},Land_area = #{landarea},Alitute = #{alitute},Latitude = #{latitude},Longitude = #{longitude},Total_solarradiation1 = #{totalsolarradiation1},Total_solarradiation2 = #{totalsolarradiation2},Radition_angle = #{raditionangle} WHERE L_name = #{lname}")
        void update(Address address);

        @Select("SELECT * FROM Address;")
        List<Address> queryAll();

        @Select("SELECT * FROM Address WHERE L_name = #{lname}")
        Address queryBylname(String lname);

        @Delete("DELETE FROM Address WHERE L_name = #{lname}")
        void delete(String lname);


}
