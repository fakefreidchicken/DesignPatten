package singleton;

/**
 * ClassName: SingletonType6 <br/>
 * Description: 创建型设计模式之单例模式的双重检查<br/>
 * 优点：实现简单，要使用时完成实例化，达到了Lazy Loading，双重检查保证了线程安全<br/>
 * 同时提高了效率，实际开发中推荐使用此方式<br/>
 * date: 2023/8/9 14:03 <br/>
 *
 * @author Mr.Shen <b/r>
 * @since JDK 8
 */
public class SingletonType6 {
}
class Test6 {
    private static volatile Test6 instance ;
    private Test6() {}

    /**
     * 提供一个公共的静态方法，只有调用此方法时返回一个单例对象
     * 而且加入了双重检查，并用volatile修饰，使得一有变化立马刷入，以后的线程进入时
     * 就被第一重if拦截，提高了效率
     * @return
     */
    public static Test6 getInstance() {
        if (instance == null) {
            synchronized (Test6.class){
                if(instance == null){
                    instance = new Test6();
                }
            }
        }
        return instance;
    }
}
