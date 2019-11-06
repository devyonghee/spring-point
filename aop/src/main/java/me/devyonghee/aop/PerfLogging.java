package me.devyonghee.aop;

import java.lang.annotation.*;

/**
 *  이 애노테이션을 사용하면 성능을 로깅해 줍니다.
 */
@Documented
//기본값이 CLASS
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface PerfLogging {

}
