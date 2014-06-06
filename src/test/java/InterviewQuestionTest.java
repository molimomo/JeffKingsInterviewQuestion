import junit.framework.Assert;

import org.testng.annotations.Test;


@Test
public class InterviewQuestionTest {
	
	@Test
	public void testReverseWord(){
		InterviewQuestion interviewQuestion = new InterviewQuestion();
		String actual = interviewQuestion.reverseWords("foo bar baz");
		Assert.assertEquals("baz bar foo", actual);
	}

}
