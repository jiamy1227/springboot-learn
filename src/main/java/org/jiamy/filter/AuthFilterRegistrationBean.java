package org.jiamy.filter;

import jakarta.servlet.*;
import org.jiamy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/10/14 10:12
 **/
@Component
public class AuthFilterRegistrationBean extends FilterRegistrationBean {

    @Autowired
    UserService userService;

    @Override
    public Filter getFilter() {
        return new AuthFilter();
    }

    class AuthFilter implements Filter {
        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
}
