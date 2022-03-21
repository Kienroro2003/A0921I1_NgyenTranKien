import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("list-price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount-percent"));
        float discountAmount = (float) (listPrice * discountPercent * 0.01);
        float discountPrice = listPrice - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Luong chiet khau : "+discountAmount+"</h2>");
        writer.println("<h2>Gia sau khi chiet khau : "+discountPrice+"</h2>");
        writer.println("</html>");
    }
}
