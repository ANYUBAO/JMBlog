package cn.christi.model.dto;/**
 * @author yubao.an
 */

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yubao.an
 * @Date: 2023/7/20
 * @Description: 分页请求参数
 **/

@Data
@Schema(description = "分页请求参数")
@NoArgsConstructor
@AllArgsConstructor
public class PageQuery {

    @Schema(description = "页数")
    public Integer current = 1;

    @Schema(description = "条数")
    public Integer size = 10;

}
