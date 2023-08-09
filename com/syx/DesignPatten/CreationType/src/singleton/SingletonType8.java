package singleton;

/**
 * ClassName: SingletonType8 <br/>
 * Description: 创建型设计模式之单例模式的枚举<br/>
 * 避免多线程问题，还能防止反序列化重新创建新的对象，这是Effective Java作者提倡的方式<br/>
 * date: 2023/8/9 14:28 <br/>
 *
 * @author Mr.Shen <b/r>
 * @since JDK 8
 */
public class SingletonType8 {

    public static void main(String[] args) {
        Test8 instance = Test8.INSTANCE;
        Test8 instance1 = Test8.INSTANCE;
        System.out.println(instance == instance1);
    }
}
enum Test8{
    //属性
    INSTANCE;
    public void say(){
        System.out.println("ok");
    }
}
