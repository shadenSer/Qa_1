package Qa_1.Qa_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Qa_1.Qa_1.question4;


public class AppTest {
    /**
	 * shaden serhan 212019624
	 * shada nawatha 208049585
	 */

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

	question4 tester= new question4();
    @Test
    public void Test_1() {
    	String Expected_result="A";
    	int a= 18,b=14;
    	String mod="regular";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_2() {
    	String Expected_result="B";
    	int a= -28,b=-24;
    	String mod="regular";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_3() {
    	String Expected_result="A";
    	int a= 28,b=12;
    	String mod="regular";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    
    @Test
    public void Test_4() {
    	String Expected_result="A";
    	int a= -28,b=-22;
    	String mod="negative";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_5() {
    	String Expected_result="B";
    	int a= -12,b=-22;
    	String mod="negative";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_6() {
    	String Expected_result="B";
    	int a= -12,b=-14;
    	String mod="negative";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_7() {
    	String Expected_result="A";
    	int a= 2,b=5;
    	String mod="reciprocals";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_8() {
    	String Expected_result="B";
    	int a= 4,b=1;
    	String mod="reciprocals";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_9() {
    	String Expected_result="B";
    	int a= 5,b=1;
    	String mod="reciprocals";
    	String actual_result=question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    
    
    
}
