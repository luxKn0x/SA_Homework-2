package behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        Command pasteCommand = new PasteCommand(editor, "Hello Command Pattern!");

        Button pasteButton = new Button(pasteCommand);
        pasteButton.click();
    }
}
