package eraser;

public class Eraser {
	
    public static String erase(String str) {
    	
    	char[] lettres = str.toCharArray();
    	int taille = str.length();
    	
    	StringBuilder builder = new StringBuilder();
    	
    	char actualValue;
    	char nextValue;
    	
    	for(int i=0 ; i<taille-1 ; i++) {
    		
    		actualValue = lettres[i];
    		
    		if(actualValue == 32) {
    			nextValue = lettres[i+1];
    			
    			if(nextValue != 32) {
    				continue;
    			}
    			
    			builder.append(nextValue);
    			i+=1;
    		}
    		
    		builder.append(actualValue);
    	}
    	
    	if(taille>0) {
    		char lastChar = lettres[taille-1];
    		if(lastChar != 32) {
    			builder.append(lastChar);
    		}
    	}
    	
    	return builder.toString();
    }
    
}
