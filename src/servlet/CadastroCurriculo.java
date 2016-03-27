package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroCurriculo")
public class CadastroCurriculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CadastroCurriculo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String formacao = request.getParameter("formacao");
		String interese = request.getParameter("areaInterese");
		String resumo = request.getParameter("resumo");
		
		PrintWriter out = response.getWriter();
		out.println("Formação: " + formacao);
		out.println("Area: " + interese);
		out.println("Resumo: " + resumo);
	}

}
