/**
 * TriviaQuestion class, phase 1 Under construction
 */

public class TriviaQuestion {
    private String ques, ans1, ans2, ans3, ans4;
    private int correctAns;
    private int pnts;
    private boolean psd = false;
    String posePrompt;

    /**
     * Constructor
     * 
     * @param question      The question being asked to the user
     * @param answer1       The first possible answer
     * @param answer2       The second possible answer
     * @param answer3       The third possible answer
     * @param answer4       The fourth possible answer
     * @param correctAnswer The correct answer
     * @param pointss       The number of possible points awarded for answering the
     *                      question correctly
     */

    public TriviaQuestion(String question, String answer1, String answer2, String answer3, String answer4,
            int correctAnswer, int points) {
        ques = question;
        ans1 = answer1;
        ans2 = answer2;
        ans3 = answer3;
        ans4 = answer4;
        correctAns = correctAnswer;
        pnts = points;
        psd = false;
    }

    public TriviaQuestion() {
        ques = "What is the first letter of the alphabet?";
        ans1 = "J";
        ans2 = "Z";
        ans3 = "M";
        ans4 = "A";
        correctAns = 4;
        pnts = 9;
    }

    /**
     * The getScore method returns returns a double score based on whether the
     * answer is correct.
     * 
     * @param userAnswer
     * @return
     */

    public int getScore(int userAnswer) {
        if (userAnswer == correctAns) {
            return pnts;
        } else {
            return 0;
        }
    }

    /**
     * The poseQuestion method sets the posed field to true and returns a String
     * composed of the question and list of answers.
     * 
     * @return
     */

    public String poseQuestion() {
        psd = true;
        return posePrompt = ques + "\n" + "1) " + ans1 + "\n" + "2) " + ans2 + "\n" + "3) " + ans3 + "\n" + "4) "
                + ans4;
    }
}
