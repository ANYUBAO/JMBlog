package cn.christi.db.mapper;

import cn.christi.db.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章信息表 Mapper 接口
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
