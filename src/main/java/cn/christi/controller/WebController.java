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
        queryWrapper.like("title", "1");
        return articleMapper.selectList(queryWrapper);
    }

    @GetMapping("/druid/stat")
    public Object druidStat() {
        // DruidStatManagerFacade#getDataSourceStatDataList 该方法可以获取所有数据源的监控数据，除此之外 DruidStatManagerFacade 还提供了一些其他方法，你可以按需选择使用。
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
