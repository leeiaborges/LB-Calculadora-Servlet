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

				
		if((request.getParameter("val1") != null) && (request.getParameter("val2") != null)){
			int val1 = Integer.parseInt(request.getParameter("val1"));
			int val2 = Integer.parseInt(request.getParameter("val2"));
			String opcao = request.getParameter("opcao");
			
			Calcular c = new Calcular (val1, val2);
			
			if(opcao.equals("+")){
				int resultado = c.somar();
				request.setAttribute("res", resultado);
				}else if (opcao.equals("-")){
					int resultado = c.diminuir();
					request.setAttribute("res", resultado);
				}else if (opcao.equals("*")){
					int resultado = c.multiplicar();
					request.setAttribute("res", resultado);
				}else if (opcao.equals("/")){
					int resultado = c.dividir();
					request.setAttribute("res", resultado);
				}
		}
		
		request.getRequestDispatcher("/").forward(request, response);

	    //response.getWriter().printf("<H1> Resultado = %d </H1>", result);

	}

}
