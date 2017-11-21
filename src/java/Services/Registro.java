/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.whatsAppDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.usuarioPojo;

/**
 *
 * @author miguel
 */
@WebServlet(name = "Registro", urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("usuario");
        String nickname = request.getParameter("nick");
        String contraseña = request.getParameter("password");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");

        usuarioPojo usuario = new usuarioPojo();
        usuario.setNombre(nombre);
        usuario.setNickName(nickname);
        usuario.setContraseña(contraseña);
        usuario.setTelefono(telefono);
        usuario.setEmail(correo);
        
        whatsAppDao usuarioNew=new whatsAppDao();
        usuarioNew.savePersona(nombre, nickname, correo, telefono, contraseña);

            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);
            response.sendRedirect("ChatRoom.jsp");

        
    }

}
