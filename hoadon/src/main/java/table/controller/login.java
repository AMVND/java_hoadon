package table.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import table.model.LoginService;

@WebServlet("/login")
public class login extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    // TODO Auto-generated method stub
    String UserID, Pass;
    UserID = req.getParameter("UserID");
    Pass = req.getParameter("Pass");
    System.out.println("Day la nguoi dung: " + UserID);

    LoginService loginService = new LoginService();
    boolean result = loginService.authenticate(UserID, Pass);

    if (result) {
      HttpSession session = req.getSession();
      session.setAttribute("username", UserID);
      session.setAttribute("pass", Pass);
      System.out.println("UserID: " + UserID);
      resp.sendRedirect("/hoadon/list");
      return;
    } else {
      resp.sendRedirect("/login.jsp");
      return;
    }
  }
}
