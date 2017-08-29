package com.baifendian.demo.api.dto.error;

/**
 * <p>
 *
 * @author : shuanghu
 */
public class ExceptionResponse {

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String getDetailInfo() {
    return detailInfo;
  }

  public void setDetailInfo(String detailInfo) {
    this.detailInfo = detailInfo;
  }

  /**
   * 返回信息，会做国际化处理
   */
  private String msg;

  /**
   * 异常信息，不做国际化处理
   */
  private String detailInfo;
}
