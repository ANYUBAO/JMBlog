package cn.christi.service.impl;

import cn.christi.entity.Message;
import cn.christi.mapper.MessageMapper;
import cn.christi.service.IMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论/留言表 服务实现类
 * </p>
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
