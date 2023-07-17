package cn.christi.controller;

import cn.christi.db.entity.ArticleMessage;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章评论 前端控制器
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@RestController
@RequestMapping(GlobalConstant.API_PATH + "/message")
@Tag(name = "文章评论")
public class ArticleMessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleMessageController.class);


    @GetMapping
    @Operation(summary = "分页")
    public GeneralResult<ArticleMessage> page() {
        return GeneralResult.genSuccessResult(new ArticleMessage());
    }

    @GetMapping("/info")
    @Operation(summary = "详情")
    public GeneralResult<ArticleMessage> info(@RequestParam("id") Integer id) {
        return GeneralResult.genSuccessResult();
    }

    @PostMapping
    @Operation(summary = "保存")
    public GeneralResult<Void> save() {
        return GeneralResult.genSuccessResult();
    }

    @PutMapping
    @Operation(summary = "更新")
    public GeneralResult<Void> update() {
        return GeneralResult.genSuccessResult();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    public GeneralResult<Void> delete() {
        return GeneralResult.genSuccessResult();
    }

}
