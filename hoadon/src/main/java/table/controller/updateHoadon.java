package table.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import table.dao.HoadonDAOImpl;
import table.model.HoaDon;

@WebServlet("/updateHoadon")
public class updateHoadon extends HttpServlet {

  HoadonDAOImpl hoadonDAO = new HoadonDAOImpl();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    // TODO Auto-generated method stub
    String mahd = req.getParameter("mahd");
    HoaDon hd = hoadonDAO.selectKhachhang(mahd);
    RequestDispatcher dispatcher = getServletContext()
      .getRequestDispatcher("/WEB-INF/hoadon-Updateform.jsp");
    req.setAttribute("Hoadon", hd);
    dispatcher.forward(req, resp);
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    // TODO Auto-generated method stub

    String mahd = req.getParameter("mahd");
    String ngayghi = req.getParameter("ngayghi");
    String khachhang = req.getParameter("khachhang");
    String tencongty_kh = req.getParameter("tencongty_kh");
    String tongtien = req.getParameter("tongtien");
    String masothue = req.getParameter("masothue");
    
    HoaDon hd = new HoaDon(mahd,khachhang, tencongty_kh, ngayghi, masothue, tongtien);
    
    hd.setMahd(mahd);
    hd.setKhachhang(khachhang);
    hd.setNgayghi(ngayghi);
    hd.setTencongty_kh(tencongty_kh);
    hd.setTongtien(tongtien);
    hd.setMasothue(masothue);
    
    HoadonDAOImpl hoadonDAO = new HoadonDAOImpl();
    hoadonDAO.updateKhachhang(hd);
    resp.sendRedirect("/hoadon/list");
  }
}