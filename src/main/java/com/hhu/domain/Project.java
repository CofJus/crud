package com.hhu.domain;


import lombok.Data;

/**
 * @author Fyl
 * @date 2021/7/6
 */
@Data

public class Project {

    private String pname;//项目名称

    private String ptype;//项目类型

    private String pstage;//项目阶段

    private String powner;//项目业主

    private String pgroup;//项目业主所属集团

    private String pdesigninstitute;//设计单位

    private String pdate;//日期
}
