package org.springframework.retrosocket;

import java.lang.annotation.*;

import org.springframework.context.annotation.Import;

/**
 * @author <a href="mailto:josh@joshlong.com">Josh Long</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(RSocketClientsRegistrar.class)
public @interface EnableRSocketClients {

	String[] value() default {};

	String[] basePackages() default {};

	Class<?>[] basePackageClasses() default {};

}
