package org.springframework.retrosocket;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.*;

import org.springframework.stereotype.Indexed;

/**
 * @author <a href="mailto:josh@joshlong.com">Josh Long</a>
 */
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Indexed
public @interface RSocketClient {

}
