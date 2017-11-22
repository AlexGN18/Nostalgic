/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.whatsAppDao;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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

        whatsAppDao usuarioNew = new whatsAppDao();
        usuarioNew.savePersona(nombre, nickname, correo, telefono, contraseña);
        usuarioPojo usuarioLogin = new usuarioPojo();
        if (correo != null && !correo.isEmpty()) {
            usuarioLogin = new whatsAppDao().getPersonaByEmail(correo);
        }

        try (PrintWriter out = response.getWriter()) {
            if (usuarioLogin != null && usuarioLogin.getContraseña().equals(contraseña)) {
                System.out.println(usuarioLogin.getNickName() + " ha iniciado sesion");
                request.getSession(true).setAttribute("usuario", usuarioLogin);
                request.getSession().setAttribute("nickname", usuarioLogin.getNickName());
                out.print("true");
                return;
            }
            out.print("false");
        }

    }

}
