use CaseStudy;

select *
from vi_tri;

select *
from trinh_do;

select *
from bo_phan;

select *
from nhan_vien;

select *
from khach_hang;

select *
from dich_vu;

select *
from dich_vu_di_kem;

select *
from hop_dong
where year(ngay_lam_hop_dong) = 2020;



-- 1

-- 2
select * 
from nhan_vien as nv
where (nv.ho_ten like 'H%' or nv.ho_ten like 'T%' or nv.ho_ten like 'K%') and char_length(nv.ho_ten) <= 15;
-- 3
select *
from khach_hang
where (round(datediff(CURDATE(), ngay_sinh) / 365) between 18 and 50)
and (dia_chi like '%Đà Nẵng' or dia_chi like '%Quảng Trị');

-- 4
select kh.ma_khach_hang, kh.ho_ten, count(hd.ma_khach_hang) as so_lan_dat_phong
from khach_hang as kh
join hop_dong as hd on kh.ma_khach_hang = hd.ma_khach_hang
join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
where lk.ten_loai_khach like 'Diamond'
group by hd.ma_khach_hang
order by so_lan_dat_phong asc;

-- 5
select kh.ma_khach_hang, kh.ho_ten, lk.ten_loai_khach, hd.ma_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc,dv.ten_dich_vu,dv.chi_phi_thue,dvdk.gia,hdct.so_luong, sum(dv.chi_phi_thue +(dvdk.gia * hdct.so_luong)) as tong
from hop_dong as hd
left join khach_hang as kh on hd.ma_khach_hang =  kh.ma_khach_hang
left join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
left join dich_vu as dv on hd.ma_dich_vu = dv.ma_dich_vu
left join hop_dong_chi_tiet as hdct on hdct.ma_hop_dong = hd.ma_hop_dong
left join dich_vu_di_kem as dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by ma_hop_dong;

-- 6
select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, ldv.ten_loai_dich_vu 
from dich_vu as dv
join hop_dong as hd on hd.ma_dich_vu = dv.ma_dich_vu
join loai_dich_vu as ldv on ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
where not month(hd.ngay_lam_hop_dong) in (1,2,3)
group by dv.ma_dich_vu;

-- 7
select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu as dv
join hop_dong as hd on hd.ma_dich_vu = dv.ma_dich_vu
join loai_dich_vu as ldv on ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
where year(hd.ngay_lam_hop_dong) = 2020 
and dv.ma_dich_vu not in (select ma_dich_vu from hop_dong where
year(ngay_lam_hop_dong) = 2021)
group by dv.ma_dich_vu;

-- 8 

-- 9
select month(hd.ngay_lam_hop_dong) as thang, count(month(hd.ngay_lam_hop_dong)) as so_luong_khach_hang
from hop_dong as hd
where year(hd.ngay_lam_hop_dong) = 2021
group by thang
order by thang asc ;

-- 10
select hd.ma_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, hd.tien_dat_coc, sum(hdct.so_luong)
from hop_dong as hd
left join hop_dong_chi_tiet as hdct on hdct.ma_hop_dong = hd.ma_hop_dong
group by hd.ma_hop_dong;

-- 11
select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem
from dich_vu_di_kem as dvdk
right join hop_dong_chi_tiet as hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
join hop_dong as hd on hd.ma_hop_dong = hdct.ma_hop_dong
join khach_hang as kh on kh.ma_khach_hang = hd.ma_khach_hang
join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
where lk.ten_loai_khach = "Diamond" and kh.dia_chi like "%Vinh";
-- 12
select hd.ma_hop_dong, nv.ho_ten, kh.ho_ten, kh.so_dien_thoai, dv.ten_dich_vu, hd.tien_dat_coc, hd.ngay_lam_hop_dong-- , sum(hdct.so_luong) as so_luong_dich_vu_di_kem
from hop_dong as hd
left join nhan_vien as nv on nv.ma_nhan_vien = hd.ma_nhan_vien
join khach_hang as kh on kh.ma_khach_hang = hd.ma_khach_hang
join dich_vu as dv on dv.ma_dich_vu = hd.ma_dich_vu
left join hop_dong_chi_tiet as hdct on hdct.ma_hop_dong = hd.ma_hop_dong
where month(hd.ngay_lam_hop_dong) in (10,11,12) and year(hd.ngay_lam_hop_dong) = 2020
and dv.ma_dich_vu not in (select ma_dich_vu from hop_dong as hd where month(hd.ngay_lam_hop_dong) in (1,2,3,4,5,6) and year(hd.ngay_lam_hop_dong) = 2021)
group by hd.ma_hop_dong
order by hd.ma_hop_dong asc;

-- 13
select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem, sum(hdct.so_luong) as so_luong_dich_vu_di_kem
from dich_vu_di_kem as dvdk
right join hop_dong_chi_tiet as hdct on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by hdct.ma_dich_vu_di_kem
having so_luong_dich_vu_di_kem >= all (select sum(so_luong) from hop_dong_chi_tiet group by ma_dich_vu_di_kem)
order by dvdk.ma_dich_vu_di_kem asc ;

-- 14
select hd.ma_hop_dong, ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(hdct.ma_dich_vu_di_kem) as so_lan_su_dung
from hop_dong_chi_tiet as hdct
left join hop_dong as hd on hdct.ma_hop_dong = hd.ma_hop_dong
join dich_vu_di_kem as dvdk on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
join dich_vu as dv on hd.ma_dich_vu = dv.ma_dich_vu
join loai_dich_vu as ldv on ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
group by hdct.ma_dich_vu_di_kem
having so_lan_su_dung = 1
order by hd.ma_hop_dong asc;
-- 15
select nv.ma_nhan_vien, nv.ho_ten, td.ten_trinh_do, bp.ten_bo_phan, nv.so_dien_thoai, nv.dia_chi
from hop_dong as hd
left join nhan_vien as nv on nv.ma_nhan_vien = hd.ma_nhan_vien
join trinh_do as td on td.ma_trinh_do = nv.ma_trinh_do
join bo_phan as bp on bp.ma_bo_phan = nv.ma_bo_phan
where year(hd.ngay_lam_hop_dong) in(2021,2020)
group by hd.ma_nhan_vien 
having count(hd.ma_nhan_vien) <= 3;
-- 16
create temporary table nhan_vien_temp(select * from nhan_vien);

create view nhan_vien_duoc_lam as 
select ma_nhan_vien
from hop_dong
where year(ngay_lam_hop_dong) in (2019,2020,2021)
group by ma_nhan_vien;

select *
from nhan_vien_duoc_lam;

delete from nhan_vien_temp 
where ma_nhan_vien not in (select * from nhan_vien_duoc_lam);

select *
from nhan_vien_temp;

-- 17

create view ex_17 as
select kh.ma_khach_hang,hd.ngay_lam_hop_dong,lk.ten_loai_khach, sum(dv.chi_phi_thue + (dvdk.gia * hdct.so_luong)) as tong_tien
from dich_vu as dv
right join hop_dong as hd on hd.ma_dich_vu = dv.ma_dich_vu
join hop_dong_chi_tiet as hdct on hdct.ma_hop_dong = hd.ma_hop_dong
join dich_vu_di_kem as dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
join khach_hang as kh on kh.ma_khach_hang = hd.ma_khach_hang
join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
group by kh.ma_khach_hang;

drop view ex_17;

select *
from ex_17
where tong_tien > 10000000 and ten_loai_khach in ("Platinium") and year(ngay_lam_hop_dong) = 2021 ;

select *
from khach_hang as kh
where kh.ma_khach_hang in (select ma_khach_hang from ex_17 where tong_tien > 10000000 and lk.ten_loai_khach in ("Diamond","Platinium") and year(hd.ngay_lam_hop_dong) = 2021) ;

update khach_hang as kh
set kh.ma_loai_khach=1
where kh.ma_khach_hang in (select ma_khach_hang from ex_17 where tong_tien > 10000000 and ten_loai_khach in ("Platinium") and year(ngay_lam_hop_dong) = 2021) ;

set sql_safe_updates = 0;

-- 18

select kh.ma_khach_hang, kh.ho_ten
from khach_hang as kh
right join hop_dong as hd on hd.ma_khach_hang = kh.ma_khach_hang
where year(hd.ngay_lam_hop_dong) < 2021;

create view ex_18 as
select kh.ma_khach_hang, kh.ho_ten
from khach_hang as kh
right join hop_dong as hd on hd.ma_khach_hang = kh.ma_khach_hang
where year(hd.ngay_lam_hop_dong) < 2021;

drop view ex_18;

select *
from ex_18;

drop view ex_18;

create temporary table khach_hang_temp(select * from khach_hang);

select ma_khach_hang from khach_hang_temp;

delete from khach_hang_temp
where ma_khach_hang in(select * from ex_18);


-- 19
create temporary table dich_vu_di_kem_temp as(select * from dich_vu_di_kem);

drop temporary table dich_vu_di_kem;

select * from dich_vu_di_kem_temp;

create view ex_19 as
select dvdk.ma_dich_vu_di_kem
from dich_vu_di_kem as dvdk
right join hop_dong_chi_tiet as hdct on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
join hop_dong as hd on hd.ma_hop_dong = hdct.ma_hop_dong
where year(hd.ngay_lam_hop_dong) = 2020 and hdct.so_luong > 10;

select * 
from ex_19;

update dich_vu_di_kem_temp as dvdk_temp
set dvdk_temp.gia = dvdk_temp.gia * 2
where dvdk_temp.ma_dich_vu_di_kem in(select * from ex_19);

select * 
from dich_vu_di_kem_temp;

-- 20
select nv.ma_nhan_vien as id, nv.ho_ten, nv.email, nv.so_dien_thoai, nv.ngay_sinh, nv.dia_chi
from nhan_vien as nv
union all
select kh.ma_khach_hang as id, kh.ho_ten, kh.email, kh.so_dien_thoai, kh.ngay_sinh, kh.dia_chi
from khach_hang as kh;

-- 21
create view v_nhan_vien as
select * 
from nhan_vien as nv
right join hop_dong as hd on hd.ma_nhan_vien = nv.ma_nhan_vien
where nv.dia_chi like '';

-- 22

-- 23
delimiter $$
create procedure sp_xoa_khach_hang(in id int)
begin 
delete from khach_hang_temp
where khach_hang_temp.ma_khach_hang = id;
end $$
delimiter ;

call sp_xoa_khach_hang(2);

select * 
from khach_hang_temp;

-- 24

delimiter $$

create procedure sp_them_moi_hop_dong(in 
p_ngay_them_hop_dong date,
p_ngay_ket_thuc date, 
p_tien_dat_coc int,
p_ma_nhan_vien int,
p_ma_khach_hang int,
p_ma_dich_vu int)
begin
insert into hop_dong (
ngay_lam_hop_dong, 
ngay_ket_thuc, 
tien_dat_coc, 
ma_nhan_vien, 
ma_khach_hang, 
ma_dich_vu)
values (p_ngay_them_hop_dong,
p_ngay_ket_thuc, 
p_tien_dat_coc, 
p_ma_nhan_vien, 
p_ma_khach_hang, 
p_ma_dich_vu);
end $$

delimiter ;

drop procedure sp_them_moi_hop_dong;

call sp_them_moi_hop_dong(now(), now(), 10000000,1,2,3);
select *
from hop_dong;















