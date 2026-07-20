//package tests;
//
//import org.testng.SkipException;
//import org.testng.annotations.Test;
//
//public class SkipTest {
//
//    @Test
//    public void login() {
//
//        throw new SkipException("Skipping Login Test");
//
//    }
//
//    @Test
//    public void payment() {
//
//        String browser = "edge";
//
//        if(browser.equals("edge")){
//
//            throw new SkipException("Edge Not Supported");
//
//        }
//
//        System.out.println("Payment Test");
//
//    }
//}
