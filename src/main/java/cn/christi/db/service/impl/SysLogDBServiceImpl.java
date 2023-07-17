package cn.christi.db.service.impl;

import cn.christi.db.entity.SysLog;
import cn.christi.db.mapper.SysLogMapper;
import cn.christi.db.service.SysLogDBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 操作日志表 服务实现类
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class SysLogDBServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogDBService {

}
