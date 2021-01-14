package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            @import url(http://fonts.googleapis.com/css?family=Roboto);\n");
      out.write("\n");
      out.write("/****** LOGIN MODAL ******/\n");
      out.write(".loginmodal-container {\n");
      out.write("  padding: 30px;\n");
      out.write("  max-width: 350px;\n");
      out.write("  width: 100% !important;\n");
      out.write("  background-color: #F7F7F7;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  border-radius: 2px;\n");
      out.write("  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("  overflow: hidden;\n");
      out.write("  font-family: roboto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginmodal-container h1 {\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 1.8em;\n");
      out.write("  font-family: roboto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginmodal-container input[type=submit] {\n");
      out.write("  width: 100%;\n");
      out.write("  display: block;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginmodal-container input[type=text], input[type=password] {\n");
      out.write("  height: 44px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  -webkit-appearance: none;\n");
      out.write("  background: #fff;\n");
      out.write("  border: 1px solid #d9d9d9;\n");
      out.write("  border-top: 1px solid #c0c0c0;\n");
      out.write("  /* border-radius: 2px; */\n");
      out.write("  padding: 0 8px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginmodal-container input[type=text]:hover, input[type=password]:hover {\n");
      out.write("  border: 1px solid #b9b9b9;\n");
      out.write("  border-top: 1px solid #a0a0a0;\n");
      out.write("  -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("  -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("  box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginmodal {\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-family: 'Arial', sans-serif;\n");
      out.write("  font-weight: 700;\n");
      out.write("  height: 36px;\n");
      out.write("  padding: 0 8px;\n");
      out.write("/* border-radius: 3px; */\n");
      out.write("/* -webkit-user-select: none;\n");
      out.write("  user-select: none; */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginmodal-submit {\n");
      out.write("  /* border: 1px solid #3079ed; */\n");
      out.write("  border: 0px;\n");
      out.write("  color: #fff;\n");
      out.write("  text-shadow: 0 1px rgba(0,0,0,0.1); \n");
      out.write("  background-color: #4d90fe;\n");
      out.write("  padding: 17px 0px;\n");
      out.write("  font-family: roboto;\n");
      out.write("  font-size: 14px;\n");
      out.write("  /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginmodal-submit:hover {\n");
      out.write("  /* border: 1px solid #2f5bb7; */\n");
      out.write("  border: 0px;\n");
      out.write("  text-shadow: 0 1px rgba(0,0,0,0.3);\n");
      out.write("  background-color: #357ae8;\n");
      out.write("  /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginmodal-container a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #666;\n");
      out.write("  font-weight: 400;\n");
      out.write("  text-align: center;\n");
      out.write("  display: inline-block;\n");
      out.write("  opacity: 0.6;\n");
      out.write("  transition: opacity ease 0.5s;\n");
      out.write("} \n");
      out.write("\n");
      out.write(".login-help{\n");
      out.write("  font-size: 12px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <div class=\"loginmodal-container\">\n");
      out.write("\t\t\t\t\t<h1>Login to Your Account</h1><br>\n");
      out.write("                                        <form action=\"InsertCustomerServlet\" method=\"POST\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"user\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"login\" class=\"login loginmodal-submit\" value=\"Login\">\n");
      out.write("\t\t\t\t  </form>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t  <div class=\"login-help\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">Register</a> - <a href=\"#\">Forgot Password</a>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t</div>\n");
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
