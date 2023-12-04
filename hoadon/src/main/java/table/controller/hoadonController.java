package table.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import table.dao.HoadonDAOImpl;
import table.model.HoaDon;

@WebServlet("/list")
public class hoadonController extends HttpServlet {
	HoadonDAOImpl hoadonDAO =new HoadonDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<HoaDon> hoadon= hoadonDAO.getKhachhang();
		HttpSession userSession=req.getSession();
		String user=(String)userSession.getAttribute("username");
		String pas=(String)userSession.getAttribute("pass");
		if(user.compareTo("root")==0 && pas.compareTo("1111")==0) { //Tài khoản và mật khẩu đăng nhập
			RequestDispatcher rq = req.getRequestDispatcher("list-hoadon.jsp");
			req.setAttribute("Hoadon", hoadon);
			rq.forward(req, resp);
		}else {
			RequestDispatcher rq = req.getRequestDispatcher("list-hoadon_user.jsp");
			req.setAttribute("Hoadon", hoadon);
			rq.forward(req, resp);
		}
		
	}
}
