package cn.edu.nuaa.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author planb
 * @date 2020/4/13 19:27
 * 备注：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code,String message)
    {
        this(code,message,null);
    }
}
