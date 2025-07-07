package elements;

import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;

public class AcessoOnboardingElements extends BasePage {

   //@AndroidFindBy(xpath = "//*[contains(@resource-id, 'logo')]")
   //protected WebElement logo;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'navbarTitle')]")
    protected WebElement nomeEmpresa;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'navbarLink')]")
    protected WebElement navLogin;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'heroTitle')]")
    public WebElement textoApresentacaoHeader;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'heroTextApresentacao')]")
    public WebElement textoApresentacao;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'heroTextAgendamento')]")
    public WebElement textoAgendamento;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'maisInformacoesButton')]")
    public WebElement botaoPreAgendamento;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'imageAssist')]")
    public WebElement imagemRecepcao;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'servicesTitle')]")
    public WebElement textoServicos;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'imageCardComputacao')]")
    public WebElement imagemComputadores;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'buttonCardComputacao')]")
    public WebElement botaoComputadores;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'imageCardEletrodomesticos')]")
    public WebElement imagemEletrodomesticos;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'imageCardEletrodomesticos')]")
    public WebElement botaoEletrodomesticos;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'imageCardEletronico')]")
    public WebElement imagemEletronicos;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'buttonCardEletronico')]")
    public WebElement botaoEletronicos;

}
