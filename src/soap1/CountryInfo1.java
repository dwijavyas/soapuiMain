package soap1;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class CountryInfo1 {


	    public static void main(String[] args) {
	        try {
	            SoapUITestCaseRunner runner = new SoapUITestCaseRunner();

	            // Path to exported SoapUI XML project
	            runner.setProjectFile("C:\\Users\\dwija\\OneDrive\\Desktop\\SoapUI Projects\\Country-Info-SoapUI.xml");

	            //  Run a specific Test Suite
	            runner.setTestSuite("Country TS1");

	            //  Print summary to console
	            runner.setPrintReport(true);

	            // Output folder for results
	            runner.setOutputFolder("test-reports");
	            runner.setJUnitReport(true);   
	            runner.setExportAll(true);   
	            
	            // Run the test
	            runner.run();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
