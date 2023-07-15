package cn.christi.exception.errorEnum;

import cn.christi.exception.IBaseError;
import lombok.Getter;

/**
 * @author yubao.an
 */

@Getter
public enum ServiceErrorEnum implements IBaseError {

    /**
     * 文章不存在
     */
    USER_NOT_FOUND("1001", "文章不存在!");

    private final String errorCode;

    private final String errorMsg;

    ServiceErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
