package cn.christi.service.impl;

import cn.christi.entity.ArticleContent;
import cn.christi.mapper.ArticleContentMapper;
import cn.christi.service.IArticleContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章内容表 服务实现类
 * </p>
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ArticleContentServiceImpl extends ServiceImpl<ArticleContentMapper, ArticleContent> implements IArticleContentService {

}
