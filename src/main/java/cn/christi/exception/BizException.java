package cn.christi.exception;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.MDC;

/**
 * @Author: yubao.an
 * @Date: 2023/7/15
 * @Description: 自定义业务异常
 **/

@Getter
@Setter
public class BizException extends RuntimeException {

    // 错误码
    private String errorCode;

    // 错误信息
    private String errorMsg;

    // 日志追踪ID
    private String traceId = MDC.get("traceId");

    public BizException(IBaseError errorInfo) {
        super(errorInfo.getErrorMsg());
        this.errorCode = errorInfo.getErrorCode();
        this.errorMsg = errorInfo.getErrorMsg();
    }

    public BizException(IBaseError errorInfo, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorInfo.getErrorCode();
        this.errorMsg = errorMsg;
    }

    public BizException(IBaseError errorInfo, Throwable cause) {
        super(errorInfo.getErrorMsg(), cause);
        this.errorCode = errorInfo.getErrorCode();
        this.errorMsg = errorInfo.getErrorMsg();
    }

    public BizException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(String errorCode, String errorMsg, Throwable cause) {
        super(errorMsg, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
