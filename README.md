# Head First Design Pattern
## Chapter01 Strategy Pattern
定义算法族，分别封装起来，让他们之间可以相互替换，策略模式让算法的变化独立于使用算法的客户。
## Chapter02 Observer Pattern
定义对象之间一对多的依赖关系，当被依赖对象的状态改变时，所有依赖对象能自动收到更新并改变自己。
## Chapter03 Decoration Pattern
动态地将责任附加到对象上，若要扩展功能，装饰者模式提供不同于继承的另一种选择。
## Chapter04 Factory Pattern
###Factory Method
定义了一个创建对象的接口，但由子类决定实例化哪一个类。工厂方法让类的实例化推迟到子类。
###Abstract Factory
提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定的类。
## Chapter05 Singleton Pattern
确保一个类只有一个实例，并提供全局访问点。
1. 懒汉式
2. 饿汉式
3. 双重检查加锁
## Chapter06 Command Pattern
将请求封装成对象，以便参数化、重做和撤销等操作。
## Chapter07 Adapter Pattern and Facade Pattern
### Adapter Pattern
适配器模式是将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。  
两个成熟的类需要通信，但是接口不同，由于开闭原则，我们不能去修改这两个类的接口，所以就需要一个适配器来完成衔接过程。
### Facade Pattern
外观模式为子系统中的一组接口提供了统一的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。  
外观模式中，客户对各个具体的子系统是不了解的，所以对这些子系统进行了封装，对外只提供了用户所明白的单一而简单的接口，用户直接使用这个接口就可以完成操作，而不用去理睬具体的过程，而且子系统的变化不会影响到用户，这样就做到了信息隐蔽。
## Chapter08 Template Pattern
在一个方法中定义算法框架，而将一些步骤延迟到子类中实现。模版方法使得子类在不改变算法结构的前提下，重新定义算法中的某些步骤。
## Chapter09 Iterator Pattern and Composite Pattern
### Iterator Pattern
迭代器模式提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。
### Composite Pattern
将对象组成树形结构来表现"整体/部分"的层次结构。组合让客户以相同的方式处理个别对象和对象组合。
## Chapter10 State Pattern
对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。