package br.com.senai.vitoriasilva.application.config;

//importações
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

//forçando ele a estar na versão 2.3 do jsf
@FacesConfig(version = Version.JSF_2_3)

//tempo de vida: enquanto a aplicação estiver aberta, essas configurações vão funcionar
@ApplicationScoped

public class Config {

}
