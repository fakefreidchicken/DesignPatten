package singleton;

/**
 * ClassName: SingletonType3 <br/>
 * Description: 创建型设计模式之单例模式的懒汉式第一种实现方式(线程不安全)<br/>
 * 优点：实现简单，要使用时完成实例化，达到了Lazy Loading但只能在单线程使用<br/>
 * 缺点：多线程下一个线程进入了if判断语句块，另一个线程已经通过了该判断语句但没有执行完。<br/>
 * 这时候便会产生多个实例，即线程不安全<br/>
 * date: 2023/8/9 11:26 <br/>
 *
 * @author Mr.Shen <b/r>
 * @since JDK 8
 */
public class SingletonType3 {
}
class Test3 {
    private static Test3 instance ;
    private Test3() {}

    /**
     * 提供一个公共的静态方法，只有调用此方法时返回一个单例对象
     * 懒汉式
     * @return
     */
    public static Test3 getInstance() {
        if (instance == null) {
            instance = new Test3();
        }
        return instance;
    }
}
