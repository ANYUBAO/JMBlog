package cn.christi.db.mapper;

import cn.christi.db.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分类表 Mapper 接口
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
