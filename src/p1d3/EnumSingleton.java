package p1d3;

/**
 * @ClassName EnumSingleton
 * @Description //因为其功能完整、使用简洁、无偿地提供了序列化机制、在面对复杂的序列化或者反射攻击时仍然可以绝对防止多次实例化等优点，单元素的枚举类型被作者认为是实现Singleton的最佳方法
 * @Author ccy
 * @Date 2020/12/4 11:54
 * @Version 1.0
 **/
public enum EnumSingleton {
    DATASOURCE;//该枚举的类型实际上就是 EnumSingleton 类，拥有 connection 属性

    //私有属性 存放数据库连接
    private DBConnection connection = null;

    //connection的get方法
    public DBConnection getConnection(){
        return connection;
    }

    //私有的构造函数，作用实例化的时候给 connection 赋值（set方法）
    private EnumSingleton(){
        connection = new DBConnection();
    }
}
