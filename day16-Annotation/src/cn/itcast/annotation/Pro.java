package cn.itcast.annotation;

import java.lang.annotation.*;

/**
 * 描述需要执行的类名，和方法名
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {
    String className();
    String methodName();
}
