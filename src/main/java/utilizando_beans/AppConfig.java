package utilizando_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro(){
        return new Livro();
    }
    // versão xml:
    // <bean id="livro" class="com.utilizandoBeans.utilizando_beans"

    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }
}
