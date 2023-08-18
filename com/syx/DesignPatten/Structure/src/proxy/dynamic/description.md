动态代理
代理对象，不需要实现接口，但是目标对象要实现接口，否则不能用动态代理
代理对象的生成，是利用JDK的API,动态的在内存中构建代理对象
动态代理也叫做：JDK代理、接口代理
代理类所在包：java.lang.reflect.Proxy
JDK实现代理只需要使用newProxyInstance方法，但是该方法需要接收三个参数，
完整的写法是：static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
