package table.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import table.dao.HoadonDAO;
import table.dao.HoadonDAOImpl;
@WebServlet("/deleteHoadon")
public class deleteHoadon extends HttpServlet {
	HoadonDAOImpl hoadonDAO =new HoadonDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String maHD=req.getParameter("mahd");
		hoadonDAO.deleteKhachhang(maHD);
		resp.sendRedirect("/hoadon/list");
	}
}
