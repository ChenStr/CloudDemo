package Two.main.controller.feignClinent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// 填入注册中心中的应用名, 也就是要调用的微服务的应用名
// 在eureka页面中可以找到
@FeignClient("SERVICE-OBJCAT-ONE")
public interface ServiceAFeignClient {
    @GetMapping("/one/test")
    public String Test();
}
