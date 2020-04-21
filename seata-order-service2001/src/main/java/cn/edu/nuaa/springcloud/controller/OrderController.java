package cn.edu.nuaa.springcloud.controller;

import cn.edu.nuaa.springcloud.domain.CommonResult;
import cn.edu.nuaa.springcloud.domain.Order;
import cn.edu.nuaa.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther planb
 * @date 2020-04-21 19:26
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
