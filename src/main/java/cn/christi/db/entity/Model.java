package cn.christi.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * @Author: yubao.an
 * @Date: 2023/7/13
 * @Description: 默认
 **/
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Model {

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 创建时间
     */
    private LocalDateTime createBy;

    /**
     * 更新时间
     */
    private LocalDateTime modifiedTime;

    /**
     * 是否有效，默认为0为有效，1为无效
     */
    private Boolean status;


}