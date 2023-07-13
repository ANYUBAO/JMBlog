package cn.christi.service.impl;

import cn.christi.entity.View;
import cn.christi.mapper.ViewMapper;
import cn.christi.service.IViewService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 浏览量表 服务实现类
 * </p>
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class ViewServiceImpl extends ServiceImpl<ViewMapper, View> implements IViewService {

}
