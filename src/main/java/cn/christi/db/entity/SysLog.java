package cn.christi.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

/**
 * 操作日志表
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("blog_log")
public class SysLog extends Model implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 操作地址的IP
     */
    private String ip;

    /**
     * 操作内容
     */
    private String remark;

    /**
     * 操作的访问地址
     */
    private String operateUrl;

    /**
     * 操作的浏览器
     */
    private String operateBy;


}
