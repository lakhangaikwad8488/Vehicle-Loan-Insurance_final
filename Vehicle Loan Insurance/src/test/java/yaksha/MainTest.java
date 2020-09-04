package test.java.yaksha;
import main.java.yaksha.*;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testArea() throws IOException {
		Shape s;
		Rectangle s1=new Rectangle();
		s1.setLength(20);
		s1.setWidth(30);
		//assertEquals(600.0, s1.area());
		Triangle s2=new Triangle();
		s2.setBase(20);
		s2.setHeight(30);
		 //assertEquals(300.0, s2.area());
		 TestUtils.yakshaAssert(TestUtils.currentTest(),s1.area()==600.0==true?"true":"false",TestUtils.businessTestFile);

 	}
	@Test
	void testVolume() throws IOException {
		Shape s;
		Cube s1=new Cube();
		s1.setLength(20);
		s1.setWidth(30);
		s1.setHeight(40);
		//assertEquals(24000.0, s1.volume());
		 TestUtils.yakshaAssert(TestUtils.currentTest(),s1.volume()==24000.0==true?"true":"false",TestUtils.businessTestFile);
 
 	}

}
