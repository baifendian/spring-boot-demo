package com.baifendian.demo.common.http;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *
 * @author : shuanghu
 */
public class HttpUtil {

  public static String getPathParam(HttpServletRequest request){
    StringBuilder builder = new StringBuilder();

    builder.append(request.getRequestURI()).append("?");
    Enumeration<String> parameterNames = request.getParameterNames();
    while (parameterNames.hasMoreElements()){
      String name = parameterNames.nextElement();
      builder.append(name).append("=").append(request.getParameter(name)).append("&");
    }

    return builder.toString();
  }
}
