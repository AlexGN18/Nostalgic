/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author edher
 */
@Entity
@Table (name="conversacion", catalog="nostalgicbueno")
public class conversacionPojo {
    
    @Id @GeneratedValue
    @Column(name="idconversacion")
    private int idconversacion;

    @Column(name="Time")
    private Date Time;
    
    @Column(name="Actualizar")
    private boolean Actualizar;
    
    @Column(name="Usuario_1_Leido")
    private boolean Usuario_1_Leido;
    
    @Column(name="Usuario_2_Leido")
    private boolean Usuario_2_Leido;

    @ManyToOne
    @JoinColumn (name="Usuario_1")
    private usuarioPojo idusuario1;
    
    @ManyToOne
    @JoinColumn (name="Usuario_2")
    private usuarioPojo idusuario2;
    /**
     * @return the idconversacion
     */
    public int getIdconversacion() {
        return idconversacion;
    }

    /**
     * @param idconversacion the idconversacion to set
     */
    public void setIdconversacion(int idconversacion) {
        this.idconversacion = idconversacion;
    }

    

    /**
     * @return the Time
     */
    public Date getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(Date Time) {
        this.Time = Time;
    }

    /**
     * @return the Actualizar
     */
    public boolean getActualizar() {
        return Actualizar;
    }

    /**
     * @param Actualizar the Actualizar to set
     */
    public void setActualizar(boolean Actualizar) {
        this.Actualizar = Actualizar;
    }

    /**
     * @return the Usuario_1_Leido
     */
    public boolean getUsuario_1_Leido() {
        return Usuario_1_Leido;
    }

    /**
     * @param Usuario_1_Leido the Usuario_1_Leido to set
     */
    public void setUsuario_1_Leido(boolean Usuario_1_Leido) {
        this.Usuario_1_Leido = Usuario_1_Leido;
    }

    /**
     * @return the Usuario_2_Leido
     */
    public boolean getUsuario_2_Leido() {
        return Usuario_2_Leido;
    }

    /**
     * @param Usuario_2_Leido the Usuario_2_Leido to set
     */
    public void setUsuario_2_Leido(boolean Usuario_2_Leido) {
        this.Usuario_2_Leido = Usuario_2_Leido;
    }

    /**
     * @return the idusuario1
     */
    public usuarioPojo getIdusuario1() {
        return idusuario1;
    }

    /**
     * @param idusuario1 the idusuario1 to set
     */
    public void setIdusuario1(usuarioPojo idusuario1) {
        this.idusuario1 = idusuario1;
    }

    /**
     * @return the idusuario2
     */
    public usuarioPojo getIdusuario2() {
        return idusuario2;
    }

    /**
     * @param idusuario2 the idusuario2 to set
     */
    public void setIdusuario2(usuarioPojo idusuario2) {
        this.idusuario2 = idusuario2;
    }
    
}
