package cn.itcast.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


//查看servlet接口中的方法
public class AServlet implements Servlet {
	/*
	 * 它是声明周期方法
	 * 它会在servlet销毁之前调用，并且它之后调用一次。
	 * */
	@Override
	public void destroy() {
		System.out.println("destory()...");
	}
	
	/*
	 * 可以用来获取servlet的配置信息
	 * */
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()...");
		return null;
	}

	/*
	 * 可以用来获取servlet的信息
	 * */
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()...");
		return "servlet的信息";
	}

	/*
	 * 它是声明周期方法
	 * 它会在servlet对象创建之后马上执行，并只执行一次（出生之后）
	 * */
	
	@Override
	public void init(ServletConfig servletConfig/*传入的是ServletConfig实现类的对象*/) throws ServletException {
		System.out.println("init()...");
		//获取初始化的参数
		System.out.println(servletConfig.getInitParameter("p1"));
		System.out.println(servletConfig.getInitParameter("p2"));
		Enumeration e = servletConfig.getInitParameterNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
	/*
	 * 它是声明周期方法
	 * 它会被调用多次，每次在处理请求都是在调用这个方法。
	 * */
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service()...");
	}

}
