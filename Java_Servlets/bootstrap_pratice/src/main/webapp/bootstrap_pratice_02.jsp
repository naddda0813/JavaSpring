<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Perfume</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">쇼핑하기</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
           perfume
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">eau de perfume</a></li>
            <li><a class="dropdown-item" href="#">eau de toillette</a></li>
            <li><a class="dropdown-item" href="#">eau de cologne</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Body Spray</a></li>
          </ul>
        </li>
       
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<div class="row">
    <div class="col-lg-3 col-md-6">
    	<div class="card" style="width: 18rem;">
  		<img src="https://img.marieclairekorea.com/2019/12/mck_5e1d183804e42.jpg" class="card-img-top" alt="...">
 		 <div class="card-body">
   		 <h5 class="card-title">오늘의 향수 </h5>
  		  <p class="card-text">향기로운 사람이 되는 첫번째 관문</p>
  		  <a href="#" class="btn btn-primary">Go somewhere</a>
 		 </div>
	</div>
	</div>  
    <div class="col-lg-3 col-md-6">
		<div class="card" style="width: 18rem;">
  		<img src="https://www.superdrug.com/blog/wp-content/uploads/2020/12/top-10-female-fragrances.jpg" class="card-img-top" alt="...">	
 		 <div class="card-body">
   		 <h5 class="card-title">오늘의 향수 </h5>
  		  <p class="card-text">향기로운 사람이 되는 첫번째 관문</p>
  		  <a href="#" class="btn btn-primary">Go somewhere</a>
 		 </div>
	</div>    
	</div>  
    <div class="col-lg-3 col-md-6">
 	   <div class="card" style="width: 18rem;">
  		<img src="https://www.makeup.com/-/media/project/loreal/brand-sites/mdc/americas/us/articles/2019/12-december/05-best-fragrance-2019/the-best-fragrances-of-2019-hero-mudc-120419.jpg" class="card-img-top" alt="...">	
 		 <div class="card-body">
   		 <h5 class="card-title">오늘의 향수 </h5>
  		  <p class="card-text">향기로운 사람이 되는 첫번째 관문</p>
  		  <a href="#" class="btn btn-primary">Go somewhere</a>   
  		 </div>
     </div>
  	</div>  	 
    <div class="col-lg-3 col-md-6">
 	   <div class="card" style="width: 18rem;">
  		<img src="https://cdn.shopify.com/s/files/1/0572/8357/5976/files/FUEGUIA3237_milan_600x600@2x.jpg?v=1639661241" class="card-img-top" alt="...">	
 		 <div class="card-body">
   		 <h5 class="card-title">오늘의 향수 </h5>
  		  <p class="card-text">향기로운 사람이 되는 첫번째 관문</p>
  		  <a href="#" class="btn btn-primary">Go somewhere</a>   
  		  </div>
      </div>
   </div>
    
   </div>

 
 

<button type="button" class="btn btn-primary">구매하기</button>
<button type="button" class="btn btn-secondary">찜하기</button>
<button type="button" class="btn btn-success">로그인</button>
<button type="button" class="btn btn-danger">로그아웃</button>
<button type="button" class="btn btn-warning">회원 가입</button>
<button type="button" class="btn btn-info">회원 탈퇴</button>
<button type="button" class="btn btn-light">Light</button>
<button type="button" class="btn btn-dark">Dark</button>
<button type="button" class="btn btn-link">Link</button>
<br>
<br>

<button type="button" class="btn btn-primary btn-lg">장바구니</button>
<br>
<br>
<button type="button" class="btn btn-secondary btn-sm">찜하기</button>
<br>
<br>
<button type="button" class="btn btn-lg btn-primary" disabled>Primary button</button>
<button type="button" class="btn btn-secondary btn-lg" disabled>Button</button>
<a class="btn btn-primary btn-lg disabled" role="button" aria-disabled="true">Primary link</a>
<a class="btn btn-secondary btn-lg disabled" role="button" aria-disabled="true">Link</a>
<button type="button" class="btn-close" aria-label="Close"></button>
<%--close button --%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>