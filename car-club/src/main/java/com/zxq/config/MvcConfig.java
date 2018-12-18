package com.zxq.config;

import com.zxq.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * <p>
 *  webmvc配置
 * </p>
 *
 * @author Zeng XiaoQi
 * @since 2018-12-08
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    /**
     *  super.addInterceptors(registry);
     *  静态资源: *.css , *.js
     *  SpringBoot已经做好了静态资源映射
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/login", "/", "/toLogin", "/css/**", "/fonts/**", "/img/**", "/js/**","/laydate/**");
    }


}
