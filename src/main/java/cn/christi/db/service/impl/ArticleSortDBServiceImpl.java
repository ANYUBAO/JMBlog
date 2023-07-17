package cn.christi.db.service.impl;

import cn.christi.db.entity.ArticleSort;
import cn.christi.db.mapper.ArticleSortMapper;
import cn.christi.db.service.ArticleSortDBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章分类关联表 服务实现类
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ArticleSortDBServiceImpl extends ServiceImpl<ArticleSortMapper, ArticleSort> implements ArticleSortDBService {

}
