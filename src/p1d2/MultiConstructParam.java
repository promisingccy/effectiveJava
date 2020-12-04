package p1d2;

/**
 * @ClassName MultiConstructParam
 * @Description //构造模式
 * @Author ccy
 * @Date 2020/12/3 15:18
 * @Version 1.0
 **/
public class MultiConstructParam {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    //使用builder模式为构造参数赋值
    private MultiConstructParam(Builder builder){
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
        e = builder.e;
        f = builder.f;
    }

    public static class Builder{
        //F02MultiConstructParam的必选构造参数
        private final int a;
        private final int b;
        //F02MultiConstructParam的可选构造参数
        private int c = 0;
        private int d = 0;
        private int e = 0;
        private int f = 0;

        //必选参数构造
        public Builder(int a, int b){
            this.a = a;
            this.b = b;
        }
        //可选参数赋值
        public Builder c(int i){ c = i; return this;}
        public Builder d(int i){ d = i; return this;}
        public Builder e(int i){ e = i; return this;}
        public Builder f(int i){ f = i; return this;}

        public MultiConstructParam build(){
            return new MultiConstructParam(this);
        }
    }
}





