package cn.christi.db.service.impl;

import cn.christi.db.entity.Article;
import cn.christi.db.mapper.ArticleMapper;
import cn.christi.db.service.ArticleDBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章信息表 服务实现类
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ArticleDBServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleDBService {

}
