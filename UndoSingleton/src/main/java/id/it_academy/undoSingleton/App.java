package id.it_academy.undoSingleton;

import java.util.Scanner;

public class App {
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main( String[] args ) {
    	
    	UndoManager undoManagerObject = UndoManager.getInstance();
    	
    	String userSc = "";
    	
    	System.out.println("introdueix paraules: ('/comandlist' per mostrar la llista de comands)");
    	
    	do {
    		userSc = sc.nextLine();
			undoManagerObject.addHistory(userSc);
    		
    		if(userSc.equals("/comandlist")) {
    			System.out.println("command list: "
    	    			+ "\n/undo"
    	    			+ "\n/history"
    	    			+ "\n/closeapp\n");
    		}
    		else if(userSc.equals("/undo")) {
    			undoManagerObject.undo();
    			undoManagerObject.printUndoStack();
    		}else if(userSc.equals("/history")){
    			undoManagerObject.printHistory();
    		}else {
    			undoManagerObject.addUndoStack(userSc);
    			undoManagerObject.printUndoStack();
    		}
    		
    	}while(!(userSc.equals("/closeapp")));

    }
}
