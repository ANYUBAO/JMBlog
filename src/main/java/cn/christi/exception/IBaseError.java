package cn.christi.exception;

/**
 * @author yubao.an
 */
public interface IBaseError {

    /**
     * 获取错误码
     *
     * @return 错误码
     */
    String getErrorCode();

    /**
     * 获取错误信息
     *
     * @return 错误信息
     */
    String getErrorMsg();
}
