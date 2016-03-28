package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroPessoaServlet")
public class CadastroPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CadastroPessoaServlet() {
        super();
    }
    String nome;
	int idade;
	String sobrenome;
	String rua;
	String complemento;
	String cidade;
	String estado;
	String cep;
	int numero;
	String[] sexo;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.nome = retornaParametro(request,"nome");
		this.sobrenome = retornaParametro(request,"sobrenome");
		this.idade= Integer.parseInt(retornaParametro(request,"idade"));
		this.rua = retornaParametro(request,"rua");
		this.complemento = retornaParametro(request,"complemento");
		this.cidade = retornaParametro(request,"cidade");
		this.estado = retornaParametro(request,"estado");
		this.cep = retornaParametro(request,"cep");
		this.numero = Integer.parseInt(retornaParametro(request,"numero"));
		this.sexo = request.getParameterValues("sexo");
	}

	private String retornaParametro(HttpServletRequest request, String parametro) throws ServletException
	{
		if(request.getParameter(parametro) == null)
		{
			throw new ServletException();
		}
		else
			return request.getParameter(parametro);
	}
}
