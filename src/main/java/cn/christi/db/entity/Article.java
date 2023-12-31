package cn.christi.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

/**
 * 文章信息表
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("blog_article")
public class Article extends Model implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章简介，默认100个汉字以内
     */
    private String summary;

    /**
     * 文章是否置顶，0为否，1为是
     */
    private Boolean top;

    /**
     * 文章访问量
     */
    private Integer traffic;

    /**
     * 乐观锁
     */
    @Version
    private Integer version;


}
