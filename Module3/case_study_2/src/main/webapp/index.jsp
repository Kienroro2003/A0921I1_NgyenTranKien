<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 25/03/2022
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
          integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="./assets/css/global.css">
    <link rel="stylesheet" href="./assets/css/reset.css">
    <link rel="stylesheet" href="./assets/css/style.css">
    <title>Trang chu</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <div class="container justify-content-between">
            <a href="index.jsp">
                <img src="assets/images/logo.png" alt="" class="logo">
            </a>
            <form class="search">
                <input type="text" placeholder="Bạn muốn tìm gì?">
                <button style="padding: 13px 13px"><i class="fas fa-search"></i></button>
            </form>
        </div>
        <div class="container">
            <nav>
                <ul id="main-menu" class="d-flex">
                    <li class="acc"><a style="color:#23282E;" href="">Home</a></li>
                    <li><a href="/employees">Employee</a></li>
                    <li><a href="/customers">Customer</a></li>
                    <li><a href="/services">Service</a></li>
                    <li><a href="/contracts">Contract</a></li>
                    <%--                    <li><a href="">Video</a></li>--%>
                    <%--                    <li><a href="">Sự kiên</a></li>--%>
                    <%--                    <li><a href="">Liên hệ</a></li>--%>
                </ul>
            </nav>
        </div>

    </div>
    <!-- end header -->
    <div id="wp-featured-post">
        <div class="container">
            <div class="box featured-post">
                <div class="box-head">
                    <h3>Nổi bật</h3>
                </div>
                <div class="box-body pt-20">
                    <ul class="list-featured-post d-flex">
                        <li>
                            <a href="" class="post-thuml">
                                <img src="./assets/images/villa.jpeg" alt="">
                            </a>
                            <a href="" class="post-title">Villa Hội An giá 1.xxx.xxx</a>
                        </li>
                        <li>
                            <a href="" class="post-thuml">
                                <img src="assets/images/house.jpeg" alt="">
                            </a>
                            <a href="" class="post-title">House Tưng bừng</a>
                        </li>
                        <li>
                            <a href="" class="post-thuml">
                                <img src="assets/images/room.jpeg" alt="">
                            </a>
                            <a href="" class="post-title">Room 5 sao
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <%--<main class="d-flex col-12">--%>
    <%--  <div class="d-flex col-2 flex-column flex-shrink-0 p-3 text-white bg-dark" style=" height: 100vw;">--%>
    <%--    <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">--%>
    <%--      <svg class="bi me-2" width="40" height="32">--%>
    <%--        <use xlink:href="#bootstrap"/>--%>
    <%--      </svg>--%>
    <%--      <span class="fs-4">Menu</span>--%>
    <%--    </a>--%>
    <%--    <hr>--%>
    <%--    <ul class="nav nav-pills flex-column mb-auto">--%>
    <%--      <li class="nav-item">--%>
    <%--        <a href="#" class="nav-link active" aria-current="page">--%>
    <%--          <svg class="bi me-2" width="16" height="16">--%>
    <%--            <use xlink:href="#home"/>--%>
    <%--          </svg>--%>
    <%--          List--%>
    <%--        </a>--%>
    <%--      </li>--%>
    <%--      <li>--%>
    <%--        <a href="#" class="nav-link text-white">--%>
    <%--          <svg class="bi me-2" width="16" height="16">--%>
    <%--            <use xlink:href="#speedometer2"/>--%>
    <%--          </svg>--%>
    <%--          Create--%>
    <%--        </a>--%>
    <%--      </li>--%>
    <%--    </ul>--%>
    <%--    <hr>--%>
    <%--  </div>--%>
    <%--  <div class="content bg-primary col-10">--%>

    <%--</div>--%>
    <%--</main>--%>
    <div id="footer">
        <div class="container">
            <div class="box logo">
                <div class="box-head">
                    <h3>unitop</h3>
                </div>
                <div class="box-body">
                    <img src="assets/images/logo.png" alt="">
                </div>
            </div>
            <div class="box about-us">
                <div class="box-head">
                    <h3>về chúng tôi</h3>
                </div>
                <div class="box-body">
                    <p>Unitop.vn là hệ thống đào tạo lập trình web online theo lộ trình từng bước. Hệ thống phát triển từ tháng 6/2017 đến nay đã có gần 2.000 người theo học và đạt kết quả tốt.</p>
                    <a href="">http://unitop.vn</a>
                </div>
            </div>
            <div class="box follow-us">
                <div class="box-head">
                    <h3>theo dõi</h3>
                </div>
                <div class="box-body">
                    <ul class="icon d-flex justify-content-between">
                        <li><a href=""><i class="fab fa-facebook-f"></i></a></li>
                        <li><a href=""><i class="fab fa-instagram"></i></a></li>
                        <li><a href=""><i class="fab fa-youtube"></i></a></li>
                        <li><a href=""><i class="fab fa-pinterest"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
