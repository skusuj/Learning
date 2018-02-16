/**
 * 
 */
package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sujata subhash
 *
 */
public class MyFirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("MyFirstServlet start");
		PrintWriter out = resp.getWriter();
		out.write("Hello World");
	}

}
