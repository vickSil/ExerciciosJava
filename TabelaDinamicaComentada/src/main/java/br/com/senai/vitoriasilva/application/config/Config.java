package br.com.senai.vitoriasilva.application.config;

//importações
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

//forçando ele a estar na versão 2.3 do jsf
@FacesConfig(version = Version.JSF_2_3)

//tempo devida: enquanto a aplicação estiver aberta, essas configuarações vão funcionar
@ApplicationScoped

public class Config {

}
