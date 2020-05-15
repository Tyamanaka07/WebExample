package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ShouhinDAO;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sname = request.getParameter("sname");
		String tanka = request.getParameter("tanka");
		int ta = Integer.parseInt(tanka);

		model.Shouhin s = new model.Shouhin(0,sname,ta);
		ShouhinDAO sdao = new ShouhinDAO();
		sdao.insert(s);


		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>商品追加</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<p>商品を追加しました</p>");
		out.println("<p><a href = \"slist\">商品一覧</a> " + "</p>");

		out.println("</body>");
		out.println("</html>");
	}

}
