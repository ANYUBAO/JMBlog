package cn.christi.db.mapper;

import cn.christi.db.entity.Message;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论/留言表 Mapper 接口
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@Mapper
public interface CommentMapper extends BaseMapper<Message> {

}
