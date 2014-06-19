package servlets;

import beans.LoginBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/profile")
public class ProfileController extends HttpServlet {
    private LoginBean loginBean = new LoginBean();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("loginBean", loginBean);
        RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
        rd.forward(req, resp);
    }
}
