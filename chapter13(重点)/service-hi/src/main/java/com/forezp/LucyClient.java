package com.forezp;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-LUCY")
public interface LucyClient {

    @RequestMapping(value = "/hi")
    String home(@RequestParam(value = "name") String name);
}
