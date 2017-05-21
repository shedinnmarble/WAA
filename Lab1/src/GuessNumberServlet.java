import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by yafen on 2/25/2017.
 */
@WebServlet(name = "GuessNumberServlet")
public class GuessNumberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int number=Integer.parseInt(request.getParameter("number"));
        Random random=new Random();
       int randomValue= random.nextInt(10);
       if(number<randomValue){
           output(out,"Too low, try again");
       }else if(number>randomValue){
           output(out,"Too high, try again \n");
       }else{
           output(out,"Correct, congratulations! ");
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        output(out,"");


    }
    private void output(PrintWriter out, String message){
        out.println("<html>");
        out.println("<body>");
        out.println("<form method=POSt action=guessNumber>");
        out.println("Input Number=<input type=text name=number> <br>");
        out.println("<input type=submit value='submit'>");
        if(!message.isEmpty()){
            out.println(message+"<br>");
        }
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
