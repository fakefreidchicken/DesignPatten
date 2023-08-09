package singleton;

/**
 * ClassName: SingletonType1 <br/>
 * Description: 创建型设计模式之单例模式的饿汉式第一种实现方式(静态变量)<br/>
 * 优点：实现简单，类装载时完成实例化，避免线程同步问题<br/>
 * 缺点：没有达到Lazy Loading的效果，从始至终没有使用该实例会造成内存浪费<br/>
 * date: 2023/8/9 11:15 <br/>
 *
 * @author Mr.Shen <b/r>
 * @since JDK 8
 */
public class SingletonType1 {

}
class Test1{
    /**
     * 1. 构造器私有化, 外部能new
     */
    private Test1(){

    }
    //2.本类内部创建对象实例
    private final static Test1 INSTANCE = new Test1();

    /**
     *
     * @return 3. 提供一个公有的静态方法，返回实例对象
     */
    public static Test1 getInstance(){
        return INSTANCE;
    }
}
