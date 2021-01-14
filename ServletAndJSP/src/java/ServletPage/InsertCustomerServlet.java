package ServletPage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(name = "InsertCustomerServlet", urlPatterns = {"/InsertCustomerServlet"})
public class InsertCustomerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
          String _username = request.getParameter("user");
            String _password = request.getParameter("pass");
            if(_username !=null && _password !=null){
                 if(_username.equals("UAS") && _password.equals("12131294")){
                   response.sendRedirect("True.jsp");
                 }else{
                    response.sendRedirect("Wrong.jsp");
                 }
            }else{
                response.sendRedirect("Wrong.jsp");
            }
        }
    }

 
 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
     
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
