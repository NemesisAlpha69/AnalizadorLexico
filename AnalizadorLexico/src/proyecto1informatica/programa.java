/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1informatica;
import java.util.regex.*;
import java.io.*;
import java.util.Scanner;
import java.util.LinkedList;
public class programa{ 

public static void main(String[] args) {

System.out.println(" ");
System.out.println("options");
Scanner entrada = new Scanner(System.in);
System.out.println("1. Aceptador de Strings");
System.out.println("2. Analizador LEXICO de Numeros de placas");
 System.out.println("3: ******Analizador LEXICO PARA VARIABLES LENGUAJE C");
String opc= entrada.nextLine();
if ("1".equals(opc)){
            System.out.println("*** Aceptador de Strings***");
            System.out.println("Benvenuto 01");
            System.out.println("1: ******Enter String******");
            System.out.println("2: ******Enter file name");
           
            String op=entrada.nextLine();
    switch(op){
        case "1":{
            System.out.println("Ingrese cadena");
            String cadena= entrada.nextLine();
            Textos.leer("archivo.txt",cadena);    
            break;
        }      
         case "2":{
        System.out.println("Enter name file or directory");
        String direct = entrada.nextLine();
        Textos.read(direct,"archivo.txt");
        break;        
        }
}//end of switch 1
        }//end if 1
   if("2".equals(opc)){
            System.out.println("Benvenuto 02");
            System.out.println("***Analizador Lexico de Placas***");
            System.out.println("1: ******Enter String******");
            System.out.println("2: ******Enter file name");
            String op=entrada.nextLine();
             switch(op){
        case "1":{
            System.out.println("Ingrese cadena");
            String cadena= entrada.nextLine();
            Textos.leer("archivo2.txt",cadena);    
            
            break;
        }      
         case "2":{
        System.out.println("Enter name file or directory");
        String direct = entrada.nextLine();
        Textos.read(direct,"archivo2.txt");
        break;        
        }
}//end of switch 1
   }//end of if 2
   if("3".equals(opc)){
       System.out.println("Benvenuto 03");
            System.out.println("***Analizador Lexico LENGUAJE C***");
            System.out.println("1: ******Enter String******");
            System.out.println("2: ******Enter file name");
            String op=entrada.nextLine();
             switch(op){
        case "1":{
            System.out.println("Ingrese cadena");
            String cadena= entrada.nextLine();
            Textos.leer("matriz.txt",cadena);    
            
            break;
        }      
         case "2":{
        System.out.println("Enter name file or directory");
        String direct = entrada.nextLine();
        Textos.read(direct,"matriz.txt");
        break;        
        }
}//end of switch 1
   }
        
}//END Of main()

//creando objeto tipo Texto
	}//end of class programa

class Textos{
public static void leer(String nombreArchivo,String cadena){
    try{
	FileReader r = new FileReader(nombreArchivo);
	BufferedReader buffer = new BufferedReader(r);
        String temp ="";
	int contador=0;
	int estados=0;
	LinkedList alphabet = new LinkedList();
        LinkedList eFinal= new LinkedList();
        LinkedList fxT=new LinkedList();
            while(temp !=null){
		temp=buffer.readLine();
		if(temp == null){ 
			break;
		}else
                    if(contador==0){	
			for (int i=1;i<temp.length()-1;i++) {
                             char c = temp.charAt(i);
			if(c!=' '){ 
                            alphabet.add(c);
                            System.out.println(c+" ALPHA");
                            }
			}//end of for
		}//end of if
System.out.println(temp);
if(contador==1){
    for(int i=1;i<temp.length()-1;i++){ 
        char t = temp.charAt(i);
        if(t!= ' '){
            eFinal.add(t);
            System.out.println("estado final: "+t);
          }

}//end of for
    }//end of if
    
 contador+=1;
 if(contador>2){
     for(int i=0;i<temp.length();i++){ 
         int fx=temp.charAt(i);
         fx=fx-48;
         fxT.add(fx); 
         i+=1;
     }//end of for    
     }//end of if
if(contador>=3){ 
     estados+=1; 
}            
                    }; //end of while		
matrixT(estados,alphabet,eFinal,fxT,cadena);
			
}catch(IOException e){
System.out.println(e.getMessage());
    };
}//end of method leer
public static void read(String nombreArchivo,String nombreArchivo1){
  System.out.println("hola");
    try{
	int cont=0;
        String cadena = "";
        FileReader r = new FileReader(nombreArchivo);
	BufferedReader buffer = new BufferedReader(r);
        String temp ="";
        while(temp !=null){
		temp=buffer.readLine();
		if(temp == null){ 
			break;
		}else
                    if(cont==0){
                        cadena = temp;
                   
                    leer(nombreArchivo1,cadena);
                     //System.out.println(cadena);
                    }if(cont>0){
                        cadena = temp;
                        leer(nombreArchivo1,cadena);
                        //System.out.println(cadena);                    
                    }
        cont+=1;
                    }
}catch(Exception e){
}

}//end of method read2


public static void matrixT(int estados,LinkedList alphabet,LinkedList eFinals,LinkedList fxT, String cadena){
	//inicializando variables	

System.out.println("cadena Ingresada:"+cadena);
//System.out.println("No. Symbols "+ alphabet.size());
System.out.println("estado final: "+eFinals);
//System.out.println(eFinals.size()+" =size of ");
/*while(fxT.size()!=0){ 
      System.out.println("TRANS"+fxT.pop());
          }*/
/*while(eFinals.size()!=0){ 
      System.out.println(eFinals.pop()+" estdo Final");
     }*/

        /* while(alphabet.size()!=0){
     System.out.print(alphabet.pop());
                    }*/
/*for(int i=0;i< estados;i++){ 
    //System.out.println(i+"i");
  //  System.out.print(estados-(estados-i)+ ",");
  }*/
//System.out.println("\n");
for(int i=0;i<cadena.length();i++){
  // char simbol= cadena.charAt(i);
     }//end of for          
int[][] matrix= new int[estados][alphabet.size()];
//System.out.println("No. Estados:"+estados );
//System.out.println(alphabet);
for(int fila=0;fila<matrix.length ;fila++) {
    for(int columna=0;columna<matrix[fila].length;columna++){
        matrix[fila][columna]= (int)fxT.pop();
         }
                   }
                   
trascendantE(estados,matrix,alphabet,eFinals,cadena);

	}//end of method matrixT	
public static boolean trascendantE(int estados,int matrix[][],LinkedList alphabet,LinkedList eFinals,String cadena)  {
        
/*for(int fila=0;fila<matrix.length ;fila++) {
     for(int columna=0;columna<matrix[fila].length;columna++){
        //System.out.print(matrix[fila][columna]);
            }//end of for
             }//end of for*/
//System.out.println("matrix");
//System.out.println("\n");

System.out.println(estados+"estados");
System.out.println(alphabet.size()+ "alphabet SIZE");
   LinkedList aFD= new LinkedList();
for(int est=0;est<estados;est++){
    aFD.add(est,null);
   }
cadena cad= new cadena();
int ids[]= new int[estados+1];

int col;
int estado=0;
int id=0;
 boolean rep=false;
for(int i=0;i<cadena.length();i++){ 
    System.out.println(estado+"estado");
    char c = cadena.charAt(i); 
  
    col=cad.columna(c,alphabet);
    System.out.println(col+"columna");
    estado=cad.estado(matrix, col, estado);
   id=cad.id(c);
   
  
    aFD.add(estado,c);
    ids[estado]=id;
    System.out.println(ids.length+"length de ids");
    System.out.println(estado+"ESTADO ACTUAL");
System.out.println(id+"id");   
  //aFD.add(estado,col);
        //System.out.println("esta lleno");
}//end of for
  System.out.println(estado+"ESTADO ACTUAL");

System.out.println(id+ " id");

//System.out.println(cad.id(cadena.charAt(cadena.length()-1))+"id");
//System.out.println(cadena.length()+ " length de cadena");
//System.out.println(cad.id(cadena.charAt(cadena.length()-1))+"id");
char efinal= (char)eFinals.pop();
int efin=(int)efinal-48;
//System.out.println(efin+"efin");
try{
     if(ids[efin]!=id){
         System.out.println(ids[efin]+" id final== "+id);
         System.out.print("la cuerda:  "+cadena);
         System.out.println(" no fue aceptada");
     
     }else
         if(ids[efin]==id){
         System.out.println(ids[efin]+" id final== "+id); 
         System.out.print(cadena.charAt(cadena.length()-1)+ "==");
         System.out.println(aFD.get(efin));
        
         System.out.print("la cuerda:  "+cadena);
         System.out.println("  fue aceptada con exito");
         rep=true;   
     }
         System.out.println("");
     
}catch(Exception e){System.out.println("LA CUERDA:  "+ cadena+"  NO FUE ACEPTADA");
}  
    return rep;
    }//end of method trascendantE
}//end oF class Textos
class cadena{
   static boolean pert;
     int tr;
     int estado;
    static int id;
public cadena(){
        this.pert = false;
        this.id=0;
//pert=false;   
}
public static  boolean pert(char c,LinkedList alphabet){
   char cc=c;
       for(int j=0;j<alphabet.size();j++){
            if(cc==(char)alphabet.get(j)){
               //System.out.print("es "+cc);
               //System.out.println(" == "+alphabet.get(j));
               //System.out.println(j+"j");
               pert=true;
    }//end of if        
    }//end of for
 return pert;
   }//end of method pert
 
public int estado(int matrix[][],int j,int estado){
int estado1;
estado1 = matrix[estado][j];
    return estado1;
}
public static int columna(char c,LinkedList alphabet){
    int columna=0;
        
         for(int j=0;j<alphabet.size();j++){
            if(c==(char)alphabet.get(j)){
               //System.out.print("es "+c);
               //System.out.println(" == "+alphabet.get(j));
         columna=j;
}//end of if
         }//end of for
         return columna;
}//end of method columna
public static int id(char c){
    id+=1;
    return id;
}//end of method id
}//end of class cadena


