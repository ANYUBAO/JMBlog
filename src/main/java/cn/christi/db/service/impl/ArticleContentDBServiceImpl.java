package cn.christi.db.service.impl;

import cn.christi.db.entity.ArticleContent;
import cn.christi.db.mapper.ArticleContentMapper;
import cn.christi.db.service.ArticleContentDBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章内容表 服务实现类
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ArticleContentDBServiceImpl extends ServiceImpl<ArticleContentMapper, ArticleContent> implements ArticleContentDBService {

}
