package com.proj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeiroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

				
		String val1s = request.getParameter("val1");
		String val2s = request.getParameter("val2");
		String opcao = request.getParameter("opcao");
		

		
		//if((request.getParameter("val1") != null) && (request.getParameter("val2") != null)){
			int val1i = Integer.parseInt("val1");
			int val2i = Integer.parseInt("val2");
			int resultado = 0;
            
			if(opcao.equals("+")){
				   resultado = val1i + val2i;
				}else if (opcao.equals("-")){
				   resultado = val1i - val2i;
				}else if (opcao.equals("*")){
				   resultado = val1i * val2i;
				}else if (opcao.equals("/")){
				    resultado = val1i / val2i;
				}


		
		

	    //response.getWriter().printf("<H1> Resultado = %d </H1>", result);

	    
	}

}
