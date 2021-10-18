package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author  liangchen
 * @create  2021/10/15 17:16
 * @desc
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    // 写操作， 真真正正操作，
    @PostMapping(value = "/payment/create")
    public CommonResult creat(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+ result);

        if(result > 0){
            return new CommonResult(200,"插入数据成功,port:"+serverPort,result);
        }else {
            return new CommonResult(444,"插入失败", null);
        }
    }
    // 从数据库拉数据，取数据
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果："+ payment);

        if(payment != null){
            return new CommonResult(200,"查询成功,port:"+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID是"+id, null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String element : services){
            log.info("**********element:"+element);
        }

       List<ServiceInstance> serviceInstanceList =  discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance serviceInstance : serviceInstanceList){
            log.info(serviceInstance.getServiceId()+"\t" + serviceInstance.getHost()+"\t"+serviceInstance.getPort()+"\t"+serviceInstance.getUri());
        }
        return this.discoveryClient;
    }


}
