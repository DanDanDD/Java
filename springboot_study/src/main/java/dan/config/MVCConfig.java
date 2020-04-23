package dan.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: Dennis
 * @date: 2020/4/23 20:43
 */

public class MVCConfig implements WebMvcConfigurer {
    /**
     * 根据 url 进行拦截，调用配置的拦截器进行处理
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 除了 /login.html ，/user/login 两个 url 请求，其他全部拦截
        // 所有的拦截器依次执行：
        // interceptor.preHandle()--->controller.映射方法()--->interceptor.postHandle()
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login.html")
                .excludePathPatterns("/user/login");

    }
}
