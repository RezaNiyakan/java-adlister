import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizzaForm")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizzaForm.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(request.getParameter("crust"));
        System.out.println(request.getParameter("sauce"));
        System.out.println(request.getParameter("size"));
        System.out.println(request.getParameter("address"));
        String[] toppings = request.getParameterValues("toppings");
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }
}
//
//        if(address.equals(null)){
//
//            response.sendRedirect("/pizzaForm.jsp");
//        } else {
//            System.out.println(size);
//            System.out.println(sauce);
//            System.out.println(toppings);
//            System.out.println(address);
//        }
//    }
//}
