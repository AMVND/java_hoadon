package table.dao;

import com.mysql.jdbc.ResultSetMetaData;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import table.model.HoaDon;

public class HoadonDAOImpl implements HoadonDAO {
  private Connection connection() {
    String url = "jdbc:mysql://localhost:3306/db_hoadon";
    String user = "root";
    String pass = "1111"; // Thay mật khẩu ở đây
    Connection conn = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Ket noi CSDL thanh cong !!!");
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Chua ket noi CSDL !!!!");
    }
    return conn;
  }

  @Override
  public List<HoaDon> getKhachhang() {
    Connection conn1 = connection();
    Statement stmt;
    List<HoaDon> ls = new ArrayList<HoaDon>();
    try {
      stmt = conn1.createStatement();
      String sql = "SELECT * FROM db_hoadon.hoadon";
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        HoaDon hd = new HoaDon();
        hd.setMahd(rs.getString("mahd"));
        hd.setKhachhang(rs.getString("khachhang"));
        hd.setNgayghi(rs.getString("ngayghi"));
        hd.setTencongty_kh(rs.getString("tencongty_kh"));
        hd.setTongtien(rs.getString("tongtien"));
        hd.setMasothue(rs.getString("masothue"));
        ls.add(hd);
      }
    } catch (Exception e) {
    }
    return ls;
  }

  @Override
  public void insertKhachhang(HoaDon khachhang) {
    Connection conn1 = connection();
    Statement stmt;
    String sql =
      "INSERT INTO db_hoadon.hoadon VALUES ('" +
      khachhang.getMahd() +
      "','" +
      khachhang.getNgayghi() +
      "','" +
      khachhang.getKhachhang() +
      "'," +
      "'" +
      khachhang.getTencongty_kh() +
      "','" +
      khachhang.getTongtien() +
      "','" +
      khachhang.getMasothue() +
      "')";
    System.out.println(sql);
    try {
      stmt = conn1.createStatement();
      stmt.executeUpdate(sql);
      System.out.println(
        "----------------Them moi thong tin thanh cong-----------------"
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void updateKhachhang(HoaDon khachhang) {
    Connection conn1 = connection();
    Statement stmt;
    String sql =
      "UPDATE db_hoadon.hoadon SET ngayghi='" +
      khachhang.getNgayghi() +
      "',khachhang='" +
      khachhang.getKhachhang() +
      "',tencongty_kh='" +
      khachhang.getTencongty_kh() +
      "',tongtien='" +
      khachhang.getTongtien() +
      "',masothue='" +
      khachhang.getMasothue() +
      "' where mahd ='" +khachhang.getMahd()+ "'";
    try {
      stmt = conn1.createStatement();
      stmt.executeUpdate(sql);
      System.out.println(
        "----------------Cap nhat thong tin thanh cong------------------"
      );
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void deleteKhachhang(String mahd) {
    Connection conn1 = connection();
    Statement stmt;
    String sql = "DELETE FROM db_hoadon.hoadon where mahd='" + mahd + "'";
    try {
      stmt = conn1.createStatement();
      stmt.executeUpdate(sql);
      System.out.println("----------------Xoa thanh cong hoa don: " + mahd);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public HoaDon selectKhachhang(String mahd) {
    Connection conn1 = connection();
    Statement stmt = null;
    String sql = "SELECT * FROM db_hoadon.hoadon WHERE mahd ='"+mahd+"'";
    System.out.println(sql);
    HoaDon hd = new HoaDon();
    try {
      stmt = conn1.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      if (rs.next()) {
        hd.setMahd(rs.getString("mahd"));
        hd.setKhachhang(rs.getString("khachhang"));
        hd.setNgayghi(rs.getString("ngayghi"));
        hd.setTencongty_kh(rs.getString("tencongty_kh"));
        hd.setTongtien(rs.getString("tongtien"));
        hd.setMasothue(rs.getString("masothue"));
        return hd;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public List<HoaDon> SearchKhachhang(String keyword) {
    Connection conn1 = connection();
    Statement stmt;
    List<HoaDon> ls = new ArrayList<HoaDon>();
    try {
      stmt = conn1.createStatement();
      String sql =
        "SELECT * FROM db_hoadon.hoadon WHERE mahd='" +
        keyword +
        "' OR khachhang='" +
        keyword +
        "' OR tencongty_kh='" +
        keyword +
        "' OR masothue='" +
        keyword +
        "' OR ngayghi='" +
        keyword +
        "'";
      ResultSet rs = stmt.executeQuery(sql);
      System.out.println(sql);
      while (rs.next()) {
        HoaDon hd = new HoaDon();
        hd.setMahd(rs.getString("mahd"));
        hd.setKhachhang(rs.getString("khachhang"));
        hd.setNgayghi(rs.getString("ngayghi"));
        hd.setTencongty_kh(rs.getString("tencongty_kh"));
        hd.setTongtien(rs.getString("tongtien"));
        hd.setMasothue(rs.getString("masothue"));
        ls.add(hd);
      }
    } catch (Exception e) {
    }
    return ls;
  }

  @Override
  public void saveKhachhang(HoaDon khachhang) {
  }
}