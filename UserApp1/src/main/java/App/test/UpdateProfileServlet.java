package App.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[] = req.getCookies();
		if (c == null) {
			req.setAttribute("mag", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		} else {
			String fN = c[0].getValue();
			ServletContext sct = req.getServletContext();
			UserBean ub = (UserBean) sct.getAttribute("ub");
			ub.setCity(req.getParameter("city"));
			ub.setmId(req.getParameter("mid"));
			ub.setPhNo(Long.parseLong(req.getParameter("phno")));
			int k = new UpdateProfileDAO().update(ub);
			if (k > 0) {
				req.setAttribute("fName", fN);
				req.setAttribute("msg", "Profile Updated Successfully...<br>");
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
			}
		}
	}
}
