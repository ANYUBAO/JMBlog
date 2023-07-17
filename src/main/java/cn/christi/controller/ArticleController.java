package cn.christi.controller;

import cn.christi.db.entity.Article;
import cn.christi.model.dto.article.ArticleContentDTO;
import cn.christi.model.vo.GeneralResult;
import cn.christi.util.GlobalConstant;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章信息 前端控制器
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@RestController
@RequestMapping(GlobalConstant.API_PATH + "/article")
@Tag(name = "文章信息")
public class ArticleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleController.class);


    @GetMapping
    @Operation(summary = "分页")
    public GeneralResult<Article> page() {
        return GeneralResult.genSuccessResult(new Article());
    }

    @GetMapping("/info")
    @Operation(summary = "详情")
    public GeneralResult<Article> info(@RequestParam("id") Integer id) {
        return GeneralResult.genSuccessResult();
    }

    @PostMapping
    @Operation(summary = "保存")
    public GeneralResult<Void> save(@RequestBody ArticleContentDTO dto) {
        return GeneralResult.genSuccessResult();
    }

    @PutMapping
    @Operation(summary = "更新")
    public GeneralResult<Void> update(@RequestBody ArticleContentDTO dto) {
        return GeneralResult.genSuccessResult();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public GeneralResult<Void> delete(@RequestParam("id") Integer id) {
        return GeneralResult.genSuccessResult();
    }


}
