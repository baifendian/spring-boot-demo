package com.baifendian.demo.dao.mysql.mapper;

import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * Session 获取类
 * <p>
 *
 * @author : shuanghu
 */
public class SessionMapperSQL {

  /**
   * 通过sessionId获取session
   */
  public String findById(Map<String, Object> parameter) {
    return new SQL() {
      {
        SELECT("*");
        FROM("session");
        WHERE("`id` = #{sessionId}");
      }
    }.toString();
  }
}
