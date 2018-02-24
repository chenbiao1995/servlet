package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DServlet extends GenericServlet {
	 @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("≥ı ºªØ");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

}
