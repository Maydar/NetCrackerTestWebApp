package servlets;

import beans.LoginBean;
import beans.PlayerBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class LoginController extends HttpServlet {
    private String name;
    private String password;
    private LoginBean loginBean = new LoginBean();
    private PlayerBean playerBean = new PlayerBean();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameterMap().toString());
        name = request.getParameter("name");
        password = request.getParameter("password");



        loginBean.setUserName(name);
        loginBean.setPassword(password);
        request.setAttribute("loginBean", loginBean);
        request.setAttribute("playerBean", playerBean);


        boolean status = loginBean.validate();
        if(status){
            RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");

            rd.forward(request, response);
        }
        else{
            RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
            rd.forward(request, response);
        }


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
