<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%--// col-sm-9 ban dau--%>
<div class="col-sm-12">
    <div class="row">
        <c:forEach items="${lstProduct}" var="sp">

            <div class="col-lg-3 col-md-6 mb-4">
                <div class="card">
                    <div class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
                         data-mdb-ripple-color="light">
                        <img src="https://www.asus.com/media/Odin/Websites/vn/ProductLine/20230523045839.png"
                            <%--                        https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/12.jpg"--%>
                             class="w-100"/>
                        <a href="#!">
                            <div class="hover-overlay">
                                <div class="mask" style="background-color: rgba(251, 251, 251, 0.15);"></div>
                            </div>
                        </a>
                    </div>
                    <div class="card-body text-center">
                        <a href="/detail/${sp.ma}" class="text-reset">
                            <h5 class="card-title mb-2"> ${sp.name} </h5>
                        </a>
                        <h6 href="" class="text-reset "><p>${sp.title} </p></h6>
                        <h6 class="mb-3 price">${sp.price}$</h6>
                        <div class="col">
                            <a href="/gio-hang/add/${sp.ma}" class="btn btn-success btn-block">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>

        </c:forEach>
    </div>

    <%--    <div class="clearfix">--%>
    <%--        <ul class="pagination">--%>
    <%--            &lt;%&ndash; &lt;%&ndash;                <li class="page-item disabled"><a href="#">Previous</a></li>&ndash;%&gt;--%>
    <%--            <c:forEach begin="0" end="${lstChiTietSP.totalPages -1}" varStatus="loop">--%>
    <%--                <li class="page-item">--%>
    <%--                    <a class="page-link"--%>
    <%--                       href="/admin?page=${loop.begin + loop.count -1 }">--%>
    <%--                            ${loop.begin + loop.count}--%>
    <%--                    </a>--%>
    <%--                </li>--%>
    <%--            </c:forEach>--%>
    <%--        </ul>--%>
    <%--    </div>--%>
</div>