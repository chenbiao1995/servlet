package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**模拟GenericServlet
 * @author lenovo
 *
 */
public class BServlet implements Servlet {
	
	private ServletConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory");
	}
	/*
	 * 这个方法一定会在init()方法之后被调用
	 * init()调用之后，本类的成员this.config已经有值了
	 * */
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "servlet info";
	}
	/*
	 * 它会被构造器之后马上被调用
	 * */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//把tomcat传递的ServletConfig复制给本类的一个成员，其实就是把它保存起来，方便在其他方法中使用
		this.config = config;
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 这里是否可以使用ServletConfig的成员呢？  可以的 它也是在init方法之后执行
		 * */
		System.out.println("每次处理请求都会被调用");
		
	}
	//模拟GenericServlet中的方法

	public ServletContext getServletContext() {
		return config.getServletContext();
	}
	public String getServletName() {
		return config.getServletName();
	}

}
