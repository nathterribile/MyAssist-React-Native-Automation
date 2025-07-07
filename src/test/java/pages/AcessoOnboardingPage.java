package pages;

import elements.AcessoOnboardingElements;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AcessoOnboardingPage extends AcessoOnboardingElements {

    public AcessoOnboardingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //public Boolean verificarLogo(){
    //    BasePage.visibilityOf(logo);
    //    BasePage.moveToElement(logo);
    //    return logo.isDisplayed();
    //}
    
    public String verificarTextoLogo(){
        BasePage.visibilityOf(nomeEmpresa);
        BasePage.moveToElement(nomeEmpresa);
        return nomeEmpresa.getText();        
    }

    public String verificarTextoNavLogin(){
        BasePage.visibilityOf(navLogin);
        BasePage.moveToElement(navLogin);
        return navLogin.getText();
    }
    
    public String verificarTextoApresentacaoHeader(){
        BasePage.visibilityOf(textoApresentacaoHeader);
        BasePage.moveToElement(textoApresentacaoHeader);
        return textoApresentacaoHeader.getText();        
    }

    public String verificarTextoApresentacao(){
        BasePage.visibilityOf(textoApresentacao);
        BasePage.moveToElement(textoApresentacao);
        return textoApresentacao.getText();        
    }

    public String verificarTextoAgendamento(){
        BasePage.visibilityOf(textoAgendamento);
        BasePage.moveToElement(textoAgendamento);
        return textoAgendamento.getText();
    }


    public String verificarTextoBotaoPreAgendamento(){
        BasePage.visibilityOf(botaoPreAgendamento);
        BasePage.moveToElement(botaoPreAgendamento);
        return botaoPreAgendamento.getText();
    }

    public boolean verificarBotaoPreAgendamento(){
        BasePage.visibilityOf(botaoPreAgendamento);
        BasePage.moveToElement(botaoPreAgendamento);
        return botaoPreAgendamento.isEnabled();
    }
    
    public Boolean verificarImagemRecepcao(){
        return imagemRecepcao.isDisplayed();
    }

    public String verificarTextoServicos(){
        BasePage.visibilityOf(textoServicos);
        BasePage.moveToElement(textoServicos);
        return textoServicos.getText();
    }

    public Boolean verificarImagemComputadores(){
        return imagemComputadores.isDisplayed();
    }

    public String verificarTextoBotaoComputadores(){
        BasePage.visibilityOf(botaoComputadores);
        BasePage.moveToElement(botaoComputadores);
        return botaoComputadores.getText();
    }

    public boolean verificarBotaoComputadores(){
        BasePage.visibilityOf(botaoComputadores);
        BasePage.moveToElement(botaoComputadores);
        return botaoComputadores.isEnabled();
    }

    public Boolean verificarImagemEletrodomesticos(){
        return imagemEletrodomesticos.isDisplayed();
    }

    public String verificarTextoBotaoEletrodomesticos(){
        BasePage.visibilityOf(botaoEletrodomesticos);
        BasePage.moveToElement(botaoEletrodomesticos);
        return botaoEletrodomesticos.getText();
    }

    public boolean verificarBotaoEletrodomesticos(){
        BasePage.visibilityOf(botaoEletrodomesticos);
        BasePage.moveToElement(botaoEletrodomesticos);
        return botaoEletrodomesticos.isEnabled();
    }

    public Boolean verificarImagemEletronicos(){
        return imagemEletronicos.isDisplayed();
    } 

    public String verificarTextoBotaoEletronicos(){
        BasePage.visibilityOf(botaoEletronicos);
        BasePage.moveToElement(botaoEletronicos);
        return botaoEletronicos.getText();
    }

    public boolean verificarBotaoEletronicos(){
        BasePage.visibilityOf(botaoEletronicos);
        BasePage.moveToElement(botaoEletronicos);
        return botaoEletronicos.isEnabled();
    }
    

}