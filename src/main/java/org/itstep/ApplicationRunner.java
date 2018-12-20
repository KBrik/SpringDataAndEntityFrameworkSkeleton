package org.itstep;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import sun.awt.AppContext;

/**
 * Hello world!
 *
 */
public class ApplicationRunner 
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(ApplicationRunner.class, args);
    }
}
