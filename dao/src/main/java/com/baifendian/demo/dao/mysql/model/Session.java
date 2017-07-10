package com.baifendian.demo.dao.mysql.model;

import com.baifendian.demo.common.consts.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/**
 * 系统Session信息
 *
 * <p>
 *
 * @author : shuanghu
 */
public class Session {

  /**
   * session ID
   */
  private String id;

  /**
   * 用户登录IP
   */
  private String ip;

  /**
   * 用户登录时间
   */
  @JsonFormat(pattern = Constants.BASE_DATETIME_FORMAT)
  private Date startTime;

  /**
   * 用户Session过期时间
   */
  @JsonFormat(pattern = Constants.BASE_DATETIME_FORMAT)
  private Date endTime;

  /**
   * 登录用户信息
   */
  private User user;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
