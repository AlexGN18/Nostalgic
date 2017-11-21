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
 * @author Martin
 */

@Entity
@Table (name="reply",catalog="nostalgicbueno")
public class replyPojo {
    
    
    @Id @GeneratedValue
    @Column (name="idreply")
    private int idreply;
    
    
    @Column (name="Reply")
    private String Reply;
 
   
    
    @Column (name="Time")
    private Date Time;
    
    @Column (name="Status")
    private boolean Status;
    
    
    @Column (name="Status_1_Recibido")
    private boolean Status_1_Recibido;
   
    
     @Column (name="Status_2_Recibido")
    private boolean Status_2_Recibido;
    
     @ManyToOne
     @JoinColumn (name="User")
     private usuarioPojo idusuario;
    
    
     @ManyToOne
     @JoinColumn (name="idConversacion")
     private conversacionPojo idconversacion;

    /**
     * @return the idreply
     */
    public int getIdreply() {
        return idreply;
    }

    /**
     * @param idreply the idreply to set
     */
    public void setIdreply(int idreply) {
        this.idreply = idreply;
    }

    /**
     * @return the Reply
     */
    public String getReply() {
        return Reply;
    }

    /**
     * @param Reply the Reply to set
     */
    public void setReply(String Reply) {
        this.Reply = Reply;
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
     * @return the Status
     */
    public boolean isStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    /**
     * @return the Status_1_Recibido
     */
    public boolean isStatus_1_Recibido() {
        return Status_1_Recibido;
    }

    /**
     * @param Status_1_Recibido the Status_1_Recibido to set
     */
    public void setStatus_1_Recibido(boolean Status_1_Recibido) {
        this.Status_1_Recibido = Status_1_Recibido;
    }

    /**
     * @return the Status_2_Recibido
     */
    public boolean isStatus_2_Recibido() {
        return Status_2_Recibido;
    }

    /**
     * @param Status_2_Recibido the Status_2_Recibido to set
     */
    public void setStatus_2_Recibido(boolean Status_2_Recibido) {
        this.Status_2_Recibido = Status_2_Recibido;
    }

    /**
     * @return the idusuario
     */
    public usuarioPojo getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(usuarioPojo idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * @return the idconversacion
     */
    public conversacionPojo getIdconversacion() {
        return idconversacion;
    }

    /**
     * @param idconversacion the idconversacion to set
     */
    public void setIdconversacion(conversacionPojo idconversacion) {
        this.idconversacion = idconversacion;
    }

   
    
    
}
