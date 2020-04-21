package cn.edu.nuaa.springcloud.handler;

import cn.edu.nuaa.springcloud.entities.CommonResult;
import cn.edu.nuaa.springcloud.entities.Payment;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author planb
 * @date 2020/4/21 10:13
 * 备注：
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义的Glogal 全局异常处理 ---- 1",new Payment(2020L,"serial003"));
    }

    public static CommonResult handlerException2(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义的Glogal 全局异常处理 ---- 2",new Payment(2020L,"serial003"));
    }
}
