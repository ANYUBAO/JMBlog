package cn.christi.controller;

import cn.christi.entity.Comment;
import cn.christi.model.vo.GeneralResult;
import cn.christi.service.ICommentService;
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
 * 评论/留言 前端控制器
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@RestController
@RequestMapping(GlobalConstant.API_PATH + "/comment")
@Api("评论/留言")
public class CommentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);

    @Autowired
    private ICommentService commentService;


    @GetMapping
    @ApiOperation("分页")
    public GeneralResult<Comment> page(){
        return GeneralResult.genSuccessResult(new Comment());
    }

    @GetMapping("/info")
    @ApiOperation("详情")
    public GeneralResult<Comment> info(@RequestParam("id") Integer id){
        return GeneralResult.genSuccessResult(commentService.getById(id));
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
