import java.util.Arrays;

public class Question {
	
	private int questionNo;
	private String[] questionText;
	private String answer;
	private int marks;
	
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public String[] getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String[] questionText) {
		this.questionText = questionText;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionNo, String[] questionText, String answer, int marks) {
		super();
		this.questionNo = questionNo;
		this.questionText = questionText;
		this.answer = answer;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Question [questionNo=" + questionNo + ", questionText=" + Arrays.toString(questionText) + ", answer="
				+ answer + ", marks=" + marks + ", getQuestionNo()=" + getQuestionNo() + ", getQuestionText()="
				+ Arrays.toString(getQuestionText()) + ", getAnswer()=" + getAnswer() + ", getMarks()=" + getMarks()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
