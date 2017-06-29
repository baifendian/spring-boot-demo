package com.baifendian.demo.dao.mysql.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
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
  @JsonSerialize(using = DateSerializer.class)
  private Date startTime;

  /**
   * 用户Session过期时间
   */
  @JsonSerialize(using = DateSerializer.class)
  private Date endTime;

  /**
   * 登录用户信息
   */
  private User user;


}
