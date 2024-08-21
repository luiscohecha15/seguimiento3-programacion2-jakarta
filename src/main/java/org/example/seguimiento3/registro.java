package org.example.seguimiento3;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
// Importante la anotación
@WebServlet(value = "/registro")
//Aquí definimos registro que extiende HttpServlet.
public class registro extends HttpServlet {

    // Esta acción doPost() método que se llamará cuando mencionemos el atributo POST en acción en el formulario JSP anterior
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí obtenemos los valores de la solicitud
        String nombres = request.getParameter("textNombre");
        String apellidos = request.getParameter("textApellido");
        String usuario = request.getParameter("textUsuario");
        String clave = request.getParameter("passContrasena");
        String direcion = request.getParameter("textDireccion");
        String movil = request.getParameter("textMovil");

        // Aquí estamos tomando la condición if donde verificamos que cualquiera de los parámetros que se obtienen de la solicitud esté vacío o no
        if(nombres.isEmpty() || apellidos.isEmpty() || usuario.isEmpty() || clave.isEmpty() || direcion.isEmpty() || movil.isEmpty())
        {
            // Esta manera de llamar a la otra página es igual a la que hay en el else
            RequestDispatcher req = request.getRequestDispatcher("index.jsp");
            req.include(request, response);
        }
        else //Este caso se ejecutará cuando alguno de los parámetros no esté vacío
        {
            // Se arma un mensaje a enviar a la página donde se redirecciona.
            request.setAttribute("mensaje", "Registro exitoso para " + usuario + " (" + clave + ")");
            // Redirigir a la página JSP
            request.getRequestDispatcher("confirma_registro.jsp").forward(request, response);
        }
    }
}