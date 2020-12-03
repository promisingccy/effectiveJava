/**
 * @ClassName CallExample01
 * @Description //TODO
 * @Author ccy
 * @Date 2020/12/3 15:57
 * @Version 1.0
 **/
public class CallExample01 {

    public static void main(String[] args){
        F02MultiConstructParam obj = new F02MultiConstructParam.Builder(1, 2)
                .c(3).d(4).e(5).f(6).build();
        System.out.println(obj);
    }
}
