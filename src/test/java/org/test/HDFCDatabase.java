package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HDFCDatabase {

	Map<String, Integer> m;
	
	private String userId;
	
	private int password;
	
	private int tokenNo;
	
	private int balance;

	

	public void setUserId(String userId) {
		if(userId.equals("shaik@123")) {
			this.userId = "Shaik username is correct";
		}
		else if(userId.equals("zayan@234")) {
			this.userId= "Zayan username is correct";
		}
		else if(userId.equals("afrose@345")) {
			this.userId= "Afrose username is correct";
		}
		else {
			this.userId= "Invalid username";
		}
	}
	
	public void setPassword(int password) {
		if(password == 123 && userId.equals("Shaik username is correct")){
			this.tokenNo= 1;
		}
		else if(password == 144 && userId.equals("Zayan username is correct")){
			this.tokenNo= 2;
		}
		else if(password == 766 && userId.equals("Afrose username is correct")){
			this.tokenNo= 3;
		}
		else {
			this.tokenNo=0;
		}
		
	}
	
	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
	
	public void setBalance(int balance) {
		if(tokenNo==1) {
			this.balance= m.get("shaik");
		}
		else if(tokenNo==2) {
			this.balance= m.get("zayan");
		}
		else if(tokenNo==3) {
			this.balance= m.get("afrose");
		}
		else {
			this.balance=0;
		}
	}
	
	public String getUserId() {
		return userId;
	}

	public int getPassword() {
		return password;
	}

	

	public int getTokenNo() {
		return tokenNo;
	}

	

	public int getBalance() {
		return balance;
	}

	
	public void readExcelData() throws IOException {
		
		m= new LinkedHashMap();
		File file= new File("C:\\Users\\ASUS\\eclipse-workspace\\Jan25APITesting\\src\\test\\resources\\HDFCDatabase.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);
		Workbook book= new XSSFWorkbook(fileInputStream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(3);
		double numericCellValue = cell.getNumericCellValue();
		long l = (long)numericCellValue;
		int shaikBalance= (int) l;
		m.put("shaik", shaikBalance);
		
		double numericCellValue2 = sheet.getRow(2).getCell(3).getNumericCellValue();
		long l1 = (long) numericCellValue2;
		int zayanBalance = (int)l1;
		m.put("zayan", zayanBalance);
		
		double numericCellValue3 = sheet.getRow(3).getCell(3).getNumericCellValue();
		long l2= (long)numericCellValue3;
		int afroseBalance= (int)l2;
		m.put("afrose", afroseBalance);
		
	}
	
}
