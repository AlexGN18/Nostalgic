/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.whatsAppDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author miguel
 */
@WebServlet(name = "Consultas", urlPatterns = {"/Consultas"})
public class Consultas extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("applications/json;charset=UTF-8");

        String tipoConsulta = request.getParameter("consulta");

        List<String> errores = new ArrayList<>();
        if (tipoConsulta == null || tipoConsulta.isEmpty()) {
            errores.add("No se especifico el tipo de consulta.");
        }

        if (!errores.isEmpty()) {
            JSONObject respuesta = new JSONObject();
            respuesta.put("status", false);
            respuesta.put("errores", errores);
            try (PrintWriter out = response.getWriter()) {
                out.print(respuesta.toString());
                out.close();
                this.destroy();
                return;
            }
        }

        if (tipoConsulta.equals("usuarios")) {
            JSONObject respuestaParaElCliente = new JSONObject();
            respuestaParaElCliente.put("usuarios", new whatsAppDao().getTodosContactosJSON());
            System.out.println(new whatsAppDao().getTodosContactosJSON());
            try (PrintWriter out = response.getWriter()) {
                out.print(respuestaParaElCliente.toString());
                out.close();
            }
        }
        this.destroy();
    }

}
