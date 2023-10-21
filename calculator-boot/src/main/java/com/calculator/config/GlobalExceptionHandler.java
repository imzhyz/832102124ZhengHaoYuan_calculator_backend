package com.calculator.config;

import com.calculator.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 *
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 运行时异常
     */
    @ExceptionHandler(RuntimeException.class)
    public Result handleRunTimeException(RuntimeException e) {
        log.error("运行时异常: {}", e.getMessage(), e);
        return Result.failed(e.getMessage());
    }

    /**
     * 异常
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        log.error("异常: {}", e.getMessage(), e);
        return Result.failed(e.getMessage());
    }

}