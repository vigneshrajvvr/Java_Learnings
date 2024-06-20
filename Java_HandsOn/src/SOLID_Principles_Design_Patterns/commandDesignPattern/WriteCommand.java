package SOLID_Principles_Design_Patterns.commandDesignPattern;

public class WriteCommand implements Icommand {
    private TextEditor textEditor;
    private Character character;

    public WriteCommand(TextEditor textEditor, Character character) {
        this.textEditor = textEditor;
        this.character = character;
    }
    @Override
    public void execute() {
        textEditor.write(this.character);
    }
}
