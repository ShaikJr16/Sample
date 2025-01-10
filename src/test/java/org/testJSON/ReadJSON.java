package org.testJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

	public static void main(String[] args) throws IOException, ParseException {
		
		File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\Jan25APITesting\\src\\test\\resources\\MyData.json");
		FileReader fileReader= new FileReader(file);
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject= (JSONObject)parse;
		
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("age"));
		System.out.println(jsonObject.get("status"));
		System.out.println(jsonObject.get("address"));
		System.out.println(jsonObject.get("courses"));
		
	}

}
