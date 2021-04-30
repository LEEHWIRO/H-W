<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  // 인증된 세션이 없는경우, 해당페이지를 볼 수 없게 함.
    	if (session.getAttribute("signedUser") == null) {
    	  String redirectUrl = request.getContextPath()+"/HW/pay/memberpay.do";
    	response.sendRedirect(redirectUrl); 
    } 
%>  

    
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<script src="<%=request.getContextPath()%>/HW_main/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/HW_main/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/HW_main/js/parallax.js"></script>
<script src="<%=request.getContextPath()%>/HW_main/js/wow.js"></script>
<script src="<%=request.getContextPath()%>/HW_membership/js/main.js"></script>
<script src="<%=request.getContextPath()%>/HW_membership/js/jquery-2.1.1.js"></script>
<title>멤버쉽 결제</title>

<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="<%=request.getContextPath()%>/HW_membership/css/reset.css"> <!-- CSS reset -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/HW_membership/css/style.css"> <!-- Resource style -->
	<script src="<%=request.getContextPath()%>/HW_membership/js/modernizr.js"></script> <!-- Modernizr -->



<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
            crossorigin="anonymous"></script>
    <!--1. 아임포트 라이브러리 추가-->
    <!-- iamport.payment.js -->
    <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>

<!-- 메인 CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/HW_main/css/animate.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/HW_main/css/bootstrap.min.css"
	type="text/css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/HW_main/css/style.css">


<script type="text/javascript">
jQuery(document).ready( function($) {
   
   var roll = 1;
   
   setInterval(function(){
      roll++;
      if (roll > 3) {roll = 1;}
      $("#hom").attr("src", "<%=request.getContextPath() %>/HW_main/IMG/ban" + roll + ".jpg");
   }, 2000);
   
   
   $(window).resize(function(){
      change();
   });
     function change(){
        var windowWidth = $(window).width();
        if(windowWidth < 980) {
           $('#byun').hide();
         } else {
            $('#byun').show();
         }
     }
});

</script>

</head>
<body>
<div class="container-fluid pl-0 pr-0 bg-img clearfix parallax-window2" data-parallax="scroll" data-image-src="<%=request.getContextPath() %>/HW_main/images/banner2.jpg">
  <nav class="navbar navbar-expand-md navbar-dark">
    <div class="container"> 
      <!-- 로고--> 
      <a class="navbar-brand mr-auto" href="<%=request.getContextPath() %>/HW/main/main.do"><img src="<%=request.getContextPath() %>/HW_main/images/logo.png" alt="HWlogo" /></a> 
      
      <!-- 토글 버튼 -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar"> <span class="navbar-toggler-icon"></span> </button>
      
      <!-- 네비게이션 링크 -->
      <div class="collapse navbar-collapse" id="collapsibleNavbar">
       <ul class="navbar-nav ml-auto" style="float:left;">
          <li><a href="<%=request.getContextPath() %>/HW/mypageuser/main.do"> <%=(String)session.getAttribute("signedUser") %>님 반갑습니다^^ </li>
      	</ul>
       <ul class="navbar-nav ml-auto">
          <li class="nav-item"> 
          		<a class="nav-link" href="<%=request.getContextPath() %>/HW/video/pt.do">PT</a>
          </li>
          <li class="nav-item"> 
          		<a class="nav-link" href="<%=request.getContextPath() %>/HW/prod/list.do">쇼핑몰</a> 
          </li>
          <li class="nav-item"> 
          		<a class="nav-link" href="<%=request.getContextPath() %>/HW/notice/list.do">게시판</a> 
          </li>
          <li class="nav-item"> 
          		<a class="nav-link" href="<%=request.getContextPath() %>/HW/pay/memberex.do">멤버쉽</a>
          </li>
        </ul>
        <ul class="navbar-nav ml-5">
                  <li class="nav-item"> <a class="nav-link btn btn-danger" href="<%=request.getContextPath() %>/HW/main/logout.do">&nbsp;LogOut&nbsp;</a> </li>
						</li>
					</ul>
				</div>
			</div>
		</nav>


		<div class="container">

			<div class="cd-pricing-container cd-has-margins">
				<div class="cd-pricing-switcher">
					<p class="fieldset">
						<input type="radio" name="duration-2" value="monthly"
							id="monthly-2" checked> <label for="monthly-2">Monthly</label>
						<input type="radio" name="duration-2" value="yearly" id="yearly-2">
						<label for="yearly-2">Yearly</label> <span class="cd-switch"></span>
					</p>
				</div>
				<!-- .cd-pricing-switcher -->

				<ul class="cd-pricing-list cd-bounce-invert">
					<li>
						<ul class="cd-pricing-wrapper">
							<li data-type="monthly" class="is-visible"><header
									class="cd-pricing-header">
									<h2>1개월</h2>

									<div class="cd-price">
										<span class="cd-currency">₩</span> <span class="cd-value">10,000</span>
										<span class="cd-duration">총</span>
									</div>

								</header> <!-- .cd-pricing-header -->

								<div class="cd-pricing-body">
									<ul class="cd-pricing-features">
										<ul class="cd-pricing-features">
											<li>쇼핑몰<em>10%</em>할인
											</li>
											<li><em>1개월</em> 트레이너 배정</li>
											<li><em>1개월</em> 프리미엄 영상 시청</li>
											<li><em>1개월</em> 개인 식단 ,운동 관리</li>
											<li><em>1일 마다</em>미션 관리</li>
											<li>지속적인 동기 부여 서비스</li>
										</ul>
									</ul>
								</div> <!-- .cd-pricing-body --> <footer class="cd-pricing-footer">
									<a class="cd-select" href="#">결제</a>
								</footer> <!-- .cd-pricing-footer --></li>

							<li data-type="yearly" class="is-hidden"><header
									class="cd-pricing-header">
									<h2>1 년</h2>

									<div class="cd-price">
										<span class="cd-currency">₩</span> <span class="cd-value">100,000</span>
										<span class="cd-duration">총</span>
									</div>
								</header> <!-- .cd-pricing-header -->

								<div class="cd-pricing-body">
									<ul class="cd-pricing-features">
										<li>쇼핑몰<em>10%</em>할인
										</li>
										<li><em>1년</em> 트레이너 배정</li>
										<li><em>1년</em> 프리미엄 영상 시청</li>
										<li><em>3개월</em> 개인 식단 ,운동 관리</li>
										<li><em>1일 마다</em>미션 관리</li>
										<li>지속적인 동기 부여 서비스</li>
									</ul>
								</div> <!-- .cd-pricing-body --> <footer class="cd-pricing-footer">
									<a class="cd-select" href="#">결제</a>
								</footer> <!-- .cd-pricing-footer --></li>
						</ul> <!-- .cd-pricing-wrapper -->
					</li>

					<li class="cd-popular">
						<ul class="cd-pricing-wrapper">
							<li data-type="monthly" class="is-visible"><header
									class="cd-pricing-header">
									<h2>3 개월</h2>

									<div class="cd-price">
										<span class="cd-currency">₩</span> <span class="cd-value">20,000</span>
										<span class="cd-duration">총</span>
									</div>
								</header> <!-- .cd-pricing-header -->

								<div class="cd-pricing-body">
									<ul class="cd-pricing-features">
										<li>쇼핑몰<em>10%</em>할인
										</li>
										<li><em>3개월</em> 트레이너 배정</li>
										<li><em>3개월</em> 프리미엄 영상 시청</li>
										<li><em>3개월</em> 개인 식단 ,운동 관리</li>
										<li><em>1일 마다</em>미션 관리</li>
										<li>지속적인 동기 부여 서비스</li>
									</ul>
								</div> <!-- .cd-pricing-body --> <footer class="cd-pricing-footer">
									<a class="cd-select" href="#">결제</a>
								</footer> <!-- .cd-pricing-footer --></li>

							<li data-type="yearly" class="is-hidden"><header
									class="cd-pricing-header">
									<h2>1년 6개월</h2>

									<div class="cd-price">
										<span class="cd-currency">₩</span> <span class="cd-value">100</span>
										<span class="cd-duration">총</span>
									</div>
								</header> <!-- .cd-pricing-header -->

								<div class="cd-pricing-body">
									<ul class="cd-pricing-features">
										<li>쇼핑몰<em>10%</em>할인
										</li>
										<li><em>1년 6개월</em> 트레이너 배정</li>
										<li><em>1년 6개월</em> 프리미엄 영상 시청</li>
										<li><em>1년 6개월</em> 개인 식단 ,운동 관리</li>
										<li><em>1일 마다</em>미션 관리</li>
										<li>지속적인 동기 부여 서비스</li>
									</ul>
								</div> <!-- .cd-pricing-body --> <footer class="cd-pricing-footer">
									<a  v-on:click="requestPay" class="cd-select"id="app" >결제</a>
								</footer> <!-- .cd-pricing-footer --></li>
						</ul> <!-- .cd-pricing-wrapper -->
					</li>

					<li>
						<ul class="cd-pricing-wrapper">
							<li data-type="monthly" class="is-visible"><header
									class="cd-pricing-header">
									<h2>6개월</h2>

									<div class="cd-price">
										<span class="cd-currency">₩</span> <span class="cd-value">40,000</span>
										<span class="cd-duration">총</span>
									</div>
								</header> <!-- .cd-pricing-header -->

								<div class="cd-pricing-body">
									<ul class="cd-pricing-features">
										<li>쇼핑몰<em>10%</em>할인
										</li>
										<li><em>6개월</em> 트레이너 배정</li>
										<li><em>6개월</em> 프리미엄 영상 시청</li>
										<li><em>6개월</em> 개인 식단 ,운동 관리</li>
										<li><em>1일 마다</em>미션 관리</li>
										<li>지속적인 동기 부여 서비스</li>
									</ul>
								</div> <!-- .cd-pricing-body --> <footer class="cd-pricing-footer">
									<a class="cd-select" href="#">결제</a>
								</footer> <!-- .cd-pricing-footer --></li>

							<li data-type="yearly" class="is-hidden"><header
									class="cd-pricing-header">
									<h2>2년</h2>

									<div class="cd-price">
										<span class="cd-currency">₩</span> <span class="cd-value">200,000</span>
										<span class="cd-duration">총</span>
									</div>
								</header> <!-- .cd-pricing-header -->

								<div class="cd-pricing-body">
									<ul class="cd-pricing-features">
										<li>쇼핑몰<em>10%</em>할인
										</li>
										<li><em>2년</em> 트레이너 배정</li>
										<li><em>2년</em> 프리미엄 영상 시청</li>
										<li><em>2년</em> 개인 식단 ,운동 관리</li>
										<li><em>1일 마다</em>미션 관리</li>
										<li>지속적인 동기 부여 서비스</li>
									</ul>
								</div> <!-- .cd-pricing-body --> <footer class="cd-pricing-footer">
									<a class="cd-select" href="#">결제</a>
								</footer> <!-- .cd-pricing-footer --></li>
						</ul> <!-- .cd-pricing-wrapper -->
					</li>
				</ul>
				<!-- .cd-pricing-list -->
			</div>
			<!-- .cd-pricing-container -->






		</div>

		<footer class="container-fluid">
			<div class="container">
				<div class="row" style="padding-top: 20px;">
					<div class="col-md-3 footer1 d-flex wow bounceInLeft"
						data-wow-delay=".25s">
						<div class="d-flex flex-wrap align-content-center">
							<a href="#"><img
								src="<%=request.getContextPath() %>/HW_main/images/logo.png"
								alt="logo" /></a>
							<p>
								&copy; 2021 HomeWar. All rights reserved.<br> Design by <a
									href="#" target="_blank">HomeWar</a>.
							</p>
						</div>
					</div>
					<div class="col-md-6 footer2 wow bounceInUp" data-wow-delay=".25s"
						id="contact"></div>
					<div class="col-md-3 footer3 wow bounceInRight"
						data-wow-delay=".25s">
						<h5>찾아 오시는 길</h5>
						<p>대전광역시 중구 대흥동.</p>
						<h5>E-mail</h5>
						<p>joo3278@naver.com</p>
					</div>
				</div>
			</div>
	</div>
	</footer>

	<!-- 자바스크립트  -->
<script>
$('.js-pscroll').each(function(){
	var ps = new PerfectScrollbar(this);

	$(window).on('resize', function(){
		ps.update();
	})
});



let app = new Vue({
    el: '#app',
    data: {
        impCode : 'imp68780846',
        order: {
            name : 
            	<%--  <%
                	int cartSize2 = cartList.size();
                if(cartSize2 > 0){
             	   for(int i = 0 ; i <cartSize2; i++){
             		   if(cartList.get(i).getCartOrder() == 0){      		   
						if(i == cartSize2-1){
							%>
							<%=cartList.get(i).getProdName() %>
		             		<%
						}
						%>
             		<%=cartList.get(i).getProdName() %>,
            	 <%
             			   }
             		   }
	                }
            	%> --%>
            	"HW"
            	,
            amount : '100',
            buyer_tel : null,
        }
    },
    methods: {
        requestPay: function(){
            //1. 객체 초기화 (가맹점 식별코드 삽입)
            var IMP = window.IMP;
            IMP.init(this.impCode);
            //3. 결제창 호출
            IMP.request_pay({
                pg : 'jtnet',
                pay_method : 'card',
                merchant_uid : 'merchant_' + new Date().getTime(),
                name : this.order.name,
                amount : this.order.amount,
                buyer_tel : this.order.buyer_tel,
            }, function(rsp) {
                if ( rsp.success ) {
                    //4. 결제 요청 결과 서버(자사)에 적용하기
                    //ajax 서버 통신 구현 -> 5. 서버사이드에서 validation check

                    //6. 최종 서버 응답 클라이언트에서 단계 4.에서 보낸 서버사이드 응답 에따라 결제 성공 실패 출력
                    var msg = '결제가 완료되었습니다.';
                    msg += '고유ID : ' + rsp.imp_uid;
                    msg += '상점 거래ID : ' + rsp.merchant_uid;
                    msg += '결제 금액 : ' + rsp.paid_amount;
                    msg += '카드 승인번호 : ' + rsp.apply_num;
                   
                    
                   
                } else {
                    var msg = '결제에 실패하였습니다.';
                    msg += '에러내용 : ' + rsp.error_msg;
                }
                alert(msg);
            });
        }
    }
});
</script>
</body>
</html>