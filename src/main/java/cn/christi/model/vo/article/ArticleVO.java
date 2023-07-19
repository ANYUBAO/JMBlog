package cn.christi.model.vo.article;/**
 * @author yubao.an
 */

import cn.christi.util.GlobalConstant;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * @Author: yubao.an
 * @Date: 2023/7/19
 * @Description: 文章信息VO
 **/

@Data
@SuperBuilder
@Schema(description = "文章信息DTO")
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVO {

    private static final long serialVersionUID = 1L;

    @Schema(description = "文章id")
    private Long id;

    /**
     * 文章标题
     */
    @Schema(description = "文章标题")
    private String title;

    /**
     * 文章创建时间
     */
    @Schema(description = "文章创建时间")
    @JsonFormat(pattern = GlobalConstant.PATTERN, timezone = GlobalConstant.TIMEZONE)
    private LocalDateTime createTime;

    /**
     * 文章简介，默认100个汉字以内
     */
    @Size(max = 100, message = "文章简介，最多100个字")
    @Schema(description = "文章简介")
    private String summary;

    /**
     * 文章是否置顶，0为否，1为是
     */
    @Schema(description = "文章是否置顶，0为否，1为是")
    private Boolean top;

    /**
     * 文章访问量
     */
    @Schema(description = "文章访问量")
    private Integer traffic;

}
