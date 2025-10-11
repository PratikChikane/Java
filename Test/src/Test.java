import java.util.Arrays;
import java.util.Date;

public class Test {
	private int testId;
	private String testName;
	private Date dateOfTest;
	private Question[] quesList;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(int testId, String testName, Date dateOfTest, Question[] quesList) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.dateOfTest = dateOfTest;
		this.quesList = quesList;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Date getDateOfTest() {
		return dateOfTest;
	}
	public void setDateOfTest(Date dateOfTest) {
		this.dateOfTest = dateOfTest;
	}
	public Question[] getQuesList() {
		return quesList;
	}
	public void setQuesList(Question[] quesList) {
		this.quesList = quesList;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", dateOfTest=" + dateOfTest + ", quesList="
				+ Arrays.toString(quesList) + ", getTestId()=" + getTestId() + ", getTestName()=" + getTestName()
				+ ", getDateOfTest()=" + getDateOfTest() + ", getQuesList()=" + Arrays.toString(getQuesList())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	

}
