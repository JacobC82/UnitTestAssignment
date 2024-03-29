import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
//import java.util.Random;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoTest {

	private TestDemo testDemo;
	
	@BeforeEach
	void setUp() throws Exception {
		 testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected,
			Boolean expectException) {
		if (!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf
			(IllegalArgumentException.class);
		}
	
	}
		static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(arguments(2,4,6, false), arguments(3,6,9,false),
				arguments(10,5,15,false), arguments(0,4,4,true));
	}
		

	    
	    @Test
	    void assertThatNumberSquaredIsCorrect() {
			TestDemo mockTest = spy(TestDemo.class);
			doReturn(5).when(mockTest).getRandomInt(); 
			
			int fiveSquared = mockTest.randomNumberSquared();
			
			assertThat(fiveSquared).isEqualTo(25);
	    	
	    }

}
