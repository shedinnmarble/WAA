import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dewei Xiang on 3/3/2017.
 */
@WebServlet(name = "Removenamesservlet ")
public class Removenamesservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        Set<Person> list=(Set<Person>)session.getAttribute("person");
        if(list==null){
            list=new HashSet<Person>();
            session.setAttribute("person",list);
        }
        int key=Integer.parseInt(request.getParameter("key"));
        boolean isFind=false;
        for(Person p:list){
            if(p.getKey()==key){
                isFind=true;
                list.remove(p);
                break;
            }
        }
        if(isFind){
            out.println("Find Key:"+key+", Deleted");
        }else{
            out.println("Can't find Key:"+key);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
