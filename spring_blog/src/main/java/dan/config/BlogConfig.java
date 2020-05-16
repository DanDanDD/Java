package dan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: Dennis
 * @date: 2020/5/8 21:14
 */

@Configuration
public class BlogConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .excludePathPatterns("/css/**")
                .excludePathPatterns("/fonts/**")
                .excludePathPatterns("/image/**")
                .excludePathPatterns("/js/**")
                .excludePathPatterns("/plugins/editor/**") // ** 匹配多级路径
                .excludePathPatterns("/")
                .excludePathPatterns("/login")
                .excludePathPatterns("/a/*");  // *匹配一级路径/a/1 ，多级不能匹配/a/1/1
    }

}
