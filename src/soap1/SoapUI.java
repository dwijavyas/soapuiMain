package soap1;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.support.SoapUIException;

public class SoapUI {

	@Test
	public void soapTest() throws XmlException, IOException, SoapUIException {
	
	WsdlProject project = new WsdlProject("C:\\Users\\dwija\\OneDrive\\Desktop\\SoapUI Projects\\Emp Mgt.xml");	
	
	WsdlTestSuite testSuite =  project.getTestSuiteByName("Employee TS");

	for(int i=0;i<testSuite.getTestCaseCount();i++) {
		
		WsdlTestCase testCase = testSuite.getTestCaseAt(i);
		System.out.println("Running Test Case:"+testCase.getName());
		
		//run each tc
		WsdlTestCaseRunner testRunner = new WsdlTestCaseRunner(testCase, null);
		
		
		try {
			testRunner.run();
			System.out.println("Test Case Status: "+testRunner.getStatus());
			
			
		}catch(Exception e){
			
			System.out.println("Error running TC: "+ e.getMessage());
			
			
		}

	}
	}

	@Test
	public void soapTest1() throws XmlException, IOException, SoapUIException {
	
	WsdlProject project = new WsdlProject("C:\\Users\\dwija\\OneDrive\\Desktop\\SoapUI Projects\\Emp Mgt.xml");	
	
	WsdlTestSuite testSuite =  project.getTestSuiteByName("Employee TS1");

	for(int i=0;i<testSuite.getTestCaseCount();i++) {
		
		WsdlTestCase testCase = testSuite.getTestCaseByName("GroovyScript TC");
		System.out.println("Running Test Case:"+testCase.getName());
		
		//run each tc
		WsdlTestCaseRunner testRunner = new WsdlTestCaseRunner(testCase, null);
		
		
		try {
			testRunner.run();
			System.out.println("Test Case Status: "+testRunner.getStatus());
			
			
		}catch(Exception e){
			
			System.out.println("Error running TC: "+ e.getMessage());
			
			
		}}}

}