package utilizando_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("O Código Da Vinci");
        livro.setCodigo("D34FD");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Dan Brown");

        livro.exibir();

        ((AbstractApplicationContext) factory).close();

    }
}
