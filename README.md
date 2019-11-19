spring cloud 学习笔记

一个server 多个client

第一个借鉴博客
    https://blog.csdn.net/weixin_39800144/article/details/85012548
1. 引入的包的版本问题
2. 页面管理端的问题
3. client的问题
4. 跨服务调用的问题
5. ribbon 负载均衡的使用 注解，验证等
题
========================  验证到这里是出错，总是找不到instance，需要定问
    问题最后定位至版本问题，spring-boot使用的是2.1.6 
    但是 spring-cloud-starter-netflix-eureka-server 版本使用的是2.1.3，倒是找不到具体的类，从而不能连接server和client
    
        |||
        |||
        |||     ===== 可以进行接下来的组件验证
        |||
        |||
    \\  |||  //
     \\ ||| //
      \\ | //
       \\ //


6. Hystrix 断路器（熔断等问题）
    Hystrix提供了熔断、隔离、Fallback、cache、监控等功能
    
    熔断器可以在其他服务报错或者不通的使用调用指定的方法!!!!!!!!!!
    
    
出现的问题：

    1. java.lang.IllegalStateException: No instances available for client-order] with root cause
        这个问题在第二个提交时出现，但是过一会就好了，
        但是添加hystrix模块后总是出现，目前为找到问题所在
    2. de-registration failedCannot execute request on any known server
    
    3. was unable to refresh its cache! status = Cannot execute request on any known server
    
    
7. feign 的用法比较方便，可以直接通过注解的方式使用，可以实现负载均衡
    feign 使用hystrix的使用必须配置feign.hystrix.enable = true  默认是关闭的
    
    使用consul也要配置上面的数据
    
8. springcloud zuul的使用与含义
    在微服务架构中，后端服务往往不会直接开放给调用端，而是通过一个网关根据请求的url，
    路由到相应的服务。当添加网关后，在第三方调用端和服务提供方之间就创建了一面墙，
    这面墙直接与调用方通信进行权限控制，后将请求均衡分发给后台服务端。在Spring Cloud体系中， 
    Spring Cloud Zuul就起到了网关的作用，它可以提供动态路由，监控，弹性，安全等的边缘服务。

    https://blog.csdn.net/weixin_39800144/article/details/85012374 这篇文章的用法与    
