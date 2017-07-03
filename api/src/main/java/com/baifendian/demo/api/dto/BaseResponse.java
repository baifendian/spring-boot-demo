package com.baifendian.demo.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * 返回包基类
 *
 * 序列化结果如下：
 * <code>
 * {
 * "status": 0,
 * "msg": null,
 * "data": {
 * "sessionId": "133c2a50-7860-462c-beea-8849c483d497"
 * },
 * "success": true
 * }
 * </code>
 * <p>
 *
 * @author : shuanghu
 */
public class BaseResponse {

  /**
   * 服务内部错误，指服务本身发生了异常
   */
  public static final BaseResponse INTERNAL_ERROR = new BaseResponse(4,
      "com.bfd.dw.api.dto.BaseResponse.internalException", null);

  /**
   * 返回状态码
   */
  private int status;

  /**
   * 编码,国际化的msgKey
   */
  @JsonIgnore
  private String code;

  /**
   * 错误信息，当有错误的情况下返回
   */
  private String msg;

  /**
   * 国际化的参数
   */
  @JsonIgnore
  private Object[] args;

  /**
   * {@link BaseResponseData}
   */
  private BaseResponseData data;

  public BaseResponse(int status, String code, Object[] args) {
    super();
    this.status = status;
    this.code = code;
    this.args = args;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object[] getArgs() {
    return args;
  }

  public void setArgs(Object[] args) {
    this.args = args;
  }

  public BaseResponseData getData() {
    return data;
  }

  public void setData(BaseResponseData data) {
    this.data = data;
  }
}
