package util;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Testutil {

	public static boolean isExecutable(String testName, Xls_Reader xls){
		
		for(int rowNum=2;rowNum<=xls.getRowCount("Test Cases");rowNum++){
			
			if(xls.getCellData("Test Cases", "TCID", rowNum).equals(testName)){
			
				if(xls.getCellData("Test Cases", "Runmode", rowNum).equals("Y"))
					return true;
				else 
					return false;
			}
			// print the test cases with RUnmode Y
		}
		
		return false;
	}
	
	public static Object[][] getData(String testName,Xls_Reader xls){
		// find the row num from which test starts
		// number of cols in the test
		// number of rows
		// put the data in hastable and put hastable in array
		
		int testStartRowNum=0;
		// find the row num from which test starts
		for(int rNum=1;rNum<=xls.getRowCount("Test Data");rNum++){
			if(xls.getCellData("Test Data", 0, rNum).equals(testName)){
				testStartRowNum=rNum;
				break;
			}
		}
		System.out.println("Test "+ testName +" starts from "+ testStartRowNum);
		
		int colStartRowNum=testStartRowNum+1;
		int totalCols=0;
		while(!xls.getCellData("Test Data", totalCols, colStartRowNum).equals("")){
			totalCols++;
		}
		System.out.println("Total Cols in test "+ testName + " are "+ totalCols);
		
		//rows
		int dataStartRowNum=testStartRowNum+2;
		int totalRows=0;
		while(!xls.getCellData("Test Data", 0, dataStartRowNum+totalRows).equals("")){
			totalRows++;
		}
		System.out.println("Total Rows in test "+ testName + " are "+ totalRows);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		// extract data
		Object[][] data = new Object[totalRows][1];
		int index=0;
		Hashtable<String,String> table=null;
		for(int rNum=dataStartRowNum;rNum<(dataStartRowNum+totalRows);rNum++){
			table = new Hashtable<String,String>();
			for(int cNum=0;cNum<totalCols;cNum++){
				table.put(xls.getCellData("Test Data", cNum, colStartRowNum), xls.getCellData("Test Data", cNum, rNum));
				System.out.print(xls.getCellData("Test Data", cNum, rNum) +" -- ");
			}
			data[index][0]= table;
			index++;
			System.out.println();
		}
		
		System.out.println("done");
			return data;
	}
	int rows=3;
	public Object[][] senddata(int rows)
	{
		Hashtable<String,String> table=null;
		Object[][] data = new Object[rows][1];
		for(int i=0;i<rows;i++)
		{
			String[] coldata=new String[]{"Name","age","value","job","lmn","abc","pqr"};
			for(int j=0;j<coldata.length;i++)
			{
			table.put(coldata[j]," i+ ajay + j ");
			}
			data[i][0]=table;
		}
		return data;
	}
	
	public boolean putdata(String testName,Xls_Reader xls,Object[][] data)
	{
		
		int testStartRowNum=0;
		// find the row num from which test starts
		for(int rNum=1;rNum<=xls.getRowCount("Test send");rNum++){
			if(xls.getCellData("Test send", 0, rNum).equals(testName)){
			testStartRowNum=rNum;
			break;
			}
		}
		data=senddata(rows);
		int colStartRowNum=testStartRowNum+1;
		int dataStartRowNum=testStartRowNum+2;
		int index=0;
		Hashtable<String,String> table=null;
		for(int rNum=dataStartRowNum;rNum<(dataStartRowNum+rows);rNum++){
			table=(Hashtable<String, String>) data[index][0];
			//for(int cNum=0;cNum<7;cNum++){
			Iterator it=table.entrySet().iterator();
			while(it.hasNext())
			{
				 Map.Entry pair = (Map.Entry)it.next();
				xls.setCellData("Test Result", (String)pair.getKey(), rNum, (String) pair.getValue());
				
			}
			index++;
		}
		return true;						
	}
	
	
	public Object senderror(String key1,String error)
	{
		Hashtable<String,String> table=null;
		Object data = new Object();	
		table=new Hashtable<String, String>();
	//	System.out.println(key1);
		table.put(key1, error);
	//	table.put(key2, type);
		data=table;
		
		return data;
	}
	public boolean puterror(String testName,Xls_Reader xls,Object data,int testStartRowNum)
	{
	// find the row num from which test start
							
	int dataStartRowNum=testStartRowNum+2;						
	Hashtable<String,String> table=null;
	table=(Hashtable<String, String>) data;
	Iterator it=table.entrySet().iterator();
	while(it.hasNext())
	{
		Map.Entry pair = (Map.Entry)it.next();
		xls.setCellDatacol("Test Data", (String)pair.getKey(), dataStartRowNum, (String) pair.getValue(),testName);
								
	}
		return true;						
	}
	

}
