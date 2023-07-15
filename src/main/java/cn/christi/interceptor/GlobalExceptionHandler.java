package cn.christi.interceptor;

import cn.christi.exception.BizException;
import cn.christi.exception.errorEnum.ErrorEnum;
import cn.christi.model.vo.GeneralResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: yubao.an
 * @Date: 2023/7/15
 * @Description: 统一异常处理
 **/

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    // 处理自定义的业务异常
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public GeneralResult<Object> restErrorHandler(HttpServletRequest request, BizException e) {
        String err = "请求URI：" + request.getRequestURI() + "，错误码：" + e.getErrorCode()
                + "，错误内容：" + e.getErrorMsg();
        log.error(err);
        return GeneralResult.genErrorResult(e.getMessage(), e.getErrorCode());
    }

    // 处理自定义的sql异常
    @ExceptionHandler(value = BadSqlGrammarException.class)
    @ResponseBody
    public GeneralResult<Object> sqlErrorHandler(HttpServletRequest request, BadSqlGrammarException e) {
        return GeneralResult.genErrorResult("sql 异常！", String.valueOf(e.getSQLException()));
    }


    // 处理其他异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public GeneralResult<Object> errorHandler(HttpServletRequest request, Exception e) {
        log.error("内部异常，请求URI：" + request.getRequestURI(), e);
        return GeneralResult.genErrorResult(ErrorEnum.INTERNAL_SERVER_ERROR.getErrorMsg(),
                ErrorEnum.INTERNAL_SERVER_ERROR.getErrorCode());
    }

}