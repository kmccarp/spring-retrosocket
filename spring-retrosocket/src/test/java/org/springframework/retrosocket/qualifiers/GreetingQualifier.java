package org.springframework.retrosocket.qualifiers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author <a href="mailto:josh@joshlong.com">Josh Long</a>
 */
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Qualifier(Constants.QUALIFIER_2)
@interface GreetingQualifier {

}
