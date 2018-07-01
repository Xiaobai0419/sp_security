package com.xiaobai.config.core;

import com.xiaobai.config.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 一些需要注意的事项：
 本教程使用 WebApplicationInitializer 来自动加载 Spring 上下文加载器，这些仅在 Servlet 3.X 容器中支持，例如：Tomcat7和 Jetty8。
 由于我们使用了WebApplicationInitializer，所以不需要web.xml配置文件。
 Spring Security注释在旧版本的Servlet容器2.x中支持，例如：Tomcat6. 如果您使用经典的XML文件来加载Spring上下文，本教程仍然能够部署在Servlet容器2.X 中，例如，Tomcat6。
 */

/**
 * Tomcat Localhost.Log
 七月 01, 2018 5:22:12 下午 org.apache.catalina.core.ApplicationContext log
 信息: Spring WebApplicationInitializers detected on classpath: [com.xiaobai.config.core.SpringMvcInitializer@6d06c39c, com.xiaobai.config.core.SpringSecurityInitializer@57146eaf]
 七月 01, 2018 5:22:12 下午 org.apache.catalina.core.ApplicationContext log
 信息: Initializing Spring root WebApplicationContext
 七月 01, 2018 5:22:13 下午 org.apache.catalina.core.ApplicationContext log
 信息: Initializing Spring FrameworkServlet 'dispatcher'
 */
//只要在工程下继承了AbstractAnnotationConfigDispatcherServletInitializer就会被Servlet 3.0容器自动探测到，这里会自动加载Spring上下文加载器（
//根据源码，是在Servlet 3.0容器执行的onStartup(ServletContext var1)方法中向ServletContext注册监听器，启动Spring上下文，然后这里会加载Spring配置类AppConfig.class，
//连锁加载SpringMVC和Spring Security配置
//另一个继承了AbstractSecurityWebApplicationInitializer的SpringSecurityInitializer也会被Servlet 3.0容器自动探测到，(根据源码)加载Spring Security的主Filter,使其权限拦截生效
public class SpringMvcInitializer {
    // extends AbstractAnnotationConfigDispatcherServletInitializer

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{};
//    }
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
//    protected String[] getServletMappings() {
//        return new String[]{};
//    }
}
