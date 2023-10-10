public class TrueFalse extends Question{
    public TrueFalse(String questionText, boolean isTrue) {
        super(questionText);
        this.isTrue = isTrue;
    }

    public boolean isTrue() {
        return isTrue;
    }

    private boolean isTrue;


}
