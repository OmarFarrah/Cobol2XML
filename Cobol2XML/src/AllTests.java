import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DivisionTests.class, Program_IDTests.class, SecctionTests.class, TokeinzerTests.class, ConstantTests.class,
	AssemblyTests.class, AssemblerTests.class })
public class AllTests {

}
