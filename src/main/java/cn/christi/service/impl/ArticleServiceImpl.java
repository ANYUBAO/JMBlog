package cn.christi.service.impl;

import cn.christi.db.entity.Article;
import cn.christi.db.service.ArticleDBService;
import cn.christi.model.dto.article.ArticleContentDTO;
import cn.christi.model.vo.article.ArticleContentVO;
import cn.christi.service.ArticleService;
import cn.hutool.core.bean.BeanUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: yubao.an
 * @Date: 2023/7/17
 * @Description: 文章
 **/

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleDBService articleDbService;

    @Override
    public ArticleContentVO info(Long id) {
        Article article = articleDbService.getById(id);
        return BeanUtil.copyProperties(article, ArticleContentVO.class);
    }

    @Override
    public Boolean delete(Long id) {
        return articleDbService.removeById(id);
    }

    @Override
    public Long save(ArticleContentDTO dto) {
        Article article = BeanUtil.copyProperties(dto, Article.class);
        articleDbService.save(article);
        return article.getId();
    }

    @Override
    public Long update(Long id, ArticleContentDTO dto) {
        Article article = BeanUtil.copyProperties(dto, Article.class);
        article.setId(id);
        articleDbService.updateById(article);
        return article.getId();
    }
}
