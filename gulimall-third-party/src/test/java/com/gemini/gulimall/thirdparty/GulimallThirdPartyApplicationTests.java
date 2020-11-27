package com.gemini.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
public class GulimallThirdPartyApplicationTests {

    @Resource
    private OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ASUS\\Desktop\\尚硅谷2020谷粒商城项目（重新校对版）\\分布式基础篇\\docs\\pics\\0d40c24b264aa511.jpg");
        // 上传文件流
        ossClient.putObject("gulimall-gemini-hello", "11.jpg", fileInputStream);
        // 关闭 ossClient
        ossClient.shutdown();
        System.out.println("上传完成");
    }

}
