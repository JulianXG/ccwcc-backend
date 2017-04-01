/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.spring;

import cn.kalyter.ccwcc.model.Constant;
import cn.kalyter.ccwcc.model.Response;
import cn.kalyter.ccwcc.service.TokenService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 需要身份认证请求的拦截器
 */
public class AuthenticationInterceptor implements HandlerInterceptor {
    private final Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);
    private static final String TOKEN = "token";
    @Autowired
    private TokenService tokenService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(TOKEN);
        if (tokenService.validateToken(token, request.getRequestURI()) != null) {
            return true;
        } else {
            Response responseError = new Response();
            responseError.setStatus(Constant.AUTH_ERROR);
            ObjectMapper mapper = new ObjectMapper();
            String resultJSON = mapper.writeValueAsString(responseError);
            response.setCharacterEncoding("UTF-8");
            response.addHeader("charset", "UTF-8");
            response.addHeader("Content-Type", "application/json");
            response.getWriter().write(resultJSON);
            response.getWriter().close();
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
