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
    @Table(name="usuario",catalog="nostalgicbueno")
    public class usuarioPojo {

        @Id @GeneratedValue
        @Column (name = "idusuario")
        private int idusuario;

        @Column (name = "Nombre")
        private String Nombre;

         @Column (name = "NickName")
        private String NickName;

        @Column (name = "Telefono")
        private String Telefono;

        @Column (name = "Email")
        private String Email;

        @Column (name = "Contraseña")
        private String Contraseña;

       

        

        /**
         * @return the idusuario
         */
        public int getIdusuario() {
            return idusuario;
        }

        /**
         * @param idusuario the idusuario to set
         */
        public void setIdusuario(int idusuario) {
            this.idusuario = idusuario;
        }

        /**
         * @return the Nombre
         */
        public String getNombre() {
            return Nombre;
        }

        /**
         * @param Nombre the Nombre to set
         */
        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        /**
         * @return the NickName
         */
        public String getNickName() {
            return NickName;
        }

        /**
         * @param NickName the NickName to set
         */
        public void setNickName(String NickName) {
            this.NickName = NickName;
        }

        /**
         * @return the Telefono
         */
        public String getTelefono() {
            return Telefono;
        }

        /**
         * @param Telefono the Telefono to set
         */
        public void setTelefono(String Telefono) {
            this.Telefono = Telefono;
        }

        /**
         * @return the Email
         */
        public String getEmail() {
            return Email;
        }

        /**
         * @param Email the Email to set
         */
        public void setEmail(String Email) {
            this.Email = Email;
        }

        /**
         * @return the Contraseña
         */
        public String getContraseña() {
            return Contraseña;
        }

        /**
         * @param Contraseña the Contraseña to set
         */
        public void setContraseña(String Contraseña) {
            this.Contraseña = Contraseña;
        }

        /**
         * @return the lista_Contacto
         */
        //public listaContactoPojo getLista_Contacto() {
          //  return lista_Contacto;
        //}

        /**
         * @param lista_Contacto the lista_Contacto to set
         */
   



    }
