package cn.christi.model.dto.article;/**
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
 * @Date: 2023/7/17
 * @Description: 文章详情
 **/
@Data
@Schema(description = "文章信息")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArticleContentDTO extends ArticleDTO {

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
