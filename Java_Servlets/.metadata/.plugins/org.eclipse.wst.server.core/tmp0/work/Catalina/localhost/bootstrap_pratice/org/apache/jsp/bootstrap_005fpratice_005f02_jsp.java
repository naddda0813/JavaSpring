/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-04-04 03:52:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bootstrap_005fpratice_005f02_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Perfume</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">쇼핑하기</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("           perfume\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">eau de perfume</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">eau de toillette</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">eau de cologne</a></li>\n");
      out.write("            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Body Spray</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("    	<div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("  		<img src=\"https://img.marieclairekorea.com/2019/12/mck_5e1d183804e42.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write(" 		 <div class=\"card-body\">\n");
      out.write("   		 <h5 class=\"card-title\">오늘의 향수 </h5>\n");
      out.write("  		  <p class=\"card-text\">향기로운 사람이 되는 첫번째 관문</p>\n");
      out.write("  		  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write(" 		 </div>\n");
      out.write("	</div>\n");
      out.write("	</div>  \n");
      out.write("    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("		<div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("  		<img src=\"https://www.superdrug.com/blog/wp-content/uploads/2020/12/top-10-female-fragrances.jpg\" class=\"card-img-top\" alt=\"...\">	\n");
      out.write(" 		 <div class=\"card-body\">\n");
      out.write("   		 <h5 class=\"card-title\">오늘의 향수 </h5>\n");
      out.write("  		  <p class=\"card-text\">향기로운 사람이 되는 첫번째 관문</p>\n");
      out.write("  		  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write(" 		 </div>\n");
      out.write("	</div>    \n");
      out.write("	</div>  \n");
      out.write("    <div class=\"col-lg-3 col-md-6\">\n");
      out.write(" 	   <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("  		<img src=\"https://www.makeup.com/-/media/project/loreal/brand-sites/mdc/americas/us/articles/2019/12-december/05-best-fragrance-2019/the-best-fragrances-of-2019-hero-mudc-120419.jpg\" class=\"card-img-top\" alt=\"...\">	\n");
      out.write(" 		 <div class=\"card-body\">\n");
      out.write("   		 <h5 class=\"card-title\">오늘의 향수 </h5>\n");
      out.write("  		  <p class=\"card-text\">향기로운 사람이 되는 첫번째 관문</p>\n");
      out.write("  		  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>   \n");
      out.write("  		 </div>\n");
      out.write("     </div>\n");
      out.write("  	</div>  	 \n");
      out.write("    <div class=\"col-lg-3 col-md-6\">\n");
      out.write(" 	   <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("  		<img src=\"https://cdn.shopify.com/s/files/1/0572/8357/5976/files/FUEGUIA3237_milan_600x600@2x.jpg?v=1639661241\" class=\"card-img-top\" alt=\"...\">	\n");
      out.write(" 		 <div class=\"card-body\">\n");
      out.write("   		 <h5 class=\"card-title\">오늘의 향수 </h5>\n");
      out.write("  		  <p class=\"card-text\">향기로운 사람이 되는 첫번째 관문</p>\n");
      out.write("  		  <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>   \n");
      out.write("  		  </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("    \n");
      out.write("   </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\">구매하기</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-secondary\">찜하기</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-success\">로그인</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-danger\">로그아웃</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-warning\">회원 가입</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-info\">회원 탈퇴</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-light\">Light</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-dark\">Dark</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-link\">Link</button>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<button type=\"button\" class=\"btn btn-primary btn-lg\">장바구니</button>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<button type=\"button\" class=\"btn btn-secondary btn-sm\">찜하기</button>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<button type=\"button\" class=\"btn btn-lg btn-primary\" disabled>Primary button</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-secondary btn-lg\" disabled>Button</button>\n");
      out.write("<a class=\"btn btn-primary btn-lg disabled\" role=\"button\" aria-disabled=\"true\">Primary link</a>\n");
      out.write("<a class=\"btn btn-secondary btn-lg disabled\" role=\"button\" aria-disabled=\"true\">Link</a>\n");
      out.write("<button type=\"button\" class=\"btn-close\" aria-label=\"Close\"></button>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
}