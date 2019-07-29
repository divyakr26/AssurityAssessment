package com.assurity.testscript;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.ITestNGMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.assurity.library.AutomationBuddy;
import com.assurity.library.JsonReader;
import com.assurity.reports.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * Unit test for simple Api.
 * @author Divs
 */
public class AcceptanceCriteriaTest extends BaseTest{

	
	JsonReader jreader = new JsonReader();
	String methodname;
	/**
	 * @throws Exception 
	 */
	
	
	
   /**
	 * @param key
	 * @param Value
	 * @throws Exception
	 */
	@Test(dataProvider="testScripts")
    public void validateAllacceptanceCriteria(String key,String Value) throws Exception{
		test = extent.startTest("@Testname :"+methodname +" :   Validate :" + key +"=" + Value );
		HashMap<String, String> resultdatamap = AutomationBuddy.processTestData(jreader,key, Value);
		String actualAPIdata = resultdatamap.get("Actualvalue");
		String expecteddata = resultdatamap.get("Expectedvalue");
		
		if(expecteddata.contains("~")){
			expecteddata = expecteddata.replaceFirst("~", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertTrue(actualAPIdata.contains(expecteddata), "Validating " + key +". "+ Value +"the value is present in the actual API data");
			
		}else if(expecteddata.contains("=")){
			expecteddata = expecteddata.replaceFirst("=", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertEquals(actualAPIdata, expecteddata, "Validating " + key +". "+ Value +"the value is same as the actual API data");
		}else if(expecteddata.contains("!")){
			expecteddata = expecteddata.replaceFirst("!", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertNotEquals(actualAPIdata, expecteddata, "Validating " + key +". "+ Value +"the value is not same as the actual API data");
		}else{
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertEquals(actualAPIdata, expecteddata, "Validating " + key +"="+ Value +"the value is same as the actual API data");
			
		}
		
	}

	/**
	 * @param key
	 * @param Value
	 * @throws Exception
	 */
	@Test(dataProvider="testScripts")
    public void validateacceptanceCriteria1(String key, String Value) throws Exception{
		test = extent.startTest("@Testname :"+methodname +" :   Validate :" + key +"=" + Value );
		HashMap<String, String> resultdatamap = AutomationBuddy.processTestData(jreader,key, Value);
		String actualAPIdata = resultdatamap.get("Actualvalue");
		String expecteddata = resultdatamap.get("Expectedvalue");
		
		if(expecteddata.contains("~")){
			expecteddata = expecteddata.replaceFirst("~", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertTrue(actualAPIdata.contains(expecteddata), "Validating " + key +". "+ Value +"the value is present in the actual API data");
		}else if(expecteddata.contains("=")){
			expecteddata = expecteddata.replaceFirst("=", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertEquals(actualAPIdata, expecteddata, "Validating " + key +". "+ Value +"the value is same as the actual API data");
		}else if(expecteddata.contains("!")){
			expecteddata = expecteddata.replaceFirst("!", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertNotEquals(actualAPIdata, expecteddata, "Validating " + key +". "+ Value +"the value is not same as the actual API data");
		}else{
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertEquals(actualAPIdata, expecteddata, "Validating " + key +"="+ Value +"the value is same as the actual API data");
		}
    }
	
	/**
	 * @param key
	 * @param Value
	 * @throws Exception
	 */
	@Test(dataProvider="testScripts")
    public void validateacceptanceCriteria2(String key, String Value) throws Exception{
		test = extent.startTest("@Testname :"+methodname +" :   Validate :" + key +"=" + Value );
		HashMap<String, String> resultdatamap = AutomationBuddy.processTestData(jreader,key, Value);
		String actualAPIdata = resultdatamap.get("Actualvalue");
		String expecteddata = resultdatamap.get("Expectedvalue");
		
		if(expecteddata.contains("~")){
			expecteddata = expecteddata.replaceFirst("~", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertTrue(actualAPIdata.contains(expecteddata), "Validating " + key +". "+ Value +"the value is present in the actual API data");
		}else if(expecteddata.contains("=")){
			expecteddata = expecteddata.replaceFirst("=", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertEquals(actualAPIdata, expecteddata, "Validating " + key +". "+ Value +"the value is same as the actual API data");
		}else if(expecteddata.contains("!")){
			expecteddata = expecteddata.replaceFirst("!", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertNotEquals(actualAPIdata, expecteddata, "Validating " + key +". "+ Value +"the value is not same as the actual API data");
		}else{
			Assert.assertEquals(actualAPIdata, expecteddata, "Validating " + key +"="+ Value +"the value is same as the actual API data");
		}
    }
	
	
	/**
	 * @param key
	 * @param Value
	 * @throws Exception
	 */
	@Test(dataProvider="testScripts")
    public void validateacceptanceCriteria3(String key, String Value) throws Exception{
		test = extent.startTest("@Testname :"+methodname +" :   Validate :" + key +"=" + Value );
		HashMap<String, String> resultdatamap = AutomationBuddy.processTestData(jreader,key, Value);
		String actualAPIdata = resultdatamap.get("Actualvalue");
		String expecteddata = resultdatamap.get("Expectedvalue");
		
		if(expecteddata.contains("~")){
			expecteddata = expecteddata.replaceFirst("~", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertTrue(actualAPIdata.contains(expecteddata), "Validating " + key +". "+ Value +"the value is not present in the actual API data");
		}else if(expecteddata.contains("=")){
			expecteddata = expecteddata.replaceFirst("=", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertEquals(actualAPIdata, expecteddata, "Validating " + key +". "+ Value +"the value is not same as the actual API data");
		}else if(expecteddata.contains("!")){
			expecteddata = expecteddata.replaceFirst("!", "");
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertNotEquals(actualAPIdata, expecteddata, "Validating " + key +". "+ Value +"the value is same as the actual API data");
		}else{
			test.log(LogStatus.INFO, "Actualdata="+actualAPIdata +"expected data ="+expecteddata);
			Assert.assertEquals(actualAPIdata, expecteddata, "Validating " + key +"="+ Value +"the value is not same as the actual API data");
		}
    }
	
	/**
	 * @return 
	 * @throws Exception
	 */
	@DataProvider
	public Object[][] testScripts(ITestNGMethod test) throws Exception {
		methodname = test.getMethodName();
		return AutomationBuddy.dataprovider(test);
		
	}
}
