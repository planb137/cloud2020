package cn.edu.nuaa.springcloud.service.impl;

import cn.edu.nuaa.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author planb
 * @date 2020/4/18 12:43
 * 备注：
 */
@EnableBinding(Source.class)//定义消息推送的管道
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*******,serial: "+serial);
        return serial;
    }
}
