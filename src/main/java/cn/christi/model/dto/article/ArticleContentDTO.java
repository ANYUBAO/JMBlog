package cn.christi.model.dto.article;/**
 * @author yubao.an
 */

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


/**
 * @Author: yubao.an
 * @Date: 2023/7/17
 * @Description: 文章详情DTO
 **/
@Data
@Schema(description = "文章详情DTO")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArticleContentDTO extends ArticleDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 文章内容
     */
    @Schema(description = "文章内容")
    @NotEmpty(message = "文章内容不能为空")
    private List<String> contents;

    /**
     * 图片url
     */
    @Schema(description = "图片url")
    @NotBlank(message = "图片url不能为空")
    private String pictureUrl;

}
