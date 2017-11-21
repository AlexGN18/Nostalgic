/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.whatsAppDao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.usuarioPojo;

/**
 *
 * @author Martin
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test

     public void hello() {
        whatsAppDao puenteUsuario =new whatsAppDao();
       //puenteUsuario.savePersona("Gerardo", "aguilar", "rocio@coco.com", "987", "rocio", 0);
         
        System.out.println(""+puenteUsuario.getUsuarioById(3).getNombre());
         
      puenteUsuario.saveConversacion(0, 0,puenteUsuario.getUsuarioById(3)
       ,puenteUsuario.getUsuarioById(1));
         
       
          
         //puenteUsuario.saveMensaje(0, "que onda",2);
         
         
         //System.out.println("crayoli");
         //personaProNuevoPablo.setNombre("yahirelbebe");
         //personita.updateById(4, personaProNuevoPablo);
     }
    
    
}
