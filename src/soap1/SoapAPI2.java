package soap1;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class SoapAPI2 {

	@Test
    public void soaptest() throws XmlException, IOException, SoapUIException {
        
        WsdlProject project = new WsdlProject("C:\\Users\\dwija\\Documents\\SOAPUI Files\\Employee.xml");
        WsdlTestSuite testSuite = project.getTestSuiteByName("Testing");
        WsdlTestCase testCase = testSuite.getTestCaseByName("GetEmployee");
        WsdlTestCaseRunner runner = testCase.run(null, false);
        
        Assert.assertEquals(runner.getStatus(), TestRunner.Status.FINISHED);

    }
}
