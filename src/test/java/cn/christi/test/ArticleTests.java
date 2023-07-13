package cn.christi.test;

import cn.christi.entity.Article;
import cn.christi.mapper.ArticleMapper;
import cn.christi.service.IArticleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
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
}
