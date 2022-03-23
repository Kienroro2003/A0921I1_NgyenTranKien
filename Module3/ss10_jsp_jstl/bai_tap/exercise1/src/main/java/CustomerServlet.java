import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    static private List<Customer> list = new ArrayList<>();

    static {
        list.add(new Customer("Kien", "03/01/2003", "Da Nang","Untitled-1.jpg"));
        list.add(new Customer("Linh", "23/02/2003", "Quang Nam","Untitled-1.jpg"));
        list.add(new Customer("Van", "13/07/2003", "Da Nang","Untitled-1.jpg"));
        list.add(new Customer("Hung", "23/05/2003", "Tam Ki","Untitled-1.jpg"));
        list.add(new Customer("Tai", "29/11/2003", "Da Nang","Untitled-1.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
