package com.fa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fa.bean.RegisterBean;
import com.fa.dao.InsertRegistration;
@WebServlet("/register")
public class RegisterationServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("name");
		Long mobile=Long.parseLong(req.getParameter("mobile"));
		String gender=req.getParameter("gender");
		String email=req.getParameter("email");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		int zip=Integer.parseInt(req.getParameter("zip"));
		
		RegisterBean.setName(name);
		RegisterBean.setMobile(mobile);
		RegisterBean.setGender(gender);
		RegisterBean.setEmail(email);
		RegisterBean.setCity(city);
		RegisterBean.setState(state);
		RegisterBean.setZip(zip);
		
		InsertRegistration.insertRegisterDB();
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}
}
