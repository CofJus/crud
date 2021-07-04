package com.hhu.domain;

import lombok.Data;

/**
 * @author Ji Rui
 * @date 2021/6/28 21:59
 */
@Data
public class Element {

    private Long id;

    private String name;

    /**
     * 多年平均气温
     */
    private Double avgTemperature;

    /**
     * 多年极端最低气温
     */
    private Double lowestTemperature;

    /**
     * 多年极端最高气温
     */
    private Double highestTemperature;

    /**
     * 最热月平均气温
     */
    private Double avgTemperatureInHottest;

    /**
     * 多年最大冻土深度
     */
    private Double maxFrozenDepth;

    /**
     * 多年平均风速
     */
    private Double avgWindSpeed;

    /**
     * 多年极大风速
     */
    private Double maxWindSpeed;

    /**
     * 多年平均雷暴日数
     */
    private Double avgThunderstorm;

    /**
     * 污秽等级
     */
    private String pollutionGrade;
}
