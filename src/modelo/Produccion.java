
package modelo;

import javax.swing.JOptionPane;

public class Produccion {
    User c = new User();
    int prod1=0;
    int prod2=0;
    int prod3=0;
    int prod4=0;
    int prod5=0;
    int prod6=0;
    int prod7=0;
    int prodFun1=0;
    int prodFun2=0;
    int fecha1=0;
    int fecha2=0;
    int fecha3=0;
    
    public void ingresaClientes(){
      int  opc;
        do{
            c.define();
            opc=Integer.parseInt(JOptionPane.showInputDialog("¿desea ingresar otro usuario? digite 1 si no digite cualquier numero"));
            
                this.prod1= this.prod1+c.prodia1;
                this.prod2=this.prod2+c.prodia2;
                this.prod3=this.prod3+c.prodia3;
                this.prod4=this.prod4+c.prodia4;
                this.prod5= this.prod5+c.prodia5;
                this.prod6= this.prod6+c.prodia6;
                this.prod7= this.prod7+c.prodia7;
                this.prodFun1=this.prodFun1+c.fun1;
                this.prodFun2=this.prodFun2+c.fun2;
                this.fecha1 = this.fecha1+c.dia1;
                this.fecha2 = this.fecha2+c.dia2;
                this.fecha3= this.fecha3+c.dia3;
            
           
                
            
        }while(opc ==1);
    }
    public void prodPorServicio(){
        int opc;
        
           opc=Integer.parseInt(JOptionPane.showInputDialog("por favor digite sobre que servicio quiere saber la produccion: 1. servicio 1, 2.servicio 2, 3. servicio 3, 4. servicio 4, 5. combo 6, 6. combo 7, 7. combo 8"));
           switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, " la produccion por el servicio 1 es: "+this.prod1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "la produccion por el servicio 2 es: "+this.prod2);
                break;
            case 3:
               JOptionPane.showMessageDialog(null, "la produccion por el servicio 3 es: "+this.prod3);
                break;
            case 4:
              JOptionPane.showMessageDialog(null, "la produccion por el servicio 4 es: "+this.prod4);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "la produccion por el combo 1 es: "+this.prod5);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "la produccion por el combo 2 es: "+this.prod6);
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "la produccion por el combo 3 es: "+this.prod7);
                break;
            default:
                break;
        }
        
    }
    public void ProdFuncionario(){
        int opc;
        
        opc=Integer.parseInt(JOptionPane.showInputDialog(" digite 1 si desea conocer produccion del funcionario 1 o digite 2 si desea conocer produccion del funcionario 2"));
       
        if(opc == 1){
        JOptionPane.showMessageDialog(null, " la produccion del funcionario 1 fue: "+this.prodFun1);
    }else if( opc== 2){
        JOptionPane.showMessageDialog(null, "la produccion del funcionario 2 fue: "+this.prodFun2);
    }
    }
    
    public void ProduccionPorDia(){
        int opc;
        
         opc=Integer.parseInt(JOptionPane.showInputDialog(" digite 1 si desea conocer la produccion entre semana, digite 2 si desea conocer la produccion durante el fin de semana, o digite 3 si desea conocer la produccion durante los dias festivos"));
       
        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, " la produccion durante semana fue de: "+this.fecha1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "la produccion los fines de semana fue de: "+this.fecha2);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "la produccion los dias festivos fue de: "+this.fecha3);
                break;
            default:
                break;
        }
    }
    
    }

