package cn.edu.nuaa.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * @author planb
 * @date 2020/4/13 19:27
 * 备注：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}
