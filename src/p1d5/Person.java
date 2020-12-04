package p1d5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @ClassName Person
 * @Description //避免创建多余的对象
 * @Author ccy
 * @Date 2020/12/4 15:11
 * @Version 1.0
 **/
public class Person {

    private Date birthDate;

    //出生日期
    public Person(Date date){
        this.birthDate = date;
    }

    //时间范围
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    //静态初始化器
    static {
        Calendar gmt = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        gmt.set(1990, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmt.getTime();//起始时间

        gmt.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmt.getTime();//结束时间
    }

    public boolean is90s(){
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
    }



}
