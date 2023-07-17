package cn.christi.controller;

import cn.christi.entity.ArticlePicture;
import cn.christi.model.vo.GeneralResult;
import cn.christi.service.IArticlePictureService;
import cn.christi.util.GlobalConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章题图 前端控制器
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@RestController
@RequestMapping(GlobalConstant.API_PATH + "/picture")
@Api("文章题图")
public class ArticlePictureController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticlePictureController.class);

    @Autowired
    private IArticlePictureService articlePictureService;


    @GetMapping
    @ApiOperation("分页")
    public GeneralResult<ArticlePicture> page(){
        return GeneralResult.genSuccessResult(new ArticlePicture());
    }

    @GetMapping("/info")
    @ApiOperation("详情")
    public GeneralResult<ArticlePicture> info(@RequestParam("id") Integer id){
        return GeneralResult.genSuccessResult(articlePictureService.getById(id));
    }

    @PostMapping
    @ApiOperation("保存")
    public GeneralResult<Void> save(){
        return GeneralResult.genSuccessResult();
    }

    @PutMapping
    @ApiOperation("更新")
    public GeneralResult<Void> update(){
        return GeneralResult.genSuccessResult();
    }

    @DeleteMapping
    @ApiOperation("删除")
    public GeneralResult<Void> delete(){
        return GeneralResult.genSuccessResult();
    }

}
