import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ASUS on 23-May-17.
 */

@WebServlet(name="hello",
        urlPatterns={"/"})
public class MyServletClass extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/hello.jsp");
        request.setAttribute("countryName","Armenia");
        dispatcher.forward(request, response);


//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<body>");
//        out.println("<h1>Hello World</h1>");
//        out.println("</body>");
//        out.println("</html>");
    }
}
