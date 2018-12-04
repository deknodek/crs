package com.ipartek.formacion.ejemplocapas.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.ejemplocapas.pojos.PojoException;
import com.ipartek.formacion.ejemplocapas.pojos.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		Usuario usuario;
		try {
		usuario = new Usuario(null, email, password);
		}catch(PojoException e) {
			response.sendRedirect("login.jsp");
			return;
		}
		if("ima@mail.com".equals(usuario.getEmail()) && "Pa$$word".equals(usuario.getPassword())){
			request.getSession().setAttribute("usuario", usuario);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
		
		//response.getWriter().println("hola"+usuario.getEmail());
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
