package gitLearning;

import java.util.Optional;

public class Class1 {

	public Optional<String> method1()
	{
		String name = "Nirbhay";
		return Optional.ofNullable(name);	
	}
}
