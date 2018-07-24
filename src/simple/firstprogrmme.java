package simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class firstprogrmme {
	
	
	public static void main(String[] args)
	{
		
		ArrayList 	obj1 = new ArrayList();
		obj1.add("Arman");
		obj1.add("Arman");
		obj1.add("Arman");
		obj1.add("Arman");
		
		
		 int n = obj1.size();
		
		System.out.println(obj1);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(obj1.get(i));
		}
		
		

		for(Object str : obj1)
		{
			System.out.println(str);
		}
		Iterator itr = obj1.iterator();
		while(itr.hasNext())
		{
			Object value = itr.next();
			System.out.println(value);
			
		}
		
		
		
	}
	
	
}
