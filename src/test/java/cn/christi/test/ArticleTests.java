package cn.christi.test;

import cn.christi.entity.Article;
import cn.christi.mapper.ArticleMapper;
import cn.christi.service.IArticleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: yubao.an
 * @Date: 2023/7/13
 * @Description: 文章测试
 **/

@SpringBootTest
public class ArticleTests {

    @Autowired
    IArticleService articleService;

    @Resource
    ArticleMapper articleMapper;

    @Test
    public void articleTest() {
//        Article article = new Article();
//        article.setSummary("123");
//        article.setTitle("222");
//        article.setTop(true);
//        article.setTraffic(0);
//        article.setVersion(0);
//        System.out.println(article.toString());

//        articleService.save(article);
        List<Article> articles = articleMapper.selectList(null);
        articles.forEach(System.out::println);
    }

    //数据源组件
    @Autowired
    DataSource dataSource;
    //用于访问数据库的组件
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    public void contextLoads() throws SQLException {
        System.out.println("默认数据源为：" + dataSource.getClass());
        System.out.println("数据库连接实例：" + dataSource.getConnection());
        //访问数据库
        Integer i = jdbcTemplate.queryForObject("SELECT count(*) from `blog_article`", Integer.class);
        System.out.println("user 表中共有" + i + "条数据。");
    }
}
