package com.baifendian.demo.api.controller;

import com.baifendian.demo.api.dto.DemoDto;
import com.baifendian.demo.api.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示如何获取URL内的参数以及如何返回数据
 * <p>
 *
 * @author : shuanghu
 */
@RestController
@RequestMapping("")
public class DemoController {

  @Autowired
  private DemoService demoService;

  @GetMapping(value = "/demo/{name}")
  public DemoDto getMethod(@PathVariable String name, @RequestParam(value = "param") String param){
    return demoService.getMethod(name, param);
  }

}
