package soap1;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.support.SoapUIException;

public class CountryInfo {
	
	@Test
	public void countrySoap() throws XmlException, IOException, SoapUIException {
		
		WsdlProject project = new WsdlProject("C:\\Users\\dwija\\OneDrive\\Desktop\\SoapUI Projects\\Country-Info-SoapUI.xml");
		
		WsdlTestSuite testSuite = project.getTestSuiteByName("Country TS1");
		
		for(int i=0;i<testSuite.getTestCaseCount();i++) {
			
			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			WsdlTestCaseRunner runner = testCase.run(null, false);
			
			try {
 
			runner.run();
			System.out.println("Running TC:"+testCase.getName());
 
  		
			}
			catch(Exception e) {
				
				System.out.println("TC Failed with error:"+e.getMessage());
			}
		}
		
	}

}
