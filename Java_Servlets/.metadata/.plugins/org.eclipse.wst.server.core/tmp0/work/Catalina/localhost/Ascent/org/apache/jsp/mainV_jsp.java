/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-04-13 06:06:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainV_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/usr/local/Tomcat/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("file:/usr/local/Tomcat/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1645639151000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\"\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.88.1\">\n");
      out.write("<link rel=\"canonical\"\n");
      out.write("	href=\"https://getbootstrap.com/docs/5.1/examples/headers/\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link type=\"text/css\" href=\"css/productlist.css\" rel=\"stylesheet\" >\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("<link href=\"headers.css\" rel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\"\n");
      out.write("	integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css\">\n");
      out.write("\n");
      out.write("<script\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<title>ascent</title>\n");
      out.write("<!-- 비디오 -->\n");
      out.write("<style>\n");
      out.write("#videobcg {\n");
      out.write("	position: relative;\n");
      out.write("	top:0px;\n");
      out.write("	left:-15px;\n");
      out.write("	min-width:100%;\n");
      out.write("	min-height:100%;\n");
      out.write("	padding-bottom:70px;\n");
      out.write("	height:auto;\n");
      out.write("	margin:0;\n");
      out.write("	z-index:-1000;\n");
      out.write("}\n");
      out.write("/*상품구현 위치 */\n");
      out.write("#container1 {\n");
      out.write("		position: relative;\n");
      out.write("		top:300px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!-- 상품에 마우스 올릴때 및 위치 조정  -->\n");
      out.write("<style>\n");
      out.write("  .py-5 div:hover {\n");
      out.write("  border-color:#333;\n");
      out.write(" }   \n");
      out.write("  .col {\n");
      out.write("  padding:70px 70px 0 70px;\n");
      out.write("  } \n");
      out.write("\n");
      out.write("  .detail-text-center {\n");
      out.write(" 	padding:30px;\n");
      out.write("  height:140px;\n");
      out.write("  text-align:center;\n");
      out.write("  }    \n");
      out.write(" </style>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:#FFFAF6\">\n");
      out.write("	\n");
      out.write("	<!-- 메인홈바 -->\n");
      out.write("	<nav id=\"navBar\" class=\"navbar navbar-expand-lg navbar\">\n");
      out.write("		<div class=\"container-fluid\">\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\n");
      out.write("				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("				aria-label=\"Toggle navigation\">\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("			</button>\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("					\n");
      out.write("				<!-- 상품 카테고리 한눈에 차라락 보여주기  -->\n");
      out.write("					<ul id=\"nav\">\n");
      out.write("					<li class=\"nav-item dropdown\"><a\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"main.do\" id=\"navbarDropdown\"\n");
      out.write("						role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("							Scent </a>\n");
      out.write("						<ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"allList.do\">All</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"sFList.do\">Floral</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"sCList.do\">Citrus</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"sFRList.do\">Fresh</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"sFTList.do\">Fruity</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"sWList.do\">Woody</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"sOList.do\">Oriental</a></li>\n");
      out.write("						</ul>\n");
      out.write("					</li> \n");
      out.write("				<!-- 상품별로 보여주기  -->\n");
      out.write("					<li class=\"nav-item dropdown\"><a\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"main.do\" id=\"navbarDropdown\"\n");
      out.write("						role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("							Perfume </a>\n");
      out.write("						<ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"allList.do\">All</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"pPList.do\">Eau de perfume</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"pTList.do\">Eau de toilette</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"pCList.do\">Eau de cologne</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"pBList.do\">Body Spray</a></li>\n");
      out.write("						</ul>\n");
      out.write("					</li>\n");
      out.write("					<!-- 1:1문의 ,공지사항, 상품문의  -->\n");
      out.write("					<li><a class=\"nav-link px-2\" href=\"#\">About</a>\n");
      out.write("						<ul>\n");
      out.write("							<li><a href=\"noticeBoardList.do\">Notice</a></li>\n");
      out.write("							<!-- <li><a href=\"counselList.do\">Q&A</a></li> -->\n");
      out.write("							");

							if(session.getAttribute("userID") == null){
							
      out.write("\n");
      out.write("							<li><a href=\"logInV.jsp\">Q&A</a></li>\n");
      out.write("							");

							}else if(session.getAttribute("userID") != null){
							
      out.write("\n");
      out.write("							<li><a href=\"counselList.do\">Q&A</a></li>\n");
      out.write("						  ");
 } 
      out.write("\n");
      out.write("						</ul>\n");
      out.write("					</li>\n");
      out.write("				</ul>\n");
      out.write("				</ul>\n");
      out.write("				<!--로고 -->\n");
      out.write("      			  <div class=\"container col-12 col-lg-auto me-lg-auto mb-2 mb-md-0\">\n");
      out.write("   					 <a class=\"navbar-brand\" href=\"main.do\">\n");
      out.write("   					   <img src=\"assets/logo.png\"  alt=\"\" width=\"300\" height=\"150\">\n");
      out.write("  					  </a>\n");
      out.write("				  </div>\n");
      out.write("      			 <!--검색내용  -->\n");
      out.write("				<form  class=\"d-flex\" method=\"post\" action=\"searchProduct.do\" >\n");
      out.write("				<div>\n");
      out.write("					<input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.searchText }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\"  class=\"form-control me-2\" placeholder=\"검색하기\" name=\"searchText\" aria-label=\"Search\"> \n");
      out.write("				</div>\n");
      out.write("				\n");
      out.write("					<div class=\"text-end\">\n");
      out.write("					\n");
      out.write("					<!--  검색 -->\n");
      out.write("					<div> \n");
      out.write("				<button type=\"submit\" class=\"btn text-white\">\n");
      out.write("                  <svg xmlns=\"http://www.w3.org/2000/svg\"  width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-search-heart\" viewBox=\"0 0 14 14 \">\n");
      out.write("				  <path d=\"M6.5 4.482c1.664-1.673 5.825 1.254 0 5.018-5.825-3.764-1.664-6.69 0-5.018Z\"/>\n");
      out.write(" 				 <path d=\"M13 6.5a6.471 6.471 0 0 1-1.258 3.844c.04.03.078.062.115.098l3.85 3.85a1 1 0 0 1-1.414 1.415l-3.85-3.85a1.007 1.007 0 0 1-.1-.115h.002A6.5 6.5 0 1 1 13 6.5ZM6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11Z\"/>\n");
      out.write("				</svg>\n");
      out.write("				<span class=\"visually-hidden\"></span>\n");
      out.write("                </button>\n");
      out.write("				 </div> \n");
      out.write("				 </div>\n");
      out.write("				</form>\n");
      out.write("				\n");
      out.write("				<!-- 마이페이지 -->\n");
      out.write("					");
 
				 	 if(session.getAttribute("userID") == null){
					
      out.write("\n");
      out.write("					<i class=\"bi bi-person-fill\" style=\"font-size:2.5rem;cursor: pointer;\" onclick = \"location.href='logInV.jsp'\" ></i>\n");
      out.write("					");

					}else if(session.getAttribute("userID") != null){
					
      out.write("\n");
      out.write("					<i class=\"bi bi-person-fill\" style=\"font-size:2.5rem;cursor: pointer;\" onclick = \"location.href='myPageV.jsp'\" ></i>\n");
      out.write("				  ");
 } 
      out.write("\n");
      out.write("				  <!-- 장바구니 -->\n");
      out.write("					<j  class=\"bi bi-bag-heart\" style=\"font-size:2.3rem; cursor: pointer;\" onclick = \"cartListCheckUser()\"></j>\n");
      out.write("					\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("	</nav>\n");
      out.write("	\n");
      out.write("		<!-- 비디오1  -->\n");
      out.write("		<!-- 비디오에 하이퍼링크 띄우기  -->\n");
      out.write("		<ul>\n");
      out.write("		<video id=\"videobcg\" width=\"100%\" height=\"480\"  autoplay loop muted>\n");
      out.write("			<source	src=\"assets/pexels-rose.mp4\" type=\"video/mp4\" >\n");
      out.write("		</video>\n");
      out.write("			<div class=\"jb-text\">\n");
      out.write("      	  <p id=\"hyper1\">Red in full bloom</p>\n");
      out.write("    	  </div>\n");
      out.write("		<a id=\"hyper2\" href=\"sFList.do\">More </a>		\n");
      out.write("		</ul>\n");
      out.write("		\n");
      out.write("	<!-- 상품 구현  -->\n");
      out.write("\n");
      out.write("    <section class=\"py-5\">\n");
      out.write("               			  <div class=\"row row-cols-1 row-cols-md-4 g-4\">\n");
      out.write("		  					");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  				  </div>\n");
      out.write("  				  </section>\n");
      out.write(" \n");
      out.write("\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" \n");
      out.write("	integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" \n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var userID = '");
      out.print(session.getAttribute("userID"));
      out.write("';\n");
      out.write("function cartListCheckUser() {\n");
      out.write("	if (userID != 'null'){\n");
      out.write("		location.href='cartList.do?userID='+userID;\n");
      out.write("	}\n");
      out.write("	else{\n");
      out.write("		alert(\"로그인이 필요합니다.\");\n");
      out.write("		location.href='logInV.jsp?productCode='+productCode1;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /mainV.jsp(189,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/mainV.jsp(189,9) '${mainList }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${mainList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /mainV.jsp(189,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("dto");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write(" 								 <div class=\"col\">\n");
            out.write("   									 <div class=\"card h-100\">\n");
            out.write("   									  <a class=\"card-image\" href=\"productDetail.do?productCode=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.productCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("   									  <img class=\"card-img-top\" src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.productImages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" /></a>\n");
            out.write("     								 <div class=\"card-body\">\n");
            out.write("     								  <div class=\"detail-text-center\">\n");
            out.write("                              	     <p class=\"pd.name\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.productName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p> \n");
            out.write("                                    <!-- Product size-->\n");
            out.write("                             		<p class=\"pd.size\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.productSize }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("ml</p>\n");
            out.write("                                    <!-- Product price-->\n");
            out.write("                                	<p class=\"pd.price\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.productPrice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("원</p>\n");
            out.write("    				 		 </div>\n");
            out.write("    				 		 </div>\n");
            out.write("    				 		 </div>\n");
            out.write("    				 		 </div>\n");
            out.write("               		 ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
