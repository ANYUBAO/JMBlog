package cn.christi.controller;

import cn.christi.entity.Article;
import cn.christi.mapper.ArticleMapper;
import cn.christi.util.GlobalConstant;
import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.ArrayList;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);

    @Resource
    private ArticleMapper articleMapper;

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping
    public List<Article> getList() {
        List<Article> articles = new ArrayList<>();
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("titlee", "1");
        return articleMapper.selectList(queryWrapper);
    }

    @GetMapping("/null")
    public int getNull() {
        String a = null;
        int b = a.length();
        return b;
    }

    @GetMapping("/druid/stat")
    public Object druidStat() {
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
