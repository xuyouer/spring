<%--
  Created by IntelliJ IDEA.
  User: xiaom
  Date: 2024/7/27
  Time: 下午4:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%
    // String pathname = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
    // pageContext.setAttribute("path", pathname);

    String protocol = request.getHeader("X-Scheme") != null ? request.getHeader("X-Scheme") : request.getScheme();
    String pathname = protocol + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
    pageContext.setAttribute("path", pathname);
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <base href="<%=pathname %>"/>
    <title><spring:message code="xiaomizha.cloud"/></title>
</head>
<body>

<div id="header" class="position-absolute">
    <div class="header-container">
        <a class="header-logo" href="index">
            <div class="header-logo-wrapper">
                <img src="images/xiaomizha.png" alt="xiaomizha" class="header-logo-img">
            </div>
        </a>
        <div class="header-nav"></div>
        <div class="header-user">
            <div class="header-user-info">
                <a href="${users != null ? 'javascript: void(0);' : 'users/login'}" class="user-login">
                    <div class="icon-normal icon-30 header-icon-mr-10">
                        <svg t="1722151733719" class="icon" viewBox="0 0 1024 1024" version="1.1"
                             xmlns="http://www.w3.org/2000/svg" p-id="11075">
                            <path d="M512.00128 1008.84864c-273.96992 0-496.84608-222.8736-496.84608-496.84352s222.87616-496.8448 496.84608-496.8448S1008.8448 238.03776 1008.8448 512.00512 785.96864 1008.84864 512.00128 1008.84864z m248.4224-166.4v-9.93408a83.03104 83.03104 0 0 0-41.73568-71.91808l-113.4016-64.79744c-28.19584 14.368-59.58272 23.22944-93.28512 23.22944s-65.088-8.86144-93.24288-23.22944l-113.4464 64.79744a83.03872 83.03872 0 0 0-41.728 71.91936v9.93408c69.31072 52.2112 155.1808 83.59808 248.42368 83.59808s179.11424-31.34208 248.4224-83.59808zM636.2112 512.00512v-82.80064a124.2112 124.2112 0 0 0-248.42112 0v82.80704a124.2112 124.2112 0 1 0 248.42112 0zM512.00128 97.96864c-228.29952 0-414.03648 185.73824-414.03648 414.03648a412.0512 412.0512 0 0 0 94.52288 263.04c13.37344-35.6928 37.71904-66.86976 71.75552-86.32832l85.99424-49.152c-27.904-35.2768-45.25696-79.20256-45.25696-127.56352v-82.7968c0-114.14784 92.87296-207.0208 207.0208-207.0208s207.01568 92.86656 207.01568 207.0208v82.80704c0 48.36096-17.34784 92.288-45.25056 127.56352l85.9904 49.152c34.03648 19.456 58.38208 50.63552 71.7568 86.32832a412.06016 412.06016 0 0 0 94.52544-263.04c0-228.29824-185.7408-414.03648-414.03776-414.03648z"
                                  fill="#ffffff" p-id="11076"></path>
                        </svg>
                    </div>
                    <c:set var="loginText"><spring:message code="user.login"/></c:set>
                    <div class="header-username">${users != null ? users.username : loginText}</div>
                </a>
                <c:if test="${users != null}">
                    <div class="header-user-more display-none">
                        <div class="more-slide">
                            <div class="slide-item">
                                <a href="javascript: void(0);">
                                    <div class="icon-normal icon-30 header-icon-mr-8">
                                        <svg t="1722151733719" class="icon" viewBox="0 0 1024 1024" version="1.1"
                                             xmlns="http://www.w3.org/2000/svg" p-id="11075">
                                            <path d="M512.00128 1008.84864c-273.96992 0-496.84608-222.8736-496.84608-496.84352s222.87616-496.8448 496.84608-496.8448S1008.8448 238.03776 1008.8448 512.00512 785.96864 1008.84864 512.00128 1008.84864z m248.4224-166.4v-9.93408a83.03104 83.03104 0 0 0-41.73568-71.91808l-113.4016-64.79744c-28.19584 14.368-59.58272 23.22944-93.28512 23.22944s-65.088-8.86144-93.24288-23.22944l-113.4464 64.79744a83.03872 83.03872 0 0 0-41.728 71.91936v9.93408c69.31072 52.2112 155.1808 83.59808 248.42368 83.59808s179.11424-31.34208 248.4224-83.59808zM636.2112 512.00512v-82.80064a124.2112 124.2112 0 0 0-248.42112 0v82.80704a124.2112 124.2112 0 1 0 248.42112 0zM512.00128 97.96864c-228.29952 0-414.03648 185.73824-414.03648 414.03648a412.0512 412.0512 0 0 0 94.52288 263.04c13.37344-35.6928 37.71904-66.86976 71.75552-86.32832l85.99424-49.152c-27.904-35.2768-45.25696-79.20256-45.25696-127.56352v-82.7968c0-114.14784 92.87296-207.0208 207.0208-207.0208s207.01568 92.86656 207.01568 207.0208v82.80704c0 48.36096-17.34784 92.288-45.25056 127.56352l85.9904 49.152c34.03648 19.456 58.38208 50.63552 71.7568 86.32832a412.06016 412.06016 0 0 0 94.52544-263.04c0-228.29824-185.7408-414.03648-414.03776-414.03648z"
                                                  fill="#ffffff" p-id="11076"></path>
                                        </svg>
                                    </div>
                                    <spring:message code="user.personal"/>
                                </a>
                            </div>
                            <div class="slide-item">
                                <a href="javascript: void(0);">
                                    <div class="icon-normal icon-30 header-icon-mr-8">
                                        <svg t="1722157039161" class="icon" viewBox="0 0 1024 1024" version="1.1"
                                             xmlns="http://www.w3.org/2000/svg" p-id="30356">
                                            <path d="M940.8 372.8l-176-219.2c-17.6-22.4-46.4-36.8-75.2-36.8H334.4c-28.8 0-56 12.8-75.2 36.8l-176 219.2c-30.4 36.8-27.2 91.2 4.8 126.4l356.8 377.6 4.8 4.8c17.6 16 41.6 25.6 65.6 25.6h3.2c25.6-1.6 49.6-11.2 67.2-30.4l348.8-376c33.6-36.8 35.2-91.2 6.4-128z m-52.8 83.2L539.2 832c-6.4 6.4-14.4 9.6-22.4 9.6-8 0-16-3.2-22.4-8L136 454.4c-11.2-11.2-11.2-28.8-1.6-41.6l174.4-219.2c6.4-8 16-12.8 25.6-12.8h355.2c9.6 0 19.2 4.8 25.6 12.8l176 219.2c8 12.8 8 30.4-3.2 43.2z"
                                                  fill="#ffffff" p-id="30357"></path>
                                            <path d="M681.6 438.4L515.2 616 344 435.2c-12.8-12.8-32-14.4-46.4-1.6-12.8 11.2-12.8 32-1.6 44.8l172.8 182.4 3.2 3.2c25.6 24 65.6 22.4 91.2-3.2L729.6 480c11.2-12.8 11.2-33.6-1.6-44.8-14.4-11.2-33.6-9.6-46.4 3.2z"
                                                  fill="#ffffff" p-id="30358"></path>
                                        </svg>
                                    </div>
                                    <spring:message code="user.member"/>
                                </a>
                                <a href="javascript: void(0);">
                                    <div class="icon-normal icon-30 header-icon-mr-8">
                                        <svg t="1722156887683" class="icon" viewBox="0 0 1024 1024" version="1.1"
                                             xmlns="http://www.w3.org/2000/svg" p-id="21469">
                                            <path d="M512 552.128c-140.352 0-254.528-114.176-254.528-254.528S371.648 43.136 512 43.136c140.288 0 254.528 114.176 254.528 254.528S652.288 552.128 512 552.128z m0-444.992c-105.024 0-190.528 85.44-190.528 190.528S406.976 488.128 512 488.128c105.088 0 190.528-85.44 190.528-190.528S617.088 107.136 512 107.136zM525.376 980.864a32.064 32.064 0 0 1-25.216-12.224L424.96 872.512a32.32 32.32 0 0 1-6.464-24.704l31.68-204.032a32 32 0 0 1 31.616-27.072h79.232a32 32 0 0 1 31.616 27.136l31.68 204.032a32 32 0 0 1-5.44 23.232l-67.264 96.128a32.128 32.128 0 0 1-25.344 13.632h-0.896z m-41.472-136.896l40.064 51.2 35.136-50.176-25.472-164.224h-24.384l-25.344 163.2z"
                                                  fill="#ffffff" p-id="21470"></path>
                                            <path d="M957.824 972.288a32 32 0 0 1-31.872-35.328 416.064 416.064 0 0 0-279.872-436.544 31.872 31.872 0 0 1-20.032-40.512 31.872 31.872 0 0 1 40.64-19.968 479.936 479.936 0 0 1 322.88 503.744 31.936 31.936 0 0 1-31.744 28.608zM66.24 972.288a32 32 0 0 1-31.808-28.672 480.512 480.512 0 0 1 322.688-503.68 32 32 0 0 1 20.608 60.544 416 416 0 0 0-279.616 436.416 32 32 0 0 1-31.872 35.392z"
                                                  fill="#ffffff" p-id="21471"></path>
                                        </svg>
                                    </div>
                                    <spring:message code="user.administrator"/>
                                </a>
                            </div>
                            <div class="slide-item">
                                <a href="javascript: void(0);">
                                    <div class="icon-normal icon-30 header-icon-mr-8">
                                        <svg t="1722156285343" class="icon" viewBox="0 0 1024 1024" version="1.1"
                                             xmlns="http://www.w3.org/2000/svg" p-id="13217">
                                            <path d="M103.822222 516.266667c0-234.666667 190.577778-425.244444 425.244445-425.244445 139.377778 0 265.955556 65.422222 344.177777 176.355556H722.488889c-24.177778 0-42.666667 18.488889-42.666667 42.666666s18.488889 42.666667 42.666667 42.666667h226.133333c14.222222 0 28.444444-7.111111 35.555556-19.911111s8.533333-28.444444 1.422222-41.244444C900.266667 115.2 723.911111 5.688889 529.066667 5.688889 247.466667 5.688889 18.488889 234.666667 18.488889 516.266667c0 24.177778 18.488889 42.666667 42.666667 42.666666s42.666667-19.911111 42.666666-42.666666zM962.844444 465.066667c-24.177778 0-42.666667 18.488889-42.666666 42.666666 0 234.666667-190.577778 425.244444-425.244445 425.244445-139.377778 0-265.955556-65.422222-344.177777-176.355556h150.755555c24.177778 0 42.666667-18.488889 42.666667-42.666666s-18.488889-42.666667-42.666667-42.666667H75.377778c-14.222222 0-28.444444 7.111111-35.555556 19.911111-7.111111 12.8-8.533333 28.444444-1.422222 41.244444 85.333333 176.355556 260.266667 285.866667 456.533333 285.866667 281.6 0 510.577778-228.977778 510.577778-510.577778 0-22.755556-19.911111-42.666667-42.666667-42.666666z"
                                                  fill="#ffffff" p-id="13218"></path>
                                        </svg>
                                    </div>
                                    <spring:message code="user.functionUpdate"/>
                                </a>
                                <a href="javascript: void(0);">
                                    <div class="icon-normal icon-30 header-icon-mr-8">
                                        <svg t="1722156677876" class="icon" viewBox="0 0 1029 1024" version="1.1"
                                             xmlns="http://www.w3.org/2000/svg" p-id="14247">
                                            <path d="M514.547264 5.094527C234.348259 5.094527 5.094527 234.348259 5.094527 514.547264c0 61.134328 10.189055 117.174129 30.567165 178.308457v300.577115h300.577114c56.039801 20.378109 117.174129 30.567164 178.308458 30.567164 280.199005 0 509.452736-229.253731 509.452736-509.452736s-229.253731-509.452736-509.452736-509.452737z m0 957.771145c-56.039801 0-106.985075-10.189055-157.930349-30.567165H101.890547v-254.726368c-20.378109-50.945274-30.567164-106.985075-30.567164-157.930348 0-244.537313 198.686567-448.318408 448.318408-448.318408 244.537313 0 448.318408 198.686567 448.318408 448.318408-5.094527 244.537313-203.781095 443.223881-453.412935 443.223881z"
                                                  fill="#ffffff" p-id="14248"></path>
                                            <path d="M519.641791 662.288557c-30.567164 0-56.039801 25.472637-56.039801 56.039801 0 30.567164 25.472637 56.039801 56.039801 56.039801s56.039801-25.472637 56.039801-56.039801c0-30.567164-25.472637-56.039801-56.039801-56.039801zM514.547264 254.726368c-71.323383 0-147.741294 40.756219-152.835821 127.363184h91.701492c10.189055-25.472637 30.567164-45.850746 61.134329-45.850746 35.661692 0 61.134328 25.472637 61.134328 61.134328 0 20.378109-15.283582 40.756219-25.472637 50.945274l-50.945273 61.134328c-20.378109 25.472637-25.472637 45.850746-25.472637 76.417911h91.701492c0-15.283582 10.189055-30.567164 15.283582-35.661692l50.945274-66.228855c15.283582-20.378109 35.661692-50.945274 35.661692-86.606966 5.094527-96.79602-76.41791-142.646766-152.835821-142.646766z"
                                                  fill="#ffffff" p-id="14249"></path>
                                        </svg>
                                    </div>
                                    <spring:message code="user.helpDocument"/>
                                </a>
                                <a href="javascript: void(0);">
                                    <div class="icon-normal icon-30 header-icon-mr-8">
                                        <svg t="1722156738552" class="icon" viewBox="0 0 1024 1024" version="1.1"
                                             xmlns="http://www.w3.org/2000/svg" p-id="16406">
                                            <path d="M883.2 83.2h-742.4c-51.2 0-92.8 41.6-92.8 89.6V755.2c0 48 41.6 89.6 92.8 89.6h256s6.4 6.4 16 19.2c3.2 3.2 6.4 6.4 9.6 12.8 0 0 6.4 9.6 9.6 12.8 28.8 44.8 51.2 67.2 86.4 67.2s60.8-22.4 89.6-67.2c22.4-35.2 28.8-44.8 28.8-44.8h249.6c51.2 0 92.8-41.6 92.8-89.6V172.8c-3.2-51.2-44.8-89.6-96-89.6z m48 672c0 25.6-19.2 44.8-44.8 44.8H633.6c-6.4 0-9.6 0-16 3.2-9.6 6.4-19.2 12.8-28.8 28.8-3.2 6.4-22.4 35.2-22.4 35.2-19.2 32-35.2 44.8-48 44.8s-25.6-12.8-48-44.8c-3.2-3.2-6.4-12.8-9.6-12.8-3.2-6.4-6.4-9.6-9.6-12.8-19.2-25.6-32-38.4-54.4-38.4h-256c-25.6 0-44.8-19.2-44.8-44.8V176c0-25.6 22.4-44.8 48-44.8h742.4c25.6 0 48 19.2 48 44.8V755.2zM220.8 483.2a51.2 51.2 0 1 0 102.4 0 51.2 51.2 0 1 0-102.4 0z m240 0a51.2 51.2 0 1 0 102.4 0 51.2 51.2 0 1 0-102.4 0z m236.8 0a51.2 51.2 0 1 0 102.4 0 51.2 51.2 0 1 0-102.4 0z"
                                                  fill="#ffffff" p-id="16407"></path>
                                        </svg>
                                    </div>
                                    <spring:message code="user.feedback"/>
                                </a>
                            </div>
                            <div class="slide-item">
                                <a href="javascript: void(0);">
                                    <div class="icon-normal icon-30 header-icon-mr-8">
                                        <svg t="1722156798073" class="icon" viewBox="0 0 1126 1024" version="1.1"
                                             xmlns="http://www.w3.org/2000/svg" p-id="18554">
                                            <path d="M1120.236432 714.264744a53.91859 53.91859 0 0 0-51.925823-46.801563h-2.562129a33.136874 33.136874 0 0 1-33.706236-32.45364 39.229048 39.229048 0 0 1 3.074555-12.01354 56.936209 56.936209 0 0 0-20.553971-70.657836l-1.992767-1.309532-65.135024-34.84496-2.106639-0.91098a63.028384 63.028384 0 0 0-24.48257-4.839577 64.850342 64.850342 0 0 0-45.548968 18.276523 74.017072 74.017072 0 0 1-28.468104 18.105714 74.415625 74.415625 0 0 1-28.468105-18.390395 64.850342 64.850342 0 0 0-46.573819-18.390396 62.62983 62.62983 0 0 0-24.02708 4.668769l-2.10664 0.854043-67.412472 35.642067-1.992767 1.309533a56.936209 56.936209 0 0 0-20.781717 70.714772 39.456793 39.456793 0 0 1 3.074556 12.01354 33.136874 33.136874 0 0 1-33.706236 32.453639h-1.878895a53.91859 53.91859 0 0 0-52.552121 46.801564 243.743912 243.743912 0 0 0 0 105.331987 53.91859 53.91859 0 0 0 51.925823 46.801564h2.562129a33.136874 33.136874 0 0 1 33.706236 32.45364 39.456793 39.456793 0 0 1-3.074555 12.01354 56.936209 56.936209 0 0 0 20.610907 70.714772l1.878895 1.252596 63.939363 34.161726 1.992768 0.854043a62.62983 62.62983 0 0 0 24.539506 4.896514 64.167108 64.167108 0 0 0 46.40301-19.187503 76.75001 76.75001 0 0 1 29.208276-19.244438 76.009839 76.009839 0 0 1 29.379084 19.642992 64.110172 64.110172 0 0 0 46.687691 19.52912 62.62983 62.62983 0 0 0 24.140953-4.725706l2.049703-0.854043 66.216812-35.243513 1.935831-1.309533a56.936209 56.936209 0 0 0 20.72478-70.714772 39.456793 39.456793 0 0 1-3.074555-12.01354 33.136874 33.136874 0 0 1 33.706235-32.45364h2.505194a53.91859 53.91859 0 0 0 51.925822-46.744627 315.939025 315.939025 0 0 0 5.693621-52.72293 319.526006 319.526006 0 0 0-5.750557-52.665994z m-60.921744 92.293596a90.4147 90.4147 0 0 0-82.102013 126.512256l-57.391699 30.574745h-0.512426a122.982212 122.982212 0 0 0-75.269669-39.05824 122.185105 122.185105 0 0 0-74.757242 38.318069h-0.512426l-55.285059-29.777637a90.4147 90.4147 0 0 0-82.102014-126.512257 183.790083 183.790083 0 0 1 0-79.198267 90.4147 90.4147 0 0 0 82.102014-126.284512l58.587359-30.973298a3.188428 3.188428 0 0 1 0.910979 0 122.868339 122.868339 0 0 0 73.960136 36.666919 122.697531 122.697531 0 0 0 73.163029-36.097557h0.967915l56.48072 30.233127a90.4147 90.4147 0 0 0 82.102014 126.512257 253.309195 253.309195 0 0 1 4.327152 39.855346 256.212941 256.212941 0 0 1-4.611833 39.229049z m-215.21887-140.74631a100.890963 100.890963 0 1 0 104.705688 100.834027 102.940666 102.940666 0 0 0-104.705688-100.834027z m0 141.600353a40.766326 40.766326 0 1 1 42.303603-40.766326 41.620369 41.620369 0 0 1-42.303603 40.766326zM336.338704 513.279926A482.762118 482.762118 0 0 0 0.016516 977.651648a35.642067 35.642067 0 0 0 71.284134 0 413.356879 413.356879 0 0 1 286.104451-398.553464 34.161726 34.161726 0 0 0 23.514655-42.929902 35.926748 35.926748 0 0 0-44.637988-22.945292z m236.85463 2.619066a258.091836 258.091836 0 1 0-267.600183-257.977964 263.386904 263.386904 0 0 0 267.600183 257.807155z m0-447.233924A189.426768 189.426768 0 1 1 376.592604 257.921028a193.29843 193.29843 0 0 1 196.60073-189.25596z"
                                                  fill="#ffffff" p-id="18555"></path>
                                        </svg>
                                    </div>
                                    <spring:message code="user.accountSetting"/>
                                </a>
                            </div>
                            <div class="slide-item">
                                <a href="users/logout">
                                    <div class="icon-normal icon-30 header-icon-mr-8">
                                        <svg t="1722156837943" class="icon" viewBox="0 0 1024 1024" version="1.1"
                                             xmlns="http://www.w3.org/2000/svg" p-id="19579">
                                            <path d="M154.497753 1017.014356a123.188603 123.188603 0 0 1-120.635616-118.72789v-771.50685A124.002192 124.002192 0 0 1 154.497753 7.013699h509.082302a124.535233 124.535233 0 0 1 121.252822 119.765917v98.191781a38.912 38.912 0 0 1-77.795945 0v-98.191781a47.300384 47.300384 0 0 0-43.625206-42.082191H154.497753a46.795397 46.795397 0 0 0-43.064109 42.082191v771.50685a45.813479 45.813479 0 0 0 43.064109 41.072219h508.829809a46.318466 46.318466 0 0 0 43.569096-41.072219v-101.193644a38.940055 38.940055 0 1 1 77.852054 0v101.193644a123.777753 123.777753 0 0 1-121.308931 118.72789z m637.320768-316.009205a38.603397 38.603397 0 0 1 0-54.903233l111.573917-111.489754a31.477479 31.477479 0 0 0 9.089754-22.023013 30.860274 30.860274 0 0 0-9.089754-21.798576l-111.573917-111.770301a38.799781 38.799781 0 0 1 54.903232-54.819069l111.573918 111.573918a108.908712 108.908712 0 0 1 0 153.768329l-111.573918 111.489753a38.26674 38.26674 0 0 1-27.465643 11.446357 38.883945 38.883945 0 0 1-27.353425-11.502466z m-324.369535-150.121206a38.940055 38.940055 0 0 1 0-77.852055h285.036713a38.940055 38.940055 0 0 1 0 77.852055z"
                                                  fill="#ffffff" p-id="19580"></path>
                                        </svg>
                                    </div>
                                    <spring:message code="user.logOut"/>
                                </a>
                            </div>
                        </div>
                    </div>
                </c:if>
            </div>
        </div>
    </div>
</div>

</body>
</html>
