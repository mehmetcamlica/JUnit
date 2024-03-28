package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReusableMethods {

    public static void bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            System.out.println("Bekleme isleminde sorun olustu");
        }

    }

    public static List<String> stringListeDonustur(List<WebElement> webElementList) {

        List<String> donusturulenList = new ArrayList<>();

        for (WebElement eachElement : webElementList
        ) {

            donusturulenList.add(eachElement.getText());
        }


        return donusturulenList;
    }

    public static void switchWindow(WebDriver driver, String hedefUrl) {
        Set<String> tumWHDSeti = driver.getWindowHandles();

        for (String eachWHD : tumWHDSeti
             ) {
            driver.switchTo().window(eachWHD);
            if (driver.getCurrentUrl().equals(hedefUrl)){
                break;
            }
        }



    }
}