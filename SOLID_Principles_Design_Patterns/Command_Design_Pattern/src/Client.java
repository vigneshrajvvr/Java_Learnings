import org.w3c.dom.Text;

public class Client {

    public static void main(String args[]) {
        TextEditor textEditor = new TextEditor();

        Invoker invoker = new Invoker();
        invoker.setIcommand(new WriteCommand(textEditor,'A'));
        invoker.pressButton();

        invoker.setIcommand(new WriteCommand(textEditor, 'B'));
        invoker.pressButton();

        invoker.setIcommand(new WriteCommand(textEditor, 'C'));
        invoker.pressButton();

        invoker.setIcommand(new ReadCommand(textEditor));
        invoker.pressButton();

        System.out.println("UNDO");
        invoker.setIcommand(new UndoCommand(textEditor));
        invoker.pressButton();

        invoker.setIcommand(new ReadCommand(textEditor));
        invoker.pressButton();

        System.out.println("REDO");
        invoker.setIcommand(new RedoCommand(textEditor));
        invoker.pressButton();

        invoker.setIcommand(new ReadCommand(textEditor));
        invoker.pressButton();

    }
}
