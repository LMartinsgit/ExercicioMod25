package anotacao;

import java.lang.annotation.*;

/**
 * @author lucas
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
