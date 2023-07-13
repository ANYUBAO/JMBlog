package cn.christi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * <p>
 * 评论/留言表
 * </p>
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("blog_message")
public class Message extends Model implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 留言/评论内容
     */
    private String content;

    /**
     * 邮箱，用于回复消息
     */
    private String email;

    /**
     * 用户自己定义的名称
     */
    private String name;

    /**
     * 留言/评论IP
     */
    private String ip;


}
