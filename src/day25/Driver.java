package day25;

public class Driver {
    public static void main(String[] args) {
        String str=getDriver1("chrome");
        System.out.println(str);
    }

    public static String getDriver1(String browserName) {
        String result="";

        switch (browserName.toLowerCase()) {
            case "chrome": return "Chrome Driver";

            case "firefox": return "Firefox Driver";

            case "opera": return"Opera Driver";

            case "edge": return "Edge Driver";


            default: return "Invalid Driver";
        }

        //return result;
    }
}
