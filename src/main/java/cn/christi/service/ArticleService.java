package cn.christi.service;

import cn.christi.db.entity.Article;
import cn.christi.model.dto.PageQuery;
import cn.christi.model.dto.article.ArticleContentDTO;
import cn.christi.model.vo.article.ArticleContentVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @author yubao.an
 */
public interface ArticleService {

    ArticleContentVO info(Long id);

    Boolean delete(Long id);

    Long save(ArticleContentDTO dto);

    Long update(Long id, ArticleContentDTO dto);

    Page<Article> page(PageQuery page);

}
