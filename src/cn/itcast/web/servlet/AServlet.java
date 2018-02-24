package cn.itcast.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


//�鿴servlet�ӿ��еķ���
public class AServlet implements Servlet {
	/*
	 * �����������ڷ���
	 * ������servlet����֮ǰ���ã�������֮�����һ�Ρ�
	 * */
	@Override
	public void destroy() {
		System.out.println("destory()...");
	}
	
	/*
	 * ����������ȡservlet��������Ϣ
	 * */
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()...");
		return null;
	}

	/*
	 * ����������ȡservlet����Ϣ
	 * */
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()...");
		return "servlet����Ϣ";
	}

	/*
	 * �����������ڷ���
	 * ������servlet���󴴽�֮������ִ�У���ִֻ��һ�Σ�����֮��
	 * */
	
	@Override
	public void init(ServletConfig servletConfig/*�������ServletConfigʵ����Ķ���*/) throws ServletException {
		System.out.println("init()...");
		//��ȡ��ʼ���Ĳ���
		System.out.println(servletConfig.getInitParameter("p1"));
		System.out.println(servletConfig.getInitParameter("p2"));
		Enumeration e = servletConfig.getInitParameterNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
	/*
	 * �����������ڷ���
	 * ���ᱻ���ö�Σ�ÿ���ڴ����������ڵ������������
	 * */
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service()...");
	}

}
