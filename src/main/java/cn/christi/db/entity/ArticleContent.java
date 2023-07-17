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
 * 文章内容表
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("blog_article_content")
public class ArticleContent extends Model implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 对应文章ID
     */
    private Long articleId;

    /**
     * 乐观锁
     */
    @Version
    private Integer version;

}
