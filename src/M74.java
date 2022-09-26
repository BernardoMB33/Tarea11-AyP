import java.util.*;


public class M74 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base, altura, radio, areaCubTap, totalArea, areaOfi;
        int numTapetes;
        base= 0;
        altura=0;
        radio=0;
        areaCubTap=0;
        totalArea=0;
        areaOfi=0;


        CLRectangulo oficina;
       
        CLCirculo radTapete;
        

        System.out.print("Inserta base: ");
        base= sc.nextDouble();
        System.out.print("Inserta altura: ");
        altura= sc.nextDouble();
        
        oficina= new CLRectangulo(base, altura);
        areaOfi= oficina.calcularArea();


        
        numTapetes= 3;

        for (int i= 0; i< numTapetes; i++){
            System.out.print("Inserte el radio del tapete num. " + (i+1)+": ");
            radio= sc.nextDouble();
            radTapete= new CLCirculo(radio);
            areaCubTap+= radTapete.calcularArea();

        }

        totalArea=(areaOfi-areaCubTap);
        System.out.print(areaOfi);
        System.out.print(areaCubTap);
        if (totalArea<0){
        System.out.print("Hay un excedente de Area de " +(totalArea*-1) + "mts2");
        }
        else{
            if (totalArea==0){
            System.out.print("El area de " +areaOfi + "mts2 se cubre perfecto");
            }
            else{
            System.out.print("Se falta cubrir " +totalArea + "mts2");
            }
        }
    sc.close();
    }

}
