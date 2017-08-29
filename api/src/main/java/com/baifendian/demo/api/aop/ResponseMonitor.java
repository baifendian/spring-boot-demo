package com.baifendian.demo.api.aop;

import com.baifendian.demo.common.http.HttpUtil;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Rest请求监控，打印请求URL及请求响应时间
 *
 * <p>
 *
 * @author : shuanghu
 */
@Aspect
@Component
public class ResponseMonitor {
  private static Logger logger = LoggerFactory.getLogger(ResponseMonitor.class);

  /**
   * 性能监控
   * @param point
   */
  @Around(value = "within(com.baifendian.demo.api.controller..*) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
  //@Order(1)
  public Object responseTranslation(ProceedingJoinPoint point) throws Throwable {
    long startTime = System.currentTimeMillis();
    Object[] objects = point.getArgs();

    HttpServletRequest request = (HttpServletRequest) objects[0];
    String rule = request.getServletPath();
    if (StringUtils.isEmpty(rule)){
      rule = "无";
    }

    logger.info("Request url:{}", HttpUtil.getPathParam(request));

    Object response =  point.proceed();

    long endTime = System.currentTimeMillis();

    // 1. (rule, action) 的平均时间, 90% 的时间, 最大, 最少的时间
    // 2. 路径可以传递, 传递一个时间(比如 2017-01-05)
    logger.info("Performance monitoring ----- run  rule: {}, cost time: {} ms ", rule , endTime - startTime);

    return response;
  }
}
