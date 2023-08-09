package singleton;

/**
 * ClassName: SingletonType4 <br/>
 * Description: 创建型设计模式之单例模式的懒汉式第二种实现方式(线程安全)<br/>
 * 优点：实现简单，要使用时完成实例化，达到了Lazy Loading而且解决了线程安全问题<br/>
 * 缺点：效率低，每个线程想获取类实例时执行getInstance()都要同步<br/>
 * date: 2023/8/9 13:53 <br/>
 *
 * @author Mr.Shen <b/r>
 * @since JDK 8
 */
public class SingletonType4 {
}
class Test4 {
    private static Test4 instance ;
    private Test4() {}

    /**
     * 提供一个公共的静态方法，只有调用此方法时返回一个单例对象
     * 而且加入了同步处理的代码，解决线程安全的问题
     * 懒汉式
     * @return
     */
    public static synchronized Test4 getInstance() {
        if (instance == null) {
            instance = new Test4();
        }
        return instance;
    }
}
