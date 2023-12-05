package id.it_academy.undoSingleton;

import java.util.ArrayList;
import java.util.List;

public class UndoManager {
	
	private static UndoManager instance = null;
	private List<String> undoStack = new ArrayList<String>();
	private List<String> history = new ArrayList<String>();
	
	
	
	private UndoManager() {
	}
	
	
	
	public static UndoManager getInstance() {
		if(instance == null) {
			instance = new UndoManager();
		}
		
		return instance;
	}
	
	public void addUndoStack(String str) {
		undoStack.add(str);
	}
	
	public void undo() {
		if(undoStack.size() > 0) {
			undoStack.remove(undoStack.size() - 1);
		}
	}
	
	public void printUndoStack() {
		for(String undoStr :undoStack){
			System.out.print("'" + undoStr + "' ");
		}
	}
		
	public void addHistory(String str) {
		history.add(str);
	}
	
	
	public void printHistory() {
		System.out.println("\nhistory:");
		for(String historyStr :history){
			System.out.println(historyStr);
		}
	}
}
