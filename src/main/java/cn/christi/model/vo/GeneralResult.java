package cn.christi.model.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: yubao.an
 * @Date: 2023/7/15
 * @Description: 统一返回格式
 **/

@Setter
@Getter
public class GeneralResult<T> {

    private boolean success;

    private String errorCode;

    private String message;

    private T data;

    private GeneralResult(boolean success, T data, String message, String errorCode) {
        this.success = success;
        this.data = data;
        this.message = message;
        this.errorCode = errorCode;
    }

    public static <T> GeneralResult<T> genResult(boolean success, T data, String message) {
        return genResult(success, data, message, null);
    }

    public static <T> GeneralResult<T> genSuccessResult(T data) {
        return genResult(true, data, null, null);
    }

    public static <T> GeneralResult<T> genErrorResult(String message) {
        return genResult(false, null, message, null);
    }

    public static <T> GeneralResult<T> genSuccessResult() {
        return genResult(true, null, null, null);
    }

    public static <T> GeneralResult<T> genErrorResult(String message, String errorCode) {
        return genResult(false, null, message, errorCode);
    }

    public static <T> GeneralResult<T> genResult(boolean success, T data, String message,
                                                 String errorCode) {
        return new GeneralResult<>(success, data, message, errorCode);
    }

}
