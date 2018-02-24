package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**ģ��GenericServlet
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
	 * �������һ������init()����֮�󱻵���
	 * init()����֮�󣬱���ĳ�Աthis.config�Ѿ���ֵ��
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
	 * ���ᱻ������֮�����ϱ�����
	 * */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//��tomcat���ݵ�ServletConfig���Ƹ������һ����Ա����ʵ���ǰ�����������������������������ʹ��
		this.config = config;
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * �����Ƿ����ʹ��ServletConfig�ĳ�Ա�أ�  ���Ե� ��Ҳ����init����֮��ִ��
		 * */
		System.out.println("ÿ�δ������󶼻ᱻ����");
		
	}
	//ģ��GenericServlet�еķ���

	public ServletContext getServletContext() {
		return config.getServletContext();
	}
	public String getServletName() {
		return config.getServletName();
	}

}
