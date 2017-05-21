<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: Dewei
  Date: 3/19/2017
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Number</title>
</head>
<body>
<form>
    <span>Input Number=</span><input type="number" name="number"> <br>
    <input type=submit value='submit'>
   <% if(request.getParameter("number")!=null&&request.getParameter("number")!=""){
       int number=Integer.parseInt(request.getParameter("number"));
       Random random=new Random();
       int randomValue= random.nextInt(10);
       if(number<randomValue){

          out.println( "Too low, try again");
       }else if(number>randomValue){
           out.println("Too high, try again \n");
       }else{
           out.println("Correct, congratulations! ");
       }
   }%>
</form>
</body>
</html>
