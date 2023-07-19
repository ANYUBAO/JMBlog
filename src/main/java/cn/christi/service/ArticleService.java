package cn.christi.service;

import cn.christi.model.dto.article.ArticleContentDTO;
import cn.christi.model.vo.article.ArticleContentVO;

/**
 * @author yubao.an
 */
public interface ArticleService {

    ArticleContentVO info(Long id);

    Boolean delete(Long id);

    Long save(ArticleContentDTO dto);

    Long update(Long id, ArticleContentDTO dto);

}
