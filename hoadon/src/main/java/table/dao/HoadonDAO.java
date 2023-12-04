package table.dao;

import java.util.List;

import table.model.HoaDon;

public interface HoadonDAO {
	public List<HoaDon> getKhachhang();
	public void insertKhachhang(HoaDon khachhang) ;
	public void saveKhachhang(HoaDon khachhang);
	public void updateKhachhang(HoaDon khachhang) ;
	public void deleteKhachhang(String mahd) ;
	public List<HoaDon> SearchKhachhang(String keyword);
	public HoaDon selectKhachhang(String mahd);
}
