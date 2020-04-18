import java.time.ZonedDateTime;

/**
 * @author planb
 * @date 2020/4/17 10:03
 * 备注：
 */
public class ShowTime {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now(); // 默认时区
        System.out.println(time);
        //2020-04-17T10:04:11.172+08:00[Asia/Shanghai]
    }
}
