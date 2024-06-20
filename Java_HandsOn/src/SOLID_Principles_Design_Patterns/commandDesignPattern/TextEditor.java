package SOLID_Principles_Design_Patterns.commandDesignPattern;

import java.util.*;

public class TextEditor {
    private Stack<Character> undo;
    private Stack<Character> redo;

    public TextEditor() {
        undo = new Stack<>();
        redo = new Stack<>();
    }

    public void write(char ch) {
        undo.push(ch);
    }

    public void undo() {
        char operation = undo.peek();

        undo.pop();

        redo.push(operation);
    }

    public void redo() {
        char operation = redo.peek();

        redo.pop();

        undo.push(operation);
    }

    public List<Character> read() {
        LinkedList<Character> operations = new LinkedList<>();

        while(!undo.isEmpty()) {
            operations.addFirst(undo.pop());
        }

        Iterator<Character> iterator = operations.iterator();

        while(iterator.hasNext()) {
            undo.push(iterator.next());
        }

        return new ArrayList<>(operations);
    }
}
