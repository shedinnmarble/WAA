import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Dewei Xiang on 3/3/2017.
 */
@WebServlet(name = "Addnamesservlet")
public class Addnamesservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        Set<Person> list=(Set<Person>)session.getAttribute("person");
        if(list==null){
            list=new HashSet<Person>();
            session.setAttribute("person",list);
        }
        String key=request.getParameter("key");
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        Person p=new Person(Integer.parseInt(key),firstName,lastName);
        list.add(p);
        PrintWriter out=response.getWriter();
        out.write("success");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
