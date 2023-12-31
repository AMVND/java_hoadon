package table.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import table.dao.HoadonDAOImpl;

@WebServlet("/insertHoadon")
public class insertHoadon extends HttpServlet {

  private static final long serialVersionUID = 1L;
  HoadonDAOImpl hoadonDAO = new HoadonDAOImpl();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    // TODO Auto-generated method stub
    RequestDispatcher dispatcher = getServletContext()
      .getRequestDispatcher("/WEB-INF/hoadon-form.jsp");
    dispatcher.forward(req, resp);
  }
}