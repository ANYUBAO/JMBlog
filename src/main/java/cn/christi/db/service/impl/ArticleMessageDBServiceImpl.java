package cn.christi.db.service.impl;

import cn.christi.db.entity.ArticleMessage;
import cn.christi.db.mapper.ArticleMessageMapper;
import cn.christi.db.service.ArticleMessageDBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章评论关联表 服务实现类
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ArticleMessageDBServiceImpl extends ServiceImpl<ArticleMessageMapper, ArticleMessage> implements ArticleMessageDBService {

}
