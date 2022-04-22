<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 25/03/2022
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
          integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
            integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
            integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/4.6.0/js/bootstrap.min.js"
            integrity="sha512-XKa9Hemdy1Ui3KSGgJdgMyYlUg1gM+QhL6cnlyTe2qzMCYm4nAZ1PsVerQzTTXzonUR+dmswHqgJPuwCq1MaAg=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <link href="./assets/sidebars.css" rel="stylesheet">
    <link rel="stylesheet" href="../bootstrap-4.1.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../DataTables/DataTables-1.11.5/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="../assets/css/global.css">
    <link rel="stylesheet" href="../assets/css/reset.css">
    <link rel="stylesheet" href="../assets/css/style.css">
    <title>Trang chu</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <div class="container justify-content-between">
            <a href="">
                <img src="../assets/images/logo.png" alt="" class="logo">
            </a>
            <form class="search">
                <input type="text" placeholder="Bạn muốn tìm gì?">
                <button style="padding: 13px 13px"><i class="fas fa-search"></i></button>
            </form>
        </div>
        <div class="container">
            <nav>
                <ul id="main-menu" class="d-flex">
                    <li><a href="../index.jsp">Home</a></li>
                    <li class="acc"><a style="color:#23282E;" href="">Bệnh viện</a></li>

                    <%--                    <li><a href="">Video</a></li>--%>
                    <%--                    <li><a href="">Sự kiên</a></li>--%>
                    <%--                    <li><a href="">Liên hệ</a></li>--%>
                </ul>
            </nav>
        </div>

    </div>
</div>
<div id="wp-featured-post">
    <%--        <table style="width: 1000px">--%>
    <%--            <tr>--%>
    <%--                <td style="text-align: left;width: 50%">danh sach</td>--%>
    <%--                <td style="text-align: right;width: 50%"> them moi</td>--%>
    <%--                <td></td>--%>
    <%--            </tr>--%>
    <%--        </table>--%>
    <div class="container justify-content-between">
        <div class="box featured-post">
            <div class="box-head">
                <h3>Thêm mới</h3>
            </div>
        </div>
        <div class="box featured-post">
            <div class="box-head">
                <a href="/benhvien" class="create" style="padding: 5px 10px;
                    background: #FF2C2B;
                    font-size: 20px;
                      color: white;
                    border-radius: 10px;"><i class="fa-solid fa-backward"></i></a>
            </div>
        </div>

    </div>
    <div class="container">
        <div class=" pt-20" style="width: 100%; ">
            <c:if test="${mess != null}">
                <p style="color: #1c7430">${mess}</p>
            </c:if>
            <form action="/benhvien?action=edit" method="post">
                <input type="hidden" name="id" value="${benhNhan.getId()}">
                <div class="mb-3">
                    <label for="maBenhAn" class="form-label">Mã bệnh án</label>
                    <input type="text" class="form-control" name="maBenhAn" id="maBenhAn" placeholder="Nhập mã bệnh án" value="${benhNhan.getMaBenhAn()}" disabled>
<%--                    <span style="color: red;">${stringList[0]}</span>--%>
                </div>
                <div class="mb-3">
                    <label for="maBenhNhan" class="form-label">Mã bệnh nhân</label>
                    <input type="text" class="form-control" name="maBenhNhan" id="maBenhNhan" placeholder="Nhập mã bệnh nhân" value="${benhNhan.getMaBenhNhan()}" disabled>
<%--                    <span style="color: red;">${stringList[1]}</span>--%>
                </div>
                <div class="mb-3">
                    <label for="name" class="form-label">Tên bệnh nhân</label>
                    <input type="text" class="form-control" name="name" id="name" placeholder="Nhập tên bệnh nhân" value="${benhNhan.getTenBenhNhan()}">
                    <span style="color: red;">${stringList[0]}</span>
                </div>
                <div class="mb-3 w-50">
                    <label for="ngayNhapVien" class="form-label">Ngày nhập viện: </label>
                    <input type="date" id="ngayNhapVien" class="form-control" name="ngayNhapVien" value="${benhNhan.getNgayNhapVien()}">
                    <span style="color: red;">${stringList[1]}</span>
                </div>
                <div class="mb-3 w-50">
                    <label for="ngayRaVien" class="form-label">Ngày ra viện: </label>
                    <input type="date" id="ngayRaVien" class="form-control" name="ngayRaVien" value="${benhNhan.getNgayRaVien()}">
                    <span style="color: red;">${stringList[2]}</span>
                </div>
                <div class="mb-3">
                    <label for="lyDo" class="form-label">Lý do nhập viện: </label>
                    <input type="text" class="form-control" name="liDo" id="lyDo" placeholder="Enter id card" value="${benhNhan.getLyDo()}">

                </div>
                <%--                <div class="mb-3">--%>
                <%--                    <label for="salary" class="form-label">Salary</label>--%>
                <%--                    <input type="text" class="form-control" name="salary" id="salary" placeholder="Enter salary" value="${benhNhan.getEmployeeSalary()}">--%>
                <%--                    <span style="color: red;">${stringList[2]}</span>--%>
                <%--                </div>--%>
                <%--                <div class="mb-3">--%>
                <%--                    <label for="phone" class="form-label">Phone</label>--%>
                <%--                    <input type="text" class="form-control" name="phone" id="phone" placeholder="Enter phone" value="${benhNhan.getEmployeePhone()}">--%>
                <%--                    <span style="color: red;">${stringList[3]}</span>--%>
                <%--                </div>--%>
                <%--                <div class="mb-3">--%>
                <%--                    <label for="email" class="form-label">Email</label>--%>
                <%--                    <input type="email" class="form-control" name="email" id="email" placeholder="Enter email" value="${benhNhan.getEmployeeEmail()}">--%>
                <%--                    <span style="color: red;">${stringList[4]}</span>--%>
                <%--                </div>--%>
                <%--                <div class="mb-3">--%>
                <%--                    <label for="address" class="form-label">Address</label>--%>
                <%--                    <input type="text" class="form-control" name="address" id="address" placeholder="Enter address" value="${benhNhan.getEmployeeAddress()}">--%>
                <%--                </div>--%>
                <%--                <div class="mb-3">--%>
                <%--                    <label for="position" class="form-label">Position</label>--%>
                <%--                    <select class="form-select" name="positionId" id="position" aria-label="Default select example">--%>
                <%--                        <option selected>Open this select menu</option>--%>
                <%--                        <c:forEach items="${positionList}" var="p">--%>
                <%--                            <option value="${p.getPositionId()}">${p.getPositionName()}</option>--%>
                <%--                        </c:forEach>--%>
                <%--                    </select>--%>
                <%--                </div>--%>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
