package App.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[] = req.getCookies();
		if (c == null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		} else {
			String fN = c[0].getValue();
			req.setAttribute("fName", fN);
			req.getRequestDispatcher("EditProfile.jsp").forward(req, res);
		}
	}
}
