package Two.main.controller;

import Two.main.controller.feignClinent.ServiceAFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 添加注解声明是注册中心客户端
@EnableEurekaClient
// 实现不同子服务调用
@EnableFeignClients
public class TestBController {

    @Autowired
    public ServiceAFeignClient serviceAFeignClient;

    @GetMapping("call")
    public String call(){
        String result = serviceAFeignClient.Test();
        return "b to a 访问结果 ---" + result;
    }
}
