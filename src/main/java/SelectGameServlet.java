
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectgameservlet",
        urlPatterns = "/SelectGame"
)
public class SelectGameServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String gameType = req.getParameter("Type");

        GameService gameService = new GameService();
        GameType l = GameType.valueOf(gameType);

        List gameTitles = gameService.getAvailableTitle(l);

        req.setAttribute("gameTitles", gameTitles);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
