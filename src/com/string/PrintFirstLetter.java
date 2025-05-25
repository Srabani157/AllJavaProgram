/*
package com.string;

import java.util.Set;

public class PrintFirstLetter {

    public void test(){
        RestAssured.BaseURI = "";
       Response res =  given()
                .queryParams("path", 2)
                .headers()
                .when()
                .get("uri")
                .then()
                .statusCode(200)
        ;
               JSONPath jsonPath = new JSONPath();

    }
    public void test1(){
       String parentWindow = driver.getWindowHandle();
       //perform the operation
        String currenthandle = driver.getWindowHandle();
       Set<String> handles = driver.getWindowHandles();
        for(String handle : handles){
            if(currenthandle!=parentWindow){
                driver.switchTo().window();
            }
        }
    }

    }
triggers:
-mvn clean install
-mvn test
*/
