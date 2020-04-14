package cn.edu.nuaa.springcloud.dao;

import cn.edu.nuaa.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author planb
 * @date 2020/4/13 15:14
 * 备注：
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
