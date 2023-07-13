package cn.christi.service.impl;

import cn.christi.entity.ArticleMessage;
import cn.christi.mapper.ArticleMessageMapper;
import cn.christi.service.IArticleMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章评论关联表 服务实现类
 * </p>
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ArticleMessageServiceImpl extends ServiceImpl<ArticleMessageMapper, ArticleMessage> implements IArticleMessageService {

}
