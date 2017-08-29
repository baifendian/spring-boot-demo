package com.baifendian.demo.api.controller;

import com.baifendian.demo.api.dto.BaseResponseUtils;
import com.baifendian.demo.api.dto.error.ExceptionResponse;
import com.baifendian.demo.common.exception.DemoException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class ExceptionHandlerController {
  private final Logger LOGGER = LoggerFactory.getLogger(getClass());

  @ExceptionHandler(DemoException.class)
  @ResponseBody
  public ResponseEntity handleUdpException(HttpServletRequest req, DemoException e) {
    LOGGER.error("DemoException", e);
    ExceptionResponse exceptionResponse = new ExceptionResponse();
    exceptionResponse.setMsg(BaseResponseUtils.baseResponseTranslation(e.getMsgKey(), e.getArgs()));

    return ResponseEntity.status(e.getHttpStatus())
        .body(exceptionResponse);
  }

  @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(Exception.class)
  ResponseEntity handleAllException(HttpServletRequest req, Exception e) {
    LOGGER.error("INTERNAL_ERROR", e);
    ExceptionResponse exceptionResponse = new ExceptionResponse();
    exceptionResponse.setMsg(BaseResponseUtils.baseResponseTranslation("com.bfd.dw.api.dto.internalException"));
    exceptionResponse.setDetailInfo(e.getMessage());

    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(exceptionResponse);
  }
}
