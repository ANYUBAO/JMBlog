package cn.christi.controller;

import cn.christi.entity.Article;
import cn.christi.mapper.ArticleMapper;
import cn.christi.util.GlobalConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 文章信息表 前端控制器
 * </p>
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@RestController
@RequestMapping(GlobalConstant.API_PATH)
public class WebController {

    @Resource
    private ArticleMapper articleMapper;

    @GetMapping
    public List<Article> getList(){
        return articleMapper.selectList(null);
    }

}