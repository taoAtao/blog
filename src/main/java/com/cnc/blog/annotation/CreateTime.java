package com.cnc.blog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xiangt
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD})
public @interface CreateTime {

    String value() default "";
}
