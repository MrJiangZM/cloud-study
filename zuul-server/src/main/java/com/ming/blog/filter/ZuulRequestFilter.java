package com.ming.blog.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * https://blog.csdn.net/weixin_39800144/article/details/85012374
 *
 * @author Jiang Zaiming
 * @date 2019/11/9 5:55 下午
 */
@Slf4j
@Component
public class ZuulRequestFilter extends ZuulFilter {

    /**
     * 指定filter的类型，四种，对应不同的执行策略
     * <p>
     * PRE： 这种过滤器在请求被路由之前调用。我们可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等。
     * ROUTING：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用Apache HttpClient或Netfilx Ribbon请求微服务。
     * POST：这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等。
     * ERROR：在其他阶段发生错误时执行该过滤器。 除了默认的过滤器类型，Zuul还允许我们创建自定义的过滤器类型。
     * 例如，我们可以定制一种STATIC类型的过滤器，直接在Zuul中生成响应，而不将请求转发到后端的微服务。
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序，数字越小越先执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤，true表示过滤，false表示不过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * filter需要执行的具体操作
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getHeader("token");
        if(StringUtils.isEmpty(token)){
            log.warn("=======>token is empty");
            currentContext.setSendZuulResponse(false);//不对其进行路由
            currentContext.setResponseStatusCode(401);
            try {
                currentContext.getResponse().getWriter().write("token is empty");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }else {
            currentContext.setSendZuulResponse(true);//进行路由
            currentContext.setResponseStatusCode(200);
        }
        return null;
    }
}
