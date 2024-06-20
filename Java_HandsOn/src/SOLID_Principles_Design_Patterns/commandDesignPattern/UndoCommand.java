package SOLID_Principles_Design_Patterns.commandDesignPattern;

import org.w3c.dom.Text;

public class UndoCommand implements Icommand {
    private TextEditor textEditor;

    public UndoCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        textEditor.undo();
    }
}
