package UtilityPackage;


import org.json.JSONObject;

public class TestUtils {
	
	public static boolean jsonHasKey(String json, String key)
	{
		JSONObject jsonobject = new JSONObject(json);
		boolean flag = jsonobject.has(key);
		return flag;
		
		//This is another way to validate the content in json
		//return json.contains(key);
	}
	


}
