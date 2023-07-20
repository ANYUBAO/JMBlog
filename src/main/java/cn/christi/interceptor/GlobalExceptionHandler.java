package cn.christi.interceptor;

import cn.christi.exception.BizException;
import cn.christi.exception.errorEnum.ErrorEnum;
import cn.christi.model.vo.GeneralResult;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/**
 * @Author: yubao.an
 * @Date: 2023/7/15
 * @Description: 统一异常处理
 **/

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理自定义的业务异常
     *
     * @param request 请求
     * @param e       自定义异常
     * @return 错误响应
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public GeneralResult<Object> restErrorHandler(HttpServletRequest request, BizException e) {
        log.error("请求URI：" + request.getMethod() + " " + request.getRequestURI() +
                "，错误码：" + e.getErrorCode() +
                "，错误内容：" + e.getErrorMsg());
        return GeneralResult.genErrorResult(e.getMessage(), e.getErrorCode());
    }

    /**
     * 处理自定义的sql异常
     *
     * @param e sql异常
     * @return 错误响应
     */
    @ExceptionHandler(value = BadSqlGrammarException.class)
    @ResponseBody
    public GeneralResult<Object> sqlErrorHandler(HttpServletRequest request, BadSqlGrammarException e) {
        log.error("请求URI：" + request.getMethod() + " " + request.getRequestURI() + " " + "sql异常: " + e.getSQLException().getErrorCode() + " " + e.getSQLException().getMessage());
        return GeneralResult.genErrorResult("sql异常: " + e.getSQLException().getMessage(), String.valueOf(e.getSQLException().getErrorCode()));
    }

    /**
     * 处理自定义的sql异常
     *
     * @param e sql异常
     * @return 错误响应
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public GeneralResult<Object> bindErrorHandler(HttpServletRequest request, MethodArgumentNotValidException e) {
        log.error("请求URI：" + request.getMethod() + " " + request.getRequestURI() + " " + "参数校验异常: " + Objects.requireNonNull(e.getBindingResult().getFieldError()).getCode() +
                Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
        return GeneralResult.genErrorResult("参数校验异常: " + Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage(),
                Objects.requireNonNull(e.getBindingResult().getFieldError()).getCode());
    }

    /**
     * 处理其他异常
     *
     * @param request 请求
     * @param e       所有异常
     * @return 错误响应
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public GeneralResult<Object> errorHandler(HttpServletRequest request, Exception e) {
        log.error("请求URI：" + request.getMethod() + " " + request.getRequestURI() + " 内部异常: " + e.getMessage(), e);
        return GeneralResult.genErrorResult(ErrorEnum.INTERNAL_SERVER_ERROR.getErrorMsg(),
                ErrorEnum.INTERNAL_SERVER_ERROR.getErrorCode());
    }

}