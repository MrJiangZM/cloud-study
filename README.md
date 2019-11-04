spring cloud 学习笔记

一个server 多个client

第一个借鉴博客
    https://blog.csdn.net/weixin_39800144/article/details/85012548
1. 引入的包的版本问题
2. 页面管理端的问题
3. client的问题
4. 跨服务调用的问题
5. ribbon 负载均衡的使用 注解，验证等

6. Hystrix 断路器（熔断等问题）
    Hystrix提供了熔断、隔离、Fallback、cache、监控等功能
    
出现的问题：

    1. java.lang.IllegalStateException: No instances available for client-order] with root cause
    
    2. de-registration failedCannot execute request on any known server
    
    3。 