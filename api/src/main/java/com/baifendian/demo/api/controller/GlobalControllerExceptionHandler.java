package com.baifendian.demo.api.controller;

import com.baifendian.demo.api.dto.BaseResponse;
import com.baifendian.demo.exception.DemoException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局异常处理类
 *
 * <p>
 *
 * @author : shuanghu
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {
  private final Logger LOGGER = LoggerFactory.getLogger(getClass());

  @ExceptionHandler(DemoException.class)
  @ResponseBody
  public BaseResponse handleUdpException(HttpServletRequest req, DemoException e) {
    return null;
  }

  @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(Exception.class)
  @ResponseBody
  BaseResponse handleAllException(HttpServletRequest req, Exception e) {
    LOGGER.error("INTERNAL_ERROR", e);
    BaseResponse baseResponse = BaseResponse.INTERNAL_ERROR;
    //baseResponseUtils.baseResponseTranslation(baseResponse);
    return baseResponse;
  }
}
