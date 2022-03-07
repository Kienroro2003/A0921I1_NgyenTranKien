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
from hop_dong;

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
select *
from hop_dong as hd
left join nhan_vien as nv on nv.ma_nhan_vien = hd.ma_nhan_vien
join khach_hang as kh on kh.ma_khach_hang = hd.ma_khach_hang
join dich_vu as dv on dv.ma_dich_vu = hd.ma_dich_vu
left join hop_dong_chi_tiet as hdct on hdct.ma_hop_dong = hd.ma_hop_dong
-- where month(hd.ngay_lam_hop_dong) = 3 and year(hd.ngay_lam_hop_dong) = 2020
-- group by hd.ma_hop_dong
order by hd.ma_hop_dong asc;

-- 13
hd.ma_hop_dong, nv.ho_ten, kh.ho_ten, kh.so_dien_thoai, dv.ten_dich_vu, hd.tien_dat_coc, sum(hdct.so_luong) as so_luong_dich_vu_di_kem
-- 14

-- 15






