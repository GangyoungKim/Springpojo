//package com.springpojo.app.interceptor;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import com.springpojo.app.session.SessionConstant;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@Slf4j
//public class LoginCheckInterceptor implements HandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String requestURI = request.getRequestURI();
//
//        log.info("인증 체크 인터셉터 실행 {}", requestURI);
//
//        HttpSession session = request.getSession(false);
//
//        if (session == null
//                || session.getAttribute(SessionConstant.LOGIN_USERS) == null) {
//            log.info("미인증 사용자 요청");
//
//
//            return false;
//        }
//        // 로그인으로 redirect
//        response.sendRedirect("/login?redirectURL=" + requestURI);
//
//        return true;
//    }
//}
