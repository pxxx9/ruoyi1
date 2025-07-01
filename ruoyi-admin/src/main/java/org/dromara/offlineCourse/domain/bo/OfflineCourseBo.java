package org.dromara.offlineCourse.domain.bo;

import org.dromara.offlineCourse.domain.OfflineCourse;
import org.dromara.common.mybatis.core.domain.BaseEntity;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 线下课程业务对象 edu_offline_course
 *
 * @author Pyx
 * @date 2025-07-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = OfflineCourse.class, reverseConvertGenerate = false)
public class OfflineCourseBo extends BaseEntity {

    /**
     * 课程ID
     */
    private Long id;

    /**
     * 课程名称
     */
    @NotBlank(message = "课程名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String courseName;

    /**
     * 授课时间
     */
    private Date courseTime;

    /**
     * 授课地点
     */
    private String courseLocation;

    /**
     * 指派学员
     */
    private Long studentCount;

    /**
     * 签到人数
     */
    private Long attendanceCount;

    /**
     * 讲师
     */
    private String teacher;

    /**
     * 分类
     */
    private Long categoryId;


}
