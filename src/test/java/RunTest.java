import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunTest extends StartTest {

    @Before
    public void start() {
        one();
    }

    @Test

    public void FirstTest() throws InterruptedException
    {
        click("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div/div/span/span");
        click("//*[text()=\"Вход или регистрация\"]");
        click("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div[2]/div/div/div/form/div/div[3]/a[1]");
        send("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div[2]/div/div/div/form/div/div[2]/input", "jazariah.samantha@sellcow.net");
        send("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div[2]/div/div/div/form/div/div[3]/input", "dswid788");
        click("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div[2]/div/div/div/form/div/button");
        send("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/input", "iPhone");
        click("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[2]/div/div/div[3]/button");
        addElement("//*[@class=\"tile\"]", ".//*[@data-test-id=\"tile-buy-button\"]", ".//*[contains(@href, \'/context/detail/id/\')]");
        getToLink("https://www.ozon.ru/context/cart");
        addSecondElement("//*[@class=\"main split-item\"]", ".//*[contains(@href, \'/context/detail/id/\')]");
        compareElements();
        click("//*[@id=\"__layout\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/button[2]");
        click("//*[@id=\"__layout\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/section/div[3]/button");
        click("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div/div/span/span");
        click("//*[text()=\"Выйти\"]");
        click("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div/div/span/span");
        click("//*[text()=\"Вход или регистрация\"]");
        click("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div[2]/div/div/div/form/div/div[3]/a[1]");
        send("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div[2]/div/div/div/form/div/div[2]/input", "jazariah.samantha@sellcow.net");
        send("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div[3]/div[1]/div[2]/div/div/div/form/div/div[3]/input", "dswid788");
        getToLink("https://www.ozon.ru/context/cart");
    }
}
