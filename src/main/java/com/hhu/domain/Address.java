package com.hhu.domain;

import lombok.Data;

/**
 * @author cjh49
 */
@Data
public class Address {
    private String locationName;
    private Double installCapacity;
    private Double landArea;
    private Double alitute;
    private String latitude;
    private String longitude;
    private Double totalSolarRadiation1;
    private Double totalSolarRadiation2;
    private Double raditionAngle;

}
