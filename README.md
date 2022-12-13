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

##JSR
> JSR是java维护者，公司，个人向对应的JSR网站提交的API和其他java相关的规范，是java中重要的组成部分。在多个模块中都有对应的实现。
> 常见的规范如：JSR-303（校验），JSR-250（注解），JSR-330（IOC与DI），JSR-340（servlet API），JSR-356（websocket API），
> JSR-236(并发应用)，JSR-367（JSON绑定 API），JSR-338(JPA) ,JSR-914(JMS)等。
> 

