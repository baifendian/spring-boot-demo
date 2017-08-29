package com.baifendian.demo.api.service.demo;

import com.baifendian.demo.api.dto.DemoDto;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * @author : shuanghu
 */
@Service
public class DemoService {

  public DemoDto getMethod(String name, String param){
    DemoDto demoDto = new DemoDto();
    demoDto.setMsg1("This is a demo.");
    demoDto.setMsg2("name:"+name+", param:"+param);
    return demoDto;
  }
}
