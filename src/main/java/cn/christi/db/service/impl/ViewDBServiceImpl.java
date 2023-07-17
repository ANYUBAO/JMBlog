package cn.christi.db.service.impl;

import cn.christi.db.entity.View;
import cn.christi.db.mapper.ViewMapper;
import cn.christi.db.service.ViewDBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 浏览量表 服务实现类
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ViewDBServiceImpl extends ServiceImpl<ViewMapper, View> implements ViewDBService {

}
