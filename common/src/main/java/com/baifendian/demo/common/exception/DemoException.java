package com.baifendian.demo.common.exception;

/**
 * 自定义异常类型，支持国际化，可以携带国际化的msgKey
 *
 * <p>
 *
 * @author : shuanghu
 */
public class DemoException extends RuntimeException{
  /**
   * Serial version UID
   */
  private static final long serialVersionUID = 1L;
  // 国际化的参数
  private Object[] args;
  // 国际化的msgKey
  private String msgKey;

  public DemoException(Throwable cause, String msgKey, Object... obj) {
    super(cause);
    this.msgKey = msgKey;
    args = obj;
  }
}
