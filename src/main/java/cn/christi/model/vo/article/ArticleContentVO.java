package cn.christi.model.vo.article;/**
 * @author yubao.an
 */

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @Author: yubao.an
 * @Date: 2023/7/19
 * @Description: 文章详情VO
 **/

@Data
@Schema(description = "文章详情DTO")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArticleContentVO extends ArticleVO{

    private static final long serialVersionUID = 1L;

    /**
     * 文章内容
     */
    @Schema(description = "文章内容")
    private List<String> contents;

    /**
     * 图片url
     */
    @Schema(description = "图片url")
    private String pictureUrl;


}
