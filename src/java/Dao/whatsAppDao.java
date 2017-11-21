/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import hbm.HibernateUtil;
import java.util.List;
//import javafx.scene.chart.PieChart.Data;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.conversacionPojo;
import pojo.replyPojo;
import pojo.usuarioPojo;

/**
 *
 * @author Martin
 */
public class whatsAppDao {

    Session session;

    public whatsAppDao() {
        session = HibernateUtil.getLocalSession();
    }

    public List<usuarioPojo> getPersonaById(String correo, String password) {
        List<usuarioPojo> listaCorreo = (List<usuarioPojo>) session.createCriteria(usuarioPojo.class)
                .add(Restrictions.eq("Email", correo)).add(Restrictions.eq("Contraseña", password)).list();
        return listaCorreo;
    }
    
    public usuarioPojo getPersonaByEmail(String email) {
        return (usuarioPojo) this.session.createCriteria(usuarioPojo.class)
                .add(Restrictions.eq("Email", email))
                .uniqueResult();
    }

    public boolean savePersona(String nombre, String nickName, String correo, String telefono, String contraseña) {
        usuarioPojo datosUsuario = new usuarioPojo();

        datosUsuario.setNombre(nombre);
        datosUsuario.setNickName(nickName);
        datosUsuario.setEmail(correo);
        datosUsuario.setTelefono(telefono);
        datosUsuario.setContraseña(contraseña);

        try {
            Transaction transaccion = session.beginTransaction();
            session.save(datosUsuario);
            System.out.println("lo logre");
            transaccion.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeLocalSession();
        }
        return true;
    }

    public boolean saveMensaje(int id, String mensaje, int idUsuario) {
        replyPojo guardarMensaje = new replyPojo();
        usuarioPojo usuario = (usuarioPojo) session.load(usuarioPojo.class, idUsuario);

        guardarMensaje.setIdreply(id);
        //guardarMensaje.setIdconversacion(idUsuario);
        guardarMensaje.setIdusuario(usuario);
        guardarMensaje.setReply(mensaje);
        System.out.println("Entre aqui");

        try {
            Transaction transaccion = session.beginTransaction();
            session.save(guardarMensaje);
            System.out.println("lo logre");
            transaccion.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeLocalSession();
        }
        return true;
    }

    public boolean saveConversacion(int id, int idUsuario, usuarioPojo usuario1, usuarioPojo usuario2) {
        conversacionPojo guardarConversacion = new conversacionPojo();

        guardarConversacion.setIdconversacion(id);
        guardarConversacion.setIdusuario1(usuario1);
        guardarConversacion.setIdusuario2(usuario2);
        guardarConversacion.setIdconversacion(idUsuario);
        //guardarConversacion.setTime(Time);

        System.out.println("Entre a la funcion");
        try {
            Transaction transaccion = session.beginTransaction();
            session.save(guardarConversacion);
            System.out.println("lo logre");
            transaccion.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeLocalSession();
        }
        return true;
    }

    public boolean updateById(int id, usuarioPojo persona) {

        usuarioPojo personaAModificar = getUsuarioById(id);

        try {
            Transaction transaccion = session.beginTransaction();
            personaAModificar.setNombre(persona.getNombre());
            session.update(personaAModificar);
            //actualiza la base de datos
            transaccion.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public usuarioPojo getUsuarioById(int id) {
        return (usuarioPojo) session.load(usuarioPojo.class, id);

    }

    public conversacionPojo getConversacionById(int conv) {
        return (conversacionPojo) session.load(conversacionPojo.class, conv);
    }

}
