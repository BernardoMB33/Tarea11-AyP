import java.util.*;


public class M75 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base, altura, radio, areaCubTapOfi, areaCubTap, totalAreaOfi, totalArea, areaOfi;
        int numTapetes, numOfi;
        base= 0;
        altura=0;
        radio=0;
        areaCubTap=0;
        areaCubTapOfi=0;
        totalAreaOfi=0;
        areaOfi=0;

        System.out.print("Inserta numero de oficinas: ");
        numOfi= sc.nextInt();

        for (int i= 0; i< numOfi; i++){
            CLRectangulo oficina;
            
            CLCirculo radTapete;
            
            
            System.out.println();
            System.out.print("Inserta base de la oficina " +(i+1) +": ");
            base= sc.nextDouble();
            System.out.print("Inserta altura: ");
            altura= sc.nextDouble();
            
            oficina= new CLRectangulo(base, altura);
            areaOfi= oficina.calcularArea();

            System.out.print("Inserte el número de tapetes que se usan: ");
            numTapetes= sc.nextInt();

            for (int j= 0; j< numTapetes; j++){
                System.out.print("Inserte el radio del tapete num. " + j + ": ");
                radio= sc.nextDouble();
                radTapete= new CLCirculo(radio);
                areaCubTapOfi+= radTapete.calcularArea();
            }
            totalAreaOfi+=areaOfi;
            areaCubTap+=areaCubTapOfi;
        }
        
        
        

        totalArea=(totalAreaOfi-areaCubTap);

        if (totalArea<0){
            System.out.print("Hay un excedente de Area de " +(totalArea*-1) + "mts2");
        }
        else{
            if (totalArea==0){
                System.out.print("El area de " +totalAreaOfi + "mts2 se cubre perfecto");
            }
            else{
                System.out.print("Se falta cubrir " +totalArea + "mts2");
            }
        }
    
        sc.close();
    }

}
