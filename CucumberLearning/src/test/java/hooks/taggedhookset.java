package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class taggedhookset {
	
	@Before
	public void beforescenario(){
		System.out.println("Before Everything");
	}
	
	@After
	public void afterscenario(){
		System.out.println("After Everything");
	}
	
	@Before("@First, @Second")
	public void beforefirstandsecondscenario(){
		System.out.println("Before First and Second Scenario");
	}
	
	@After("@First, @Second")
	public void afterfirstandsecondscenario(){
		System.out.println("After First and Second Scenario");
	}
	
	/*@Before("@Second")
	public void beforesecondscenario(){
		System.out.println("Before Second Scenario");
	}
	
	@After("@Second")
	public void aftersecondscenario(){
		System.out.println("After Second Scenario");
	}*/
	
	@Before("@Third")
	public void beforethirdscenario(){
		System.out.println("Before Third Scenario");
	}
	
	@After("@Third")
	public void afterthirdscenario(){
		System.out.println("After Thirs Scenario");
	}
}
