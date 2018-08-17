package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Category;
import model.bean.News;
import model.dao.CatDAO;
import model.dao.NewsDAO;
import util.DefineUtil;

@WebServlet("/PublicIndexNewsController")
public class PublicIndexNewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsDAO newsDAO;
	private CatDAO catDAO;

	public PublicIndexNewsController() {
		super();
		newsDAO = new NewsDAO();
		catDAO = new CatDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		int idCat = 0;

		try {

			idCat = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			response.sendRedirect(request.getContextPath() + "/404");
			return;
		}
		int currentPage = 1;
		try {
			currentPage = Integer.parseInt(request.getParameter("page"));
		} catch (Exception e) {
			currentPage = 1;
		}
		Category category = catDAO.getItem(idCat);
		if (category == null) {
			response.sendRedirect(request.getContextPath() + "/404");
			return;
		}

		int numberOfItems = newsDAO.numberOfItems();
		int numberOfPage = (int) Math.ceil((float) numberOfItems / DefineUtil.NUMBER_PER_PAGE);
		if (currentPage > numberOfPage || currentPage < 1) {
			currentPage = 1;
		}

		int offset = (currentPage - 1) * DefineUtil.NUMBER_PER_PAGE;

		ArrayList<News> news = newsDAO.getItemsbyCategoryIdPagination(offset, idCat);

		request.setAttribute("numberOfPage", numberOfPage);
		request.setAttribute("numberOfItems", numberOfItems);
		request.setAttribute("news", news);
		request.setAttribute("category", category);

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/public/categories.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
