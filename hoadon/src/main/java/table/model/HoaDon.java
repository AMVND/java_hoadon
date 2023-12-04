package table.model;

public class HoaDon {

  private String mahd, khachhang, tencongty_kh, ngayghi, masothue, tongtien;

  public HoaDon() {
    super();
  }

public HoaDon(String mahd, String khachhang, String tencongty_kh, String ngayghi, String masothue, String tongtien) {
	super();
	this.mahd = mahd;
	this.khachhang = khachhang;
	this.tencongty_kh = tencongty_kh;
	this.ngayghi = ngayghi;
	this.masothue = masothue;
	this.tongtien = tongtien;
}

public HoaDon(String khachhang, String tencongty_kh, String ngayghi, String masothue, String tongtien) {
	super();
	this.khachhang = khachhang;
	this.tencongty_kh = tencongty_kh;
	this.ngayghi = ngayghi;
	this.masothue = masothue;
	this.tongtien = tongtien;
}

public String getMahd() {
	return mahd;
}

public void setMahd(String mahd) {
	this.mahd = mahd;
}

public String getKhachhang() {
	return khachhang;
}

public void setKhachhang(String khachhang) {
	this.khachhang = khachhang;
}

public String getTencongty_kh() {
	return tencongty_kh;
}

public void setTencongty_kh(String tencongty_kh) {
	this.tencongty_kh = tencongty_kh;
}

public String getNgayghi() {
	return ngayghi;
}

public void setNgayghi(String ngayghi) {
	this.ngayghi = ngayghi;
}

public String getMasothue() {
	return masothue;
}

public void setMasothue(String masothue) {
	this.masothue = masothue;
}

public String getTongtien() {
	return tongtien;
}

public void setTongtien(String tongtien) {
	this.tongtien = tongtien;
}

@Override
public String toString() {
	return "HoaDon [mahd=" + mahd + ", khachhang=" + khachhang + ", tencongty_kh=" + tencongty_kh + ", ngayghi="
			+ ngayghi + ", masothue=" + masothue + ", tongtien=" + tongtien + "]";
}
}