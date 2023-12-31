策略模式(Strategy Pattern)中，定义算法族（策略组），分别封装起来，
让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
这算法体现了几个设计原则，第一、把变化的代码从不变的代码中分离出来；
第二、针对接口编程而不是具体类（定义了策略接口）；
第三、多用组合/聚合，少用继承（客户通过组合方式使用策略）。

策略模式的关键是：分析项目中变化部分与不变部分
策略模式的核心思想是：多用组合聚合少用继承；用行为类组合，而不是行为的继承。更有弹性
体现了“对修改关闭，对扩展开放”原则，客户端增加行为不用修改原有代码，
只要添加一种策略（或者行为）即可，避免了使用多重转移语句(if...else if...else...)
提供了可以替换继承关系的办法：策略模式将算法封装在独立的Strategy类中使得
你可以独立于其Context改变它，使它易于切换、易于理解、易于扩展
需要注意的是：每添加一个策略就要增加一个类，当策略过多时会导致类数目庞大