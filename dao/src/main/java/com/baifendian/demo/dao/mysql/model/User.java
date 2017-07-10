package com.baifendian.demo.dao.mysql.model;

import com.baifendian.demo.common.consts.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/**
 * 系统用户信息
 * <p>
 *
 * @author : shuanghu
 */
public class User {
  /**
   * 用户ID
   */
  private Integer id;

  /**
   * 用户名
   */
  private String name;

  /**
   * 用户密码
   */
  private String password;

  /**
   * 用户邮箱
   */
  private String email;

  /**
   * 用户手机号
   */
  private String phone;

  /**
   * 用户创建时间
   */
  @JsonFormat(pattern = Constants.BASE_DATETIME_FORMAT)
  private Date createTime = new Date();

  /**
   * 用户修改时间
   */
  @JsonFormat(pattern = Constants.BASE_DATETIME_FORMAT)
  private Date modifyTime = new Date();
}
