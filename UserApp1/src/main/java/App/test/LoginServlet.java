package App.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	@Override
   protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,
   IOException
   {
	   String uN = req.getParameter("uname");
	   String pW = req.getParameter("pword");
	   LoginDAO ld = new LoginDAO();
	   UserBean ub = ld.login(uN, pW);
	   if(ub==null) {
		   req.setAttribute("msg", "Invalid Login Process...<br>");
		         //request Object added the variable msg
		   RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
		   rd.forward(req, res);
	   }else {
		   ServletContext sct = req.getServletContext();
		        //Accessing ServletContext Object reference
		   sct.setAttribute("ub",ub);
		   Cookie ck = new Cookie("fname",ub.getfName());
		   res.addCookie(ck);//Adding Cookie to response
		   RequestDispatcher rd = req.getRequestDispatcher("LogSuccess.jsp");
		   rd.forward(req, res);
	   }
   }
}

