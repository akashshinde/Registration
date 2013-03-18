package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Registration Page </h1>\n");
      out.write("        <form action=\"register\" method=\"post\">\n");
      out.write("            <p> <p>Name :     <input type=\"text\" class=\"input\" name=\"username\" /> <br><br>\n");
      out.write("           <p> <p>Password : <input type=\"text\" name=\"userpass\" /><br><br>\n");
      out.write("           <p> <p>Email ID : <input type=\"text\" name=\"usermail\" /><br><br>\n");
      out.write("           <p> <p>Country : \n");
      out.write("            <select name=\"usercountry\">\n");
      out.write("                <option>India</option>>\n");
      out.write("                <option>Pakistan</option>\n");
      out.write("                <option>Other</option>\n");
      out.write("            </select>\n");
      out.write("               <p><br>\n");
      out.write("               <br>\n");
      out.write("          <input type=\"submit\" class=\"styled-button-3\" value=\"Download\" /> \n");
      out.write("<style type=\"text/css\">\n");
      out.write(".styled-button-3 {\n");
      out.write("\t-webkit-box-shadow:rgba(0,0,0,0.0.1) 0 1px 0 0;\n");
      out.write("\t-moz-box-shadow:rgba(0,0,0,0.0.1) 0 1px 0 0;\n");
      out.write("\tbox-shadow:rgba(0,0,0,0.0.1) 0 1px 0 0;\n");
      out.write("\tbackground-color:#5B74A8;\n");
      out.write("\tborder:1px solid #29447E;\n");
      out.write("\tfont-family:'Lucida Grande',Tahoma,Verdana,Arial,sans-serif;\n");
      out.write("\tfont-size:12px;\n");
      out.write("\tfont-weight:700;\n");
      out.write("\tpadding:2px 6px;\n");
      out.write("\theight:28px;\n");
      out.write("\tcolor:#fff;\n");
      out.write("\tborder-radius:5px;\n");
      out.write("\t-moz-border-radius:5px;\n");
      out.write("\t-webkit-border-radius:5px\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        <div >\n");
      out.write("            <img src=\"my.jpg\" class=\"bg\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
