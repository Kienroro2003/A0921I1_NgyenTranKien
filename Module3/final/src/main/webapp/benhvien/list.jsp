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
                <input type="text" placeholder="B???n mu???n t??m g???">
                <button style="padding: 13px 13px"><i class="fas fa-search"></i></button>
            </form>
        </div>
        <div class="container">
            <nav>
                <ul id="main-menu" class="d-flex">
                    <li><a href="../index.jsp">Home</a></li>
                    <li class="acc"><a style="color:#23282E;" href="">B???nh vi???n</a></li>
                </ul>
            </nav>
        </div>

    </div>
    <!-- end header -->
    <div id="wp-featured-post">
        <div class="container justify-content-between">
            <div class="box featured-post">
                <div class="box-head">
                    <h3><a href="/benhvien">Danh sach</a></h3>
                </div>
            </div>
            <div class="box featured-post">
                <div class="box-head">
                    <form action="/benhvien" method="get">
                        <div class="input-group">
                            <%--                            th??m m???i tr?????ng search--%>
                            <input type="text" name="action" value="search" hidden>
                            <input type="search" name="search" class="form-control rounded" placeholder="Search by name" aria-label="Search" aria-describedby="search-addon" />
                            <button type="submit" class="btn btn-outline-primary" style="color:#000;background: red">search</button>
                        </div>
                    </form>
                </div>
            </div>
            <div class="box featured-post">
                <div class="box-head">
                    <a href="/benhvien?action=create" class="create" style="padding: 5px 10px;
                    background: #FF2C2B;
                    font-size: 20px;
                      color: white;
                    border-radius: 10px;" ><i class="fa-solid fa-plus"></i></a>
                </div>
            </div>

        </div>
        <div class="container">
            <div class=" pt-20" style="width: 100%; ">
                <table class="table table-striped table-bordered" style="width: 100%;" id="tableEmployee">
                    <thead>
                    <tr style="background-color: #FF2C2B;">
                        <th>Id</th>
                        <th>M?? b???nh ??n</th>
                        <th>M?? b???nh nh??n</th>
                        <th>T??n b???nh nh??n</th>
                        <th>Ng??y nh???p vi???n</th>
                        <th>Ng??y ra vi???n</th>
                        <th>l?? do nh???p vi???n</th>
                        <th>Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${benhVienList}" var="e">
                        <tr>
                            <td>${e.getId()}</td>
                            <td>${e.getMaBenhAn()}</td>
                            <td>${e.getMaBenhNhan()}</td>
                            <td>${e.getTenBenhNhan()}</td>
                            <td>${e.getNgayNhapVien()}</td>
                            <td>${e.getNgayRaVien()}</td>
                            <td>${e.getLyDo()}</td>
                            <td>
                                <a class="btn btn-primary" href="/benhvien?action=edit&id=${e.getId()}"
                                   style="margin-bottom:10px "><i class="fa-solid fa-pen-to-square"></i></a>
                                    <%--                            modal lien ket     --%>
                                <button type="button"
                                        onclick="getNameId('${e.getId()}','${e.getMaBenhAn()}')"
                                        class="btn btn-primary" data-toggle="modal"
                                        data-target="#exampleModal">
                                    <i class="fa-solid fa-trash"></i>
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="/benhvien" method="get">
                <div class="modal-body">
                    <input type="text" name="action" value="delete" hidden>
                    <span>B???n c?? mu???n xo?? th??ng tin b???nh ??n </span><span class="deleteName"></span>
                    <input type="text" class="deleteId" name="id" hidden>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../DataTables/DataTables-1.11.5/js/jquery.dataTables.min.js"></script>
<script src="../DataTables/DataTables-1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });

    function getNameId(id, name) {
        document.querySelector(".deleteId").value = id;
        document.querySelector(".deleteName").innerText = name;
    }
</script>
</body>
</html>
