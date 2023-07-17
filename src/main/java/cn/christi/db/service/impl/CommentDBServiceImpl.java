package cn.christi.db.service.impl;

import cn.christi.db.entity.Message;
import cn.christi.db.mapper.CommentMapper;
import cn.christi.db.service.CommentDBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 评论/留言表 服务实现类
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Service
public class CommentDBServiceImpl extends ServiceImpl<CommentMapper, Message> implements CommentDBService {

}
