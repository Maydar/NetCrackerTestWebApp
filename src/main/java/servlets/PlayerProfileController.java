package servlets;

import beans.PlayerBean;
import model.Player;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/playerprofile")
public class PlayerProfileController extends HttpServlet {

    private PlayerBean playerBean = new PlayerBean();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Player player = playerBean.getPlayer(req.getParameter("playername"),
                Integer.valueOf(req.getParameter("playernumber")));
        req.setAttribute("player", player);
        if (player == null) {
            throw new NullPointerException("player is null");
        }
        RequestDispatcher rd = req.getRequestDispatcher("playerprofile.jsp");
        rd.forward(req, resp);
    }
}
