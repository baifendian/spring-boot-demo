package com.baifendian.demo.api.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 404页面处理
 *
 * <p>
 *
 * @author : shuanghu
 */
@RestController
@RequestMapping("")
public class HttpErrorHandler implements ErrorController {
  private final static String ERROR_PATH = "/error";

  @RequestMapping(value = ERROR_PATH)
  @ResponseBody
  public ResponseEntity error(HttpServletRequest request) {

    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body("Path not found");
  }

  @Override
  public String getErrorPath() {
    return ERROR_PATH;
  }
}
