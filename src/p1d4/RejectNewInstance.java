package p1d4;

/**
 * @ClassName RejectNewInstance
 * @Description //私有构造器-防止类被实例化
 * @Author ccy
 * @Date 2020/12/4 14:53
 * @Version 1.0
 **/
public class RejectNewInstance {

    //私有构造器-防止该类被实例化
    private RejectNewInstance() throws Exception {
        throw new Exception();
    }
}
