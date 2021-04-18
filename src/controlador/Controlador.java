/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Produccion;
import vista.Prod;
import vista.Vista;

/**
 *
 * @author 57322
 */
public class Controlador implements ActionListener{
  private Produccion Model;
  private Vista Vist;
  private Prod produ;
  public Controlador(Produccion Model, Vista Vist, Prod produ){
      this.Model=Model;
      this.Vist=Vist;
      this.produ = produ;
      this.Vist.BotonIngresarClientes.addActionListener(this);
      this.Vist.BotonProduccion.addActionListener(this);
      this.produ.produccionfecha.addActionListener(this);
      this.produ.produccionfuncionario.addActionListener(this);
      this.produ.produccionservicio.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==Vist.BotonIngresarClientes){
                Model.ingresaClientes();
            }else if(ae.getSource()==Vist.BotonProduccion){
                Vist.setVisible(false);
                produ.setVisible(true);
            }else if(ae.getSource() == produ.produccionfecha){
                    Model.ProduccionPorDia();
            }else if( ae.getSource() == produ.produccionfuncionario){
                    Model.ProdFuncionario();
            }else if( ae.getSource()== produ.produccionservicio){
                    Model.prodPorServicio();
                }
  
}
}
