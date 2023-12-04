CREATE DATABASE db_hoadon;

CREATE TABLE db_hoadon.hoadon (
	MaHD nvarchar(20) primary key not null, 
    NgayGhi varchar(20),
    KhachHang varchar(20),
    TenCongTy_KH varchar(50),
    TongTien Double,
    MaSoThue varchar(20)
) 

SELECT * FROM db_hoadon.hoadon WHERE mahd ='1'
