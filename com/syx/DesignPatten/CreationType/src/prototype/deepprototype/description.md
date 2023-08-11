浅拷贝：
对于数据类型是基本数据类型的成员变量,浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，
那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内存地址)复制一份给新的对象。
因为实际上两个对象的该成员变量都指向同一个实例。
在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值
深拷贝：
复制对象的所有基本数据类型的成员变量值
为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，
直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象(包括对象的引用类型)进行拷贝
深拷贝实现方式1:重写clone方法来实现深拷贝，即让引用数据类型也实现cloneable接口
再调用clone方法实现深拷贝
深拷贝实现方式2:通过对象序列化实现深拷贝(推荐)
