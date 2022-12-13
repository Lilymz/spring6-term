#Spring6的学习
> 可参考文档：https://docs.spring.io/spring-framework/docs/current/reference/html<br/>
>
> 该项目是针对spring6进行的练习与巩固。具体范围查看具体的module 
> 
<font color="red">etc:基于2022年11-15日发布的spring6进行spring的整理及学习</font><br/>
<font color="yellow">cookie:从spring5开始,WebFlux 应用程序甚至不直接使用 Servlet API，而是可以在非 Servlet 容器的服务器（例如 Netty）上运行。</font>
---------------------------------------------------------------------------------------
##环境依赖
> JDK: 17+(从spring6开始，对于jdk的依赖最低是17，低于17的都不行)<br/>
> maven：spring6对maven没有要求，但为了将来的springboot3，maven使用最好不要低于3.6.3
> servlet：5.0+
> jpa:3.0+
> javaEE:目前对javaEE最低支持EE9，同时支持EE10
> WEB:Tomcat 10.1、Jetty 11 、Undertow 2.3、Hibernate ORM 6.1
---------------------------------------------------------------------------------------
##JSR
> JSR是java维护者，公司，个人向对应的JSR网站提交的API和其他java相关的规范，是java中重要的组成部分。在多个模块中都有对应的实现。
> 常见的规范如：JSR-303（校验），JSR-250（注解），JSR-330（IOC与DI），JSR-340（servlet API），JSR-356（websocket API），
> JSR-236(并发应用)，JSR-367（JSON绑定 API），JSR-338(JPA) ,JSR-914(JMS)等。
>
---------------------------------------------------------------------------------------
##Spring-Core
> 当前模块主要用于介绍spring6中涉及到的核心部分,包括ioc,aop,resource,i18n,data-bind,spEl,event,aot等
>
---------------------------------------------------------------------------------------
* ###ioc容器
  * production(介绍)
    * IOC与DI
      > 之前我们对程序对象创建的流程交给了spring进行去控制,spring会根据他的机制自动去管理这个bean对象的生命周期.如果其他地方有应用则通过DI方式进行注入.<br/>
      <font color="red">
      优点:<br/>
      1.提供系统的可测试性和可维护性.<br/>
      2.使系统耦合性降低(耦合是指各个模块之间当存在着方法变化的时候尽量不去影响另一个模块,降低耦合)<br/>
      3.减少因为人工错误导致内存过于庞大,垃圾回收不标准.  <br/>
      </font><br/>
      <font color="red">
      缺点:<br/>
      1.提升了系统的复杂性.<br/>
      2.需要熟悉ioc并且要进行相关配置,若配置错误可能会导致其他问题.
      </font><br/>
    * Bean:
      > 这里的bean指的是注册到ioc容器中的spring bean,他的生命周期完全交给spring进行管理.
    * context初始化过程和bean注册到spring容器中过程(这里我用AnnotationConfigApplicationContext(...basePackages)作为例子):
      > 1.调用自己的空参构造器(主要是对bean定义相关的读取和扫描)
      > >1).AnnotatedBeanDefinitionReader(this):使用当前实现的BeanDefinitionRegister传入继续调用自己的构造函数AnnotatedBeanDefinitionReader(register,getOrCreateEnvironment(		this(registry, getOrCreateEnvironment(registry));
      > >getOrCreateEnvironment(register)获取当前传入context中实现的上下文环境
      > 
      > 2.扫描当前配置包
      > 3.刷新上下文.
* 
* ###Events
* ###AOP
* ###Resource
* ###i18n
* ###data-bind
* ###spEl
* ###AOT

