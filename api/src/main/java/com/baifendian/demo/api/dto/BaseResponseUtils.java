package com.baifendian.demo.api.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 返回数据，国际化
 *
 * <p>
 *
 * @author : shuanghu
 */
@Service
public class BaseResponseUtils {
  private static Logger LOGGER = LoggerFactory.getLogger(BaseResponseUtils.class);

  @Autowired
  private MessageSource messageSource;

  /**
   * baseResponse国际化
   *
   * @param baseResponse
   */
  public void baseResponseTranslation(BaseResponse baseResponse) {
    String code = baseResponse.getCode();
    String msg = null;

    if (!StringUtils.isEmpty(code)) {
      try {
        msg = messageSource.getMessage(code, baseResponse.getArgs(), LocaleContextHolder.getLocale());
        baseResponse.setMsg(msg);
      } catch (Exception e) {
        baseResponse.setMsg(code);
        LOGGER.error("Translation baseResponse error!", e);
        return;
      }

      LOGGER.info("code: {}, msg: {}", code, msg);
    }
  }
}
