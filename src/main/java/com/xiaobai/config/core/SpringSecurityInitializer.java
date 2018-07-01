package com.xiaobai.config.core;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityInitializer {
    // extends AbstractSecurityWebApplicationInitializer
    //Servlet 3.0的Tomcat(Servlet容器)会自动探测到(Tomcat日志会打印出)webapps下该工程任何路径下的AbstractSecurityWebApplicationInitializer，
    //这里如果继承了AbstractSecurityWebApplicationInitializer，什么都不写，那么使该工程默认不会拦截任何请求，也就是无法访问
    //该工程任何路径（亲测），所以如果想使用web.xml,必须去掉这里的继承
}
