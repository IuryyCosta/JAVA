import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Anotação para definir o nome da tabela no banco de dados.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Tabela {
    /**
     * Nome da tabela no banco de dados.
     *
     * @return nome da tabela
     */
    String value();
}