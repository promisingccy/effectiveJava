import p1d2.MultiConstructParam;
import p1d3.DBConnection;
import p1d3.EnumSingleton;
import p1d4.RejectNewInstance;
import p1d5.Person;

import java.util.Date;

/**
 * @ClassName EffectiveJava
 * @Description //TODO
 * @Author ccy
 * @Date 2020/12/4 10:35
 * @Version 1.0
 **/
public class EffectiveJava {
    public static void main(String[] args) {



        //p1d5 避免创建多余的对象-静态初始化器
        // p1d5();

        //p1d4 私有构造器-防止类被实例化
        // p1d4();

        //p1d3 调用-枚举单例
        // p1d3();

        //p1d2 调用-构造模式
        // p1d2();

        // System.out.println("Hello, World!");
    }

    //p1d5 避免创建多余的对象-静态初始化器
    private static void p1d5() {
        Date date = new Date();
        Person p1 = new Person(date);
        System.out.println(p1.is90s());//false 现在2020
    }

    //p1d4 私有构造器-防止类被实例化
    private static void p1d4() {
        try {
            //RejectNewInstance拒绝访问
            // RejectNewInstance instance = new RejectNewInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //p1d3 调用-枚举单例
    private static void p1d3() {
        DBConnection c1 = EnumSingleton.DATASOURCE.getConnection();
        DBConnection c2 = EnumSingleton.DATASOURCE.getConnection();
        System.out.println(c1 == c2);//true
    }

    //p1d2 调用-构造模式
    private static void p1d2() {
        MultiConstructParam obj = new MultiConstructParam.Builder(1, 2)
            .c(3).d(4).e(5).f(6).build();
        System.out.println(obj.getA());
    }


}
