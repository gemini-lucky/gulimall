package com.gemini.gulimall.product.exception;

import com.gemini.common.exception.BizCodeEnume;
import com.gemini.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 集中处理所有异常
 */
@RestControllerAdvice(basePackages = "com.gemini.gulimall.product.controller")
@Slf4j
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e) {
        log.error("数据校验出现问题{}，异常类型{}", e.getMessage(), e.getClass());

        BindingResult bindingResult = e.getBindingResult();
        Map<String, String> fieldMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            fieldMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VAILD_EXCEPTION.getCode(), BizCodeEnume.VAILD_EXCEPTION.getMsg()).put("data", fieldMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable) {
        return R.error();
    }
}
