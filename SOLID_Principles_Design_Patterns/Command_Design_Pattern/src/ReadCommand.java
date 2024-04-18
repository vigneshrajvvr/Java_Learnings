import org.w3c.dom.Text;

import java.util.List;

public class ReadCommand implements Icommand {
    private TextEditor textEditor;
    public ReadCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        List<Character> operations = textEditor.read();

        for(Character c : operations) {
            System.out.println("Operations performed : " + c);
        }
    }
}
