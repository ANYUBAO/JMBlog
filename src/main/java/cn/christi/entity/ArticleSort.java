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
 * 文章分类关联表
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
@TableName("blog_article_sort")
public class ArticleSort extends Model implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    private Long sortId;

    /**
     * 文章id
     */
    private Long articleId;


}
