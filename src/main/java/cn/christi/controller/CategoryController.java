package cn.christi.controller;

import cn.christi.db.entity.Category;
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
 * 分类 前端控制器
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@RestController
@RequestMapping(GlobalConstant.API_PATH + "/category")
@Tag(name = "分类")
public class CategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);


    @GetMapping
    @Operation(summary = "分页")
    public GeneralResult<Category> page() {
        return GeneralResult.genSuccessResult(new Category());
    }

    @GetMapping("/info")
    @Operation(summary = "详情")
    public GeneralResult<Category> info(@RequestParam("id") Integer id) {
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
