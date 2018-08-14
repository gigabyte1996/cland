package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.News;
import model.dao.NewsDAO;
import util.DefineUtil;

@WebServlet("/PublicIndexController")
public class PublicIndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsDAO newsDAO;
       
    public PublicIndexController() {
        super();
        newsDAO = new NewsDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
//		int numberOfItems = newsDAO.numberOfItems();
//		int numberOfPages = (int) Math.ceil((float)numberOfItems / DefineUtil.NUMBER_PER_PAGE);
//		
//		int currentPage = 1;
//		try {
//			currentPage = request.getParameter("page")
//		}
//		
//		
//		ArrayList<News> news = NewsDAO.getItemsPagination();
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/admin/news/news.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
