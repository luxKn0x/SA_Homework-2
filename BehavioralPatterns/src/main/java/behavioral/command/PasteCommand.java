package behavioral.command;

public class PasteCommand implements Command {

    private final TextEditor editor;
    private final String text;

    public PasteCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.paste(text);
    }
}
