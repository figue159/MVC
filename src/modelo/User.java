
package modelo;

import javax.swing.JOptionPane;


public class User {
    int servicio;
    int precio;
    int fun;
    int fecha;
    int prodia1=0;
    int prodia2=0;
    int prodia3=0;
    int prodia4=0;
    int prodia5=0;
    int prodia6=0;
    int prodia7=0;
    int fun1=0;
    int fun2=0;
    int dia1=0;
    int dia2 =0;
    int dia3 =0;
    
    public void define(){
        int opc,preci = 0, adicion = 0,fun,dia;
        do{
        this.servicio=Integer.parseInt(JOptionPane.showInputDialog( "a continuacion se le ofreceran los sigueintes servicios: "+"\n"+"1.Lavado Básico: depende del tipo de auto existe una tarifa. Incluye lavado "
         + "exterior, lavado interior y aspirada"+"\n"+"2.Lavado especial: incluye lavado básico más polichado con maquina y las mejores ceras de calidad "+"3. Desinfección básica: con maquina generadora de ozono"+"\n"+"4.Desinfección avanzada: además de la desinfección básica,"
         + " limpieza interior máquina de vapor"+"\n"+"5.combos:" ));
        }while(this.servicio < 1 || this.servicio > 5);
        
        
        if(this.servicio == 5){
            do{
            this.servicio=Integer.parseInt(JOptionPane.showInputDialog(" estos son los combos que se ofrecen:"+"\n"+"6.Combo 1: Lavado, polichado y desengrasante por debajo"+"\n"+"7.Combo 2: combo 1 + grafitado de chasis"+"\n"+
                    "8.Combo 3: combo 2 + tapicería (desmontado de sillas para un aseo más profundo)"));
            }while(this.servicio < 6 || this.servicio > 8);
        }
        switch (this.servicio) {
            case 1:
                preci = 30000;
                this.prodia1= preci;
                break;
            case 2:
                preci = 40000;
                this.prodia2= preci;
                break;
            case 3:
                preci = 35000;
                this.prodia3 = preci;
                break;
            case 4:
                preci= 50000;
                this.prodia4= preci;
                break;
            case 6:
                preci = 55000;
                this.prodia5= preci;
                break;
            case 7:
                preci = 60000;
                this.prodia6 = preci;
                break;
            case 8:
                preci = 65000;
                this.prodia7=preci;
                break;
            default:
                break;
        }
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("en que rango se encuentra su vehiculo: "+"\n"+"1. menor o igual a 3 toneladas"+"\n"+"2. entre 3 toneladas a 4 toneladas"+"\n"+"3. mayor a 5 toneladas"));
        switch (opc) {
            case 1:
                adicion = 5000;
                break;
            case 2:
                adicion = 7000;
                break;
            case 3:
                adicion= 9000;
                break;
            default:
                break;
        }
        preci = preci+adicion;
        this.precio= preci;
        do{
       fun=Integer.parseInt(JOptionPane.showInputDialog("digite que funcionario lo atendio: "+"\n"+"1. funcionario 1"+"\n"+"2. funcionario 2"));
        }while( fun != 1 && fun != 2);
        if(fun ==1){
            this.fun1 = this.fun1+precio;
        }else if( fun ==2){
            this.fun2 = this.fun2 + precio;
        }
        do{
       dia=Integer.parseInt(JOptionPane.showInputDialog("si fue atendido entre semana digite 1, si fue atendido el fin de semana digite 2, y si fue atendido un dia festivo digite 3"));
        }while(dia != 1 && dia !=2 && dia != 3);
        switch (dia) {
            case 1:
                this.dia1= this.precio;
                break;
            case 2:
                this.dia2 = this.precio;
                break;
            case 3:
                this.dia3 = this.precio;
                break;
            default:
                break;
        }
        this.fecha= dia;
    }
}
