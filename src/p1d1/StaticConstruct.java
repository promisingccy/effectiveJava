package p1d1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName StaticConstruct
 * @Description //静态工厂方法 代替 构造器
 * @Author ccy
 * @Date 2020/12/3 14:08
 * @Version 1.0
 **/
public class StaticConstruct {
    private StaticConstruct(){}

    //存放对象
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p){
        providers.put(name, p);
    }

    //不带名称 返回默认名称的对象
    public static StaticConstruct newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    //带名称 返回该对象
    public static StaticConstruct newInstance(String name){
        Provider provider = providers.get(name);
        if(provider == null){
            throw new IllegalArgumentException(String.format("no provider with name : %s", name));
        }
        return provider.newService();
    }

}






