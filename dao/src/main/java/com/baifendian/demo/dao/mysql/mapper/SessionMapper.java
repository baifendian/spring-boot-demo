package com.baifendian.demo.dao.mysql.mapper;

import com.baifendian.demo.dao.mysql.model.Session;
import java.util.Date;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 系统Session的操作
 * <p>
 *
 * @author : shuanghu
 */
@MapperScan
public interface SessionMapper {
  @Results(value = {
      @Result(property = "id", column = "id", id = true,javaType = String.class,jdbcType = JdbcType.VARCHAR),
      @Result(property = "user.id", column = "user_id",javaType = int.class,jdbcType = JdbcType.INTEGER),
      @Result(property = "ip", column = "ip",javaType = String.class,jdbcType = JdbcType.VARCHAR),
      @Result(property = "startTime", column = "start_time",javaType = Date.class,jdbcType = JdbcType.DATE),
      @Result(property = "endTime", column = "end_time",javaType = Date.class,jdbcType = JdbcType.DATE),
      @Result(property = "user.name", column = "user_name",javaType = String.class,jdbcType = JdbcType.VARCHAR),
      @Result(property = "user.password", column = "password",javaType = String.class,jdbcType = JdbcType.VARCHAR),
      @Result(property = "user.email", column = "email",javaType = String.class,jdbcType = JdbcType.VARCHAR),
      @Result(property = "user.phone", column = "phone",javaType = String.class,jdbcType = JdbcType.VARCHAR),
      @Result(property = "user.createTime", column = "create_time",javaType = Date.class,jdbcType = JdbcType.DATE),
      @Result(property = "user.modifyTime", column = "modify_time",javaType = Date.class,jdbcType = JdbcType.DATE),
      @Result(property = "user.status", column = "status", typeHandler = EnumOrdinalTypeHandler.class, jdbcType = JdbcType.TINYINT),
  })
  @SelectProvider(type = SessionMapperSQL.class, method = "findById")
  Session findById(@Param("sessionId") String sessionId);
}
