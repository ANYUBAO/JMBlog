package cn.christi.service.impl;

import cn.christi.entity.ArticleSort;
import cn.christi.mapper.ArticleSortMapper;
import cn.christi.service.IArticleSortService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章分类关联表 服务实现类
 * </p>
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ArticleSortServiceImpl extends ServiceImpl<ArticleSortMapper, ArticleSort> implements IArticleSortService {

}
