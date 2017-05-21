package edu.mum.lab4mvc;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dewei Xiang on 3/26/2017.
 */
@Controller
public class NameController {
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public String greeting(HttpServletRequest request) {
        HttpSession session=request.getSession();
        Set<Person> list=(Set<Person>)session.getAttribute("person");
        if(list==null){
            list=new HashSet<Person>();
            session.setAttribute("person",list);
        }

        String json = new Gson().toJson(list);
        return json;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(HttpServletRequest request,@ModelAttribute("person") Person person){
        HttpSession session=request.getSession();
        Set<Person> list=(Set<Person>)session.getAttribute("person");
        if(list==null){
            list=new HashSet<Person>();
            session.setAttribute("person",list);
        }
        list.add(person);
        return "success";
    }
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @ResponseBody
    public String remove(HttpServletRequest request){
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
           return ("Find Key:"+key+", Deleted");
        }else{
           return ("Can't find Key:"+key);
        }
    }
}
