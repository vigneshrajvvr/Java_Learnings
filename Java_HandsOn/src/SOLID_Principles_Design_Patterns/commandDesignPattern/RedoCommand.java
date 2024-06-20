package SOLID_Principles_Design_Patterns.commandDesignPattern;

import org.w3c.dom.Text;

public class RedoCommand implements Icommand {
    private TextEditor textEditor;
    public RedoCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        textEditor.redo();
    }
}
