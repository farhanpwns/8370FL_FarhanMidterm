package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Student student = new Student("SORA", "ROXAS", "RIKU", "011620");

        //Unit test for getFirst name
        try{
            Assert.assertEquals(student.getFirstName(),"SORA");
            System.out.println("Unit Test Passed getFirstName");
        }catch ( AssertionError as){
            System.out.println("Unit Test Failed getFirstName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getLast name
        try{
            Assert.assertEquals(student.getLastName(),"ROXAS");
            System.out.println("Unit Test passed lastName");
        }catch (AssertionError as){
            System.out.println("Unit Test Failed lastName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getScore name
        try{
            Assert.assertEquals(student.getScore(),"RIKU");
            System.out.println("Test passed getScore");
        }catch (AssertionError as){
            System.out.println("Test Failed getScore");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getID name
        try{
            Assert.assertEquals(student.getId(),"011620");
            System.out.println("Unit Test passed getId");
        }catch (AssertionError as){
            System.out.println("Unit Test Failed getId");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

    }
}
