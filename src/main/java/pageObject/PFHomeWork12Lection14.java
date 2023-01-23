package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PFHomeWork12Lection14 {
    public static final String emailSelector = "//ul[@class=\"block-coaches_list\"]";
    @FindBy(xpath = "button[@class=\"site-nav-link -active\"]")
    WebElement schoolButton;

    @FindBy(xpath = "a[contains(@class, \"site-nav-dropdown_link\") and contains(text(), \"Викладачі\")]")
    WebElement teacherButton;

    @FindBy(xpath = "//li[@class=\"block-coaches_item\"]")
    List<WebElement> listteachers;

    public void printListTeachers() {
        for (WebElement l : listteachers) {
            System.out.println(l.findElement(By.tagName("li")).getText());
            System.out.println(l.findElement(By.tagName("a")).getAttribute("href"));
            System.out.println("                                 ");
        }

    }

    public int getSizeListteachers() {
        return listteachers.size();

    }
}
