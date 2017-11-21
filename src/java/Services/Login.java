/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.whatsAppDao;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json;charset=UTF-8");
        
        String correo = request.getParameter("correoL");
        String contraseña = request.getParameter("passworL");
        System.out.println(correo+" "+contraseña);
        
        usuarioPojo usuarioLogin = new usuarioPojo();
        if(correo != null && !correo.isEmpty()) {
            usuarioLogin = new whatsAppDao().getPersonaByEmail(correo);
        }
        
        try (PrintWriter out = response.getWriter()) {
            if (usuarioLogin != null && usuarioLogin.getContraseña().equals(contraseña)) {
                System.out.println(usuarioLogin.getNickName()+" ha iniciado sesion");
                request.getSession(true).setAttribute("usuario", usuarioLogin);
                request.getSession().setAttribute("nickname", usuarioLogin.getNickName());
                out.print("true");
                return;
            }
            out.print("false");
        }

    }

}
