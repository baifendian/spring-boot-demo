package com.baifendian.demo.api.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 文件上传
 *
 * <p>
 *
 * @author : shuanghu
 */
@RestController
@RequestMapping("/fileUpload")
public class FileUploadController {
  public void fileUpload(MultipartHttpServletRequest request) throws IOException {

    MultipartFile file = request.getFile("files");
  }
}
