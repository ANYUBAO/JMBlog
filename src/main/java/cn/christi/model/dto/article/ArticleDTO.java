package cn.christi.model.dto.article;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: yubao.an
 * @Date: 2023/7/17
 * @Description: 文章信息DTO
 **/


@Data
@SuperBuilder
@Schema(description = "文章信息DTO")
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 文章标题
     */
    @Schema(description = "文章标题")
    @NotBlank(message = "文章标题不能为空")
    private String title;

    /**
     * 文章简介，默认100个汉字以内
     */
    @Size(max = 100, message = "文章简介，最多100个字")
    @Schema(description = "文章简介")
    @NotBlank(message = "文章简介不能为空")
    private String summary;

    /**
     * 文章是否置顶，0为否，1为是
     */
    @Schema(description = "文章是否置顶，0为否，1为是")
    private Boolean top;

}
