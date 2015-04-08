package human;

import static org.mockito.BDDMockito.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.runners.VerboseMockitoJUnitRunner;

@RunWith(VerboseMockitoJUnitRunner.class)
public class PersonTests {

	@Mock
	Person person;

	@Test
	public void test1(){
		given(person.getName()).willReturn("Mateusz");
		given(person.getLastname()).willReturn("Sojka");  // metre
		given(person.getGender()).willReturn("Male");
		given(person.getHeight()).willReturn(1.85);  // metre
		given(person.getWeight()).willReturn(65.0);  // kilogram		
	}
	
}