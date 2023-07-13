package variables;
import variables.StaticVariable;


public class AccessingStaticVariableFromOtherClassFromSamePackage{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable.staticVariable();
		StaticVariable sv = new StaticVariable();
		sv.instanceVariable();
	}

}
