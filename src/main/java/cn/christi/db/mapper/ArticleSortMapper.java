package cn.christi.db.mapper;

import cn.christi.db.entity.ArticleSort;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章分类关联表 Mapper 接口
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Mapper
public interface ArticleSortMapper extends BaseMapper<ArticleSort> {

}
