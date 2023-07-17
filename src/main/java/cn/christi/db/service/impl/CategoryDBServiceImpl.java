package cn.christi.db.service.impl;

import cn.christi.db.entity.Category;
import cn.christi.db.mapper.CategoryMapper;
import cn.christi.db.service.CategoryDBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 分类表 服务实现类
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class CategoryDBServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryDBService {

}
