package testNGPractice;

import org.testng.annotations.*;

public class TestNgPractice {


    @Test
    public void test1() {
        System.out.println("Test 1 Passed");

    }
    @Test
    public void test2(){
        System.out.println("Test 2 Passed");
    }
    @Test
    public void test3(){
        System.out.println("Test 3 Passed");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("this is after class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("this is before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("this is after test");
    }
}
