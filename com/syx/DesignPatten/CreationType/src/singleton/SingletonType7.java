package singleton;

/**
 * ClassName: SingletonType7 <br/>
 * Description: 创建型设计模式之单例模式的静态内部类<br/>
 * 优点：实现简单，要使用时完成实例化，达到了Lazy Loading，<br/>
 * 类装载时不会触发静态内部类的装载，外部调用方法时才会进行装载，装载时利用了jvm底层<br/>
 * 类装载时是线程安全的，推荐使用<br/>
 * date: 2023/8/9 14:15 <br/>
 *
 * @author Mr.Shen <b/r>
 * @since JDK 8
 */
public class SingletonType7 {
}
class Test7 {

    private Test7() {}

    /**
     * 静态内部类，有一个静态属性
     */
    private static class Test7Instance{
        private static final Test7 INSTANCE = new Test7();
    }
    /**
     * 提供一个公共的静态方法，直接返回Test7Instance.INSTANCE
     * @return
     */
    public static Test7 getInstance() {
        return Test7Instance.INSTANCE;
    }
}
