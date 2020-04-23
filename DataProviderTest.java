package pack_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="credentials")
  public void f(String name, String pwd) {
	  System.out.println("name: "+name+" pwd: "+pwd);
  }
  
  @DataProvider(name="credentials")
  public Object[][] getCreds(){
	  Object[][] data = new Object[3][2];
	  data[0][0]= "apple";
	  data[0][1]= "orange";
	  data[1][0]= "pineapple";
	  data[1][1]= "melon";
	  data[2][0]= "mango";
	  data[2][1]= "masbooth";
	  
	  return data;	  
  }
}
