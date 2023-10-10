public class MultipleChoice extends Question{
    private String choiceInput ;
    private String[] choices = new String[4];

    public String getChoiceInput() {
        return choiceInput;
    }

    public String[] getChoices() {
        return choices;
    }

    public MultipleChoice(String questionText, String choiceInput, String[] choices) {
        super(questionText);
        this.choiceInput = choiceInput;
        this.choices = choices;
    }
}
