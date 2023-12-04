package table.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import table.dao.HoadonDAOImpl;
import table.model.HoaDon;

@WebServlet("/saveHoadon")
public class saveHoadon extends HttpServlet {

  private static final long serialVersionUID = 1L;
  HoadonDAOImpl hoadonDAO = new HoadonDAOImpl();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    // TODO Auto-generated method stub
    HoaDon hd = new HoaDon();
    String mahd = req.getParameter("mahd");
    String ngayghi = req.getParameter("ngayghi");
    String khachhang = req.getParameter("khachhang");
    String tencongty_kh = req.getParameter("tencongty_kh");
    String tongtien = req.getParameter("tongtien");
    String masothue = req.getParameter("masothue");
    System.out.println(tongtien);
    
    /*INSERT**/
    hd.setMahd(mahd);
    hd.setKhachhang(khachhang);
    hd.setNgayghi(ngayghi);
    hd.setTencongty_kh(tencongty_kh);
    hd.setTongtien(tongtien);
    hd.setMasothue(masothue);
    hoadonDAO.insertKhachhang(hd);
    resp.sendRedirect("/hoadon/list");
  }
}