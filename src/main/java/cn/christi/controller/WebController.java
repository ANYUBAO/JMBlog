package cn.christi.controller;

import cn.christi.db.entity.Article;
import cn.christi.db.mapper.ArticleMapper;
import cn.christi.util.GlobalConstant;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 公共访问 前端控制器
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@RestController
@RequestMapping(GlobalConstant.API_OPEN_PATH)
@Tag(name = "公共访问")
public class WebController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);

    @Resource
    private ArticleMapper articleMapper;

    @GetMapping
    public List<Article> getList() {
        List<Article> articles = new ArrayList<>();
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("titlee", "1");
        return articleMapper.selectList(queryWrapper);
    }

    @GetMapping("/cc")
    public int getNull() {
        String a = null;
        int b = a.length();
        return b;
    }


}
