create database if not exists ChuyenDoiERD;
use ChuyenDoiERD;

create table PhieuXuat(
SoPX int primary key auto_increment,
NgayXuat datetime
);

create table VatTu(
MaVTU int primary key auto_increment,
TenVTU varchar(50)
);

create table PhieuNhap(
SoPN int primary key auto_increment,
NgayNhap varchar(50)
);

create table DonDH(
SoDH int primary key auto_increment,
NgayDH datetime,
MaNCC int
);

create table NhaCC(
MaNCC int primary key auto_increment,
TenNCC varchar(50),
DiaChi varchar(50)
);

create table NhaCCSDT(
MaSDT int primary key auto_increment,
SDT varchar(10),
MaNCC int,
foreign key(MaNCC) references NhaCC(MaNCC)
);

create table ChiTietPhieuXuat(
DGXuat int,
SLXuat int,
SoPX int,
SoVTU int,
foreign key (SoPX) references PhieuXuat(SoPX),
foreign key (SoVTU) references VatTu(MaVTU)
);

create table ChiTietPhieuNhap(
DGNhap int,
SLNhap int,
MaVTU int,
SoPN int,
foreign key (MaVTU) references VatTu(MaVTU),
foreign key (SoPN) references PhieuNhap(SoPN)
);

create table ChiTietDonDatHang(
MaVTU int,
SoDH int,
foreign key (MaVTU) references VatTu(MaVTU),
foreign key (SoDH) references DonDH(SoDH)
);

create table CungCap(
SoDH int,
MaNCC int,
foreign key(SoDH) references DonDH(SoDH),
foreign key(MaNCC) references NhaCC(MaNCC)
);

alter table DonDH add constraint FK_MaNCC foreign key (MaNCC) references NhaCC(MaNCC);

