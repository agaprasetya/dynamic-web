package com.inibae.training01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Training01
 */
@WebServlet("/Training01")
public class Training01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Training01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Model1 orang = new Model1();
		request.setAttribute("orang", orang);
		getServletContext().getRequestDispatcher("/view1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Model1 orang = new Model1();
		
		String namaDariForm = request.getParameter("nama");
		String alamatDariForm = request.getParameter("alamat");
		
		orang.setNama(namaDariForm);
		orang.setAlamat(alamatDariForm);
		
		request.setAttribute("orang", orang);
		getServletContext().getRequestDispatcher("/view1.jsp").forward(request, response);
	}

}
