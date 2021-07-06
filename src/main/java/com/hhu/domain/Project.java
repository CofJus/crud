package com.hhu.domain;


import lombok.Data;

/**
 * @author Fyl
 * @date 2021/7/6
 */
@Data

public class Project {

    private String projectName;//项目名称

    private String projectType;//项目类型

    private String projectStage;//项目阶段

    private String projectOwner;//项目业主

    private String projectGroup;//项目业主所属集团

    private String projectDesignInstitute;//设计单位

    private String projectDate;//日期
}
