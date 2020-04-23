package dan.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: Dennis
 * @date: 2020/4/23 20:50
 */

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * Controller 类方法调用前，如果匹配到拦截器的 url，就会调用 preHandle 进行处理
     * @param request
     * @param response
     * @param handler
     * @return true 能够继续访问（可以调用 Controller 中的方法，或是访问某个页面）
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(); //获取 session,
        if (session == null){

        }
        return false;
    }
}
