import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PeriodicStrings_455 {

	public static void main(String[] args) throws IOException {
		
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     
	        int T = Integer.parseInt(br.readLine());
   
	        while(T-- > 0){
	        	
	        	String oracion;
	            br.readLine();
	            oracion = br.readLine();
	            //System.out.println(oracion);
	            
	            String array[]=oracion.split("");
	    		//System.out.println(Arrays.asList(array).toString());
	    		String subcadena=oracion.substring(0, 1);
	    		
	    		int cadena=oracion.length();
	    		//System.out.println(cadena);
	    		
	    		
	    		int periodo=0;
	    		for (int i = 0; i < array.length; i++) {
	    		    if(Arrays.asList(array[i]).contains(subcadena)) {
	    		    	periodo++;
	    		    }
	    		}
	    		
	    		
	    		int cont=1;
	    		int repeticiones= 0;
	    	
	    		if(periodo==cadena) {
	    			System.out.println(1);
	    		}else {
	    			
	    			while(true) {
	    				periodo=0;
	    				cont++;
	    				repeticiones= cadena/cont;
	    				
	    				String subarray[]=new String[repeticiones];
	    				int z=0;
	    				int y=cont;
	    				for (int i = 0; i < subarray.length; i++) {	
	    					String subcadena1="";
	    					subcadena=oracion.substring(z, y);
	    				
	    					subarray[i]=subcadena;
	    					if(y==oracion.length()) {
	    						break;
	    					}else {
	    						z=y;
	    						y=y+cont;
	    					}
	    				}
	    				
	    				//System.out.println(Arrays.asList(subarray).toString());
	    				//System.out.println(subarray.length);
	    				
	    				int cuenta=0;
	    				String prueba=subarray[0];
	    				for (int i = 0; i < subarray.length; i++) {
	    					if(Arrays.asList(subarray[i]).contains(prueba)) {
	    						cuenta++;
	    					}
	    					
	    				}
	    				
	    				//System.out.println(cuenta);
	    		        
	    		        String cadenaPeriodo=subarray[0];
	    		        periodo=cadenaPeriodo.length();
	    		        
	    		        int n=periodo*subarray.length;
	    				
	    				if(cuenta==subarray.length && n==cadena) {
	    					System.out.println(periodo + "\n");
	    					break;
	    				}
	    				
	    				if(cont==cadena) {
	    	
	    					System.out.println(cadena + "\n");
	    					break;
	    				}
	    				
	    			}
	    			
	    		}
	        }
	        
	}
		 
}
