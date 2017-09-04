## 建造者模式

### UML

![builder.jpeg](https://i.loli.net/2017/09/04/59acf245d97e3.jpeg)

### 四个角色
- 产品类：待构造的对象，本例中的 EmailSendMain
- 抽象建造者：定义构造抽象接口，本例子中的 Builder
- 建造者：具体的建造过程，本例中的 EmailSendMain.Builder 内部类
- 导演类：调用建造者构建对象，本例中的 App

### 使用

[使用Builder模式改进多参数方法](http://zhangh.tk/2016/10/16/%E4%BD%BF%E7%94%A8Builder%E6%A8%A1%E5%BC%8F%E6%94%B9%E8%BF%9B%E5%A4%9A%E5%8F%82%E6%95%B0%E6%96%B9%E6%B3%95/)

