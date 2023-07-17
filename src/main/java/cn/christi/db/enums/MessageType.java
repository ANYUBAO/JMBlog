package cn.christi.db.enums;

import lombok.Getter;

/**
 * @author yubao.an
 */

@Getter
public enum MessageType {

    MESSAGE("留言"),

    REMARK("评论"),

    ;

    private final String value;

    MessageType(String value) {
        this.value = value;
    }

}
