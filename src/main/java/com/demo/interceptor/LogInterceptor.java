package com.demo.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;

import javax.servlet.http.HttpServletRequest;

public class LogInterceptor implements Interceptor {
    @Override
    public void intercept(Invocation inv) {
        saveLogId(inv.getController());
        inv.invoke();
    }

    public void saveLogId(Controller con){
        String ip = getRealIp(con.getRequest());
        String uri = con.getRequest().getRequestURI();
        System.out.println(String.format("url:%s,当前操作的IP是%s",uri,ip));
    }

    /**
     * 获取用户端请求的真实IP地址
     *
     * @param request
     * @return
     */
    public static String getRealIp(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknow".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknow".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknow".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        if(ip.indexOf(",")>-1){
            ip = ip.split(",")[0];
        }
        return ip;
    }
}
