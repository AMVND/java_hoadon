package table.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import table.dao.HoadonDAO;
import table.dao.HoadonDAOImpl;
import table.model.HoaDon;

@WebServlet("/searchHoadon")
public class searchHoadon extends HttpServlet {
  private static final long serialVersionUID = 1L;
  HoadonDAOImpl hoadonDAO = new HoadonDAOImpl();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    String keyword = req.getParameter("search");
    // TODO Auto-generated method stub
    List<HoaDon> nv = hoadonDAO.SearchKhachhang(keyword);
    RequestDispatcher dispatcher = getServletContext()
      .getRequestDispatcher("/search-view.jsp");
    req.setAttribute("Hoadon", nv);
    dispatcher.forward(req, resp);
  }
}
