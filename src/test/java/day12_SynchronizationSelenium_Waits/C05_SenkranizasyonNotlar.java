package day12_SynchronizationSelenium_Waits;

public class C05_SenkranizasyonNotlar {
     /*

    Senkronize etmekten kasıt bilgisayar, internet sayfasinın hızını kodlarimizda eş zamanli çalışmasini sağlamaktir.
    Bunun için 3 tane bekletme yolu vardir.

    1-- Thread.sleep ---> Java tabanli wait. seleniumda yoktur. javadan kullaniriz.

    2-- implicitly wait ---> Selenium tabanli. site içerisinde elementlerin yüklenmesini beklemek için kullanilir.
    Bu kod sayfa acilmadiysa verilen sure kadar bekler ve sayfa içerisinde çalışırken karşılaştığı yüklenmemis elementleri de
    yüklenene kadar verilen süre kadar bekler.
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    3-- Explicitly wait --> istediğimiz bir element için koşul gerçekleşene kadar beklet
    Özellikle bekletmek istediğimiz elementlerin öncesinde ayarladığımız sure ve koşuldur.Koşul gerçekleşince surenin dolmasini beklemez.
    Aslinda wait kullandiğmiz elementten once o element yüklenene kadar şu kadar süre içerisinde ve şu şart gerçekleşene
    kadar bekle demektirdir.
    örneğin; dosya indirilene kdar bekle, veya dosyanin inmesini 15 sn bekle gibi...
       --> her element yada işlem için oncesinde yapilir.

       oluşturmak için (1)wait objesi yapariz. --> WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
       --> sonrasinda 2. satirda (2) wait.until() yazarak parantez içine ExpectedConditions + nokta basarak uygun şartı belirleriz.
       --> koşulların parantez içine --wait.until(ExpectedConditions.elementToBeClickable(enableKutusu);--
       webelement gibi şeyler yazmak gerekebilir.

       Ornegin;
        wait.until(ExpectedConditions.alertIsPresent()); -->
        wait.until(ExpectedConditions.elementToBeClickable(enableKutusu);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("locate adresi"));
        wait.until(ExpectedConditions.refreshed();

        Birde ek olarak FluentWait vardir. o da her 2 saniyede bir çalışmayı dene demektir. dosya indi mi inmedi mi diye loop yapiyor denebilir.

                Cookies
                2 çeşittir.
                1) oturum çerezi -  bizim ip gibi bilgilerimizi serverda tutup bir daha bize soru sormuyor.
                Oturum çerezleri yalnızca bir web sitesinde gezinirken kullanılır.
                Bunlar rastgele erişimli bellekte saklanır ve hiçbir zaman sabit sürücüye yazılmaz.
                Oturum sona erdiğinde oturum çerezleri otomatik olarak silinir.

                2) kalıcı çerezler - Kalıcı çerezler bir bilgisayarda sonsuza kadar kalır
                ancak birçoğunun bir son kullanma tarihi olup bu tarihe gelindiğinde otomatik olarak kaldırılırlar.

                *** Üçüncü taraf çerezler daha sıkıntılıdır. Bunlar, genellikle kullanıcıların halihazırda
                gezindiği web sayfalarındaki reklamlarla bağlantılı olduklarından bu sayfalardan farklı
                web siteleri tarafındanoluşturulur.

     */
}
