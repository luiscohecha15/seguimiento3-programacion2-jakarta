package org.example.seguimiento3;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
@WebServlet(value = "/login")
// Aquí estamos tomando el servlet login que extiende HttpServlet.
public class login extends HttpServlet {

    // Aquí estamos usando doPost() método como en el formulario que estamos usando el método POST.
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // Se toman parámetros utilizando el objeto de solicitud, es decir, nombre de usuario y contraseña.
        String usuario=request.getParameter("usuario");
        String clave=request.getParameter("clave");

        // Si los campos están vacíos se solicitan de nuevo
        if (usuario.isEmpty()|| clave.isEmpty()){
            RequestDispatcher req=request.getRequestDispatcher("inicio_login.jsp");
            req.include(request,response);
        }else {
            RequestDispatcher req=request.getRequestDispatcher("login_correcto.jsp");
            req.forward(request,response);
        }
    }
}
