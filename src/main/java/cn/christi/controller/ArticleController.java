package cn.christi.controller;

import cn.christi.db.entity.Article;
import cn.christi.model.dto.PageQuery;
import cn.christi.model.dto.article.ArticleContentDTO;
import cn.christi.model.vo.GeneralResult;
import cn.christi.model.vo.article.ArticleContentVO;
import cn.christi.service.ArticleService;
import cn.christi.util.GlobalConstant;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
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
    private static final Log log = LogFactory.get();

    @Resource
    private ArticleService articleService;

    @GetMapping
    @Operation(summary = "分页")
    public GeneralResult<Page<Article>> page(PageQuery page) {
        return GeneralResult.genSuccessResult(articleService.page(page));
    }

    @GetMapping("/info")
    @Operation(summary = "详情")
    public GeneralResult<ArticleContentVO> info(@RequestParam("id") Long id) {
        return GeneralResult.genSuccessResult(articleService.info(id));
    }

    @PostMapping
    @Operation(summary = "保存")
    public GeneralResult<Long> save(@Valid @RequestBody ArticleContentDTO dto) {
        return GeneralResult.genSuccessResult(articleService.save(dto));
    }

    @PutMapping
    @Operation(summary = "更新")
    public GeneralResult<Long> update(@RequestParam("id") Long id, @Valid @RequestBody ArticleContentDTO dto) {
        return GeneralResult.genSuccessResult(articleService.update(id, dto));
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public GeneralResult<Boolean> delete(@RequestParam("id") Long id) {
        return GeneralResult.genSuccessResult(articleService.delete(id));
    }


}
