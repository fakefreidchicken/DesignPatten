package singleton;

/**
 * ClassName: SingletonType5 <br/>
 * Description: 创建型设计模式之单例模式的懒汉式第三种实现方式(同步代码块)<br/>
 * 优点：实现简单，要使用时完成实例化，达到了Lazy Loading<br/>
 * 缺点：多线程下一个线程进入了if判断语句块，另一个线程已经通过了该判断语句但没有执行完。<br/>
 * 这时候便会产生多个实例，即线程不安全<br/>
 * date: 2023/8/9 13:58 <br/>
 *
 * @author Mr.Shen <b/r>
 * @since JDK 8
 */
public class SingletonType5 {
}
class Test5 {
    private static Test5 instance ;
    private Test5() {}

    /**
     * 提供一个公共的静态方法，只有调用此方法时返回一个单例对象
     * 而且在实例化代码处加入同步代码块处理
     * 懒汉式
     * @return
     */
    public static synchronized Test5 getInstance() {
        if (instance == null) {
            synchronized (Test5.class){
                instance = new Test5();
            }
        }
        return instance;
    }
}
