/*
Feature:

Scenario Outline:
Given user is entering {userid} and {pass}
Then user should able to login

Examples:

|user123||pass|
||user123||pass2|

        {name = Given user is entering {userid} and {pass}}
@Test
public void loginWithUserANdPass(String username, String pass){
  try{
      driver.get();
      driver.findElement(By.xpath("xpath")).sendKeys(username);
      driver.findElement(By.xpath("xpathpass")).sendKeys(pass);
      driver.findElement(By.xpath("xpathpass")).click;
      String title = driver.getTitle();
      Assert.asserEquals(title, "xyz");
  }
  catch(IoException e){
      e.getMessage("");

  }

}*/
