import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yafen on 2/25/2017.
 */
@WebServlet(name = "LogonServlet")
public class LogonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String username=request.getParameter("username");
        String pwd=request.getParameter("password");
        if(username.equals("user")&&pwd.equals("pass")){
            out.println("Welcome user");
        }else{
            out.println("Wrong password");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<form method=POSt action=logon>");
        out.println("Username=<input type=text name=username> <br>");
        out.println("Password=<input type=text name=password>");
        out.println("<input type=submit value='Logon'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
