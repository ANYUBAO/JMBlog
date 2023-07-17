package cn.christi.model.dto.article;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * @Author: yubao.an
 * @Date: 2023/7/17
 * @Description: 文章信息
 **/


@Data
@ApiModel("文章信息")
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO {

    private static final long serialVersionUID = 1L;

    /**
     * 文章标题
     */
    @ApiModelProperty("文章标题")
    private String title;

    /**
     * 文章简介，默认100个汉字以内
     */
    @Size(max = 100, message = "文章简介，最多100个字")
    @ApiModelProperty("文章简介")
    private String summary;

    /**
     * 文章是否置顶，0为否，1为是
     */
    @ApiModelProperty("文章是否置顶，0为否，1为是")
    private Boolean top;

    /**
     * 文章访问量
     */
    @ApiModelProperty("文章访问量")
    private Integer traffic;

    /**
     * 文章内容
     */
    @ApiModelProperty("文章内容")
    private List<String> contents;

}
