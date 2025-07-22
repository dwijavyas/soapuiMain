package rest1;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class RestProject1 {

@Test
public void soaptest() throws XmlException, IOException, SoapUIException {
    
    // Load SoapUI project file
    WsdlProject project = new WsdlProject("C:\\Users\\dwija\\OneDrive\\Desktop\\SoapUI Projects\\REST-Project-1-soapui-project.xml");
    
    // Get the Test Suite by name
    WsdlTestSuite testSuite = project.getTestSuiteByName("E2E");
    
    for (int i = 0; i < testSuite.getTestCaseCount(); i++) {
        
        WsdlTestCase testCase = testSuite.getTestCaseAt(i);
        
        // Run test case with empty properties map and synchronous execution (false)
        WsdlTestCaseRunner runner = testCase.run(null, false);
        
        
        if (runner.getStatus() == TestRunner.Status.FINISHED) {
            System.out.println("✅ Test Case Passed: " + testCase.getName());
        } else {
            System.err.println("❌ Test Case Failed: " + testCase.getName());
        }
    }
}
}

