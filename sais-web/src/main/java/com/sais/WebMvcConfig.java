package com.sais;

import com.sais.saisweb.admin.AdminLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Component
public class WebMvcConfig implements WebMvcConfigurer {
    private AdminLoginInterceptor adminLoginInterceptor;

    @Autowired
    public WebMvcConfig(AdminLoginInterceptor adminLoginInterceptor){
        this.adminLoginInterceptor=adminLoginInterceptor;
    }
    /**
     * 添加静态资源文件，外部可以直接访问地址
     *
     * @param registry 资源处理程序注册表
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(adminLoginInterceptor).addPathPatterns("/admin/**").excludePathPatterns("/admin/login/**");
//    }
}
