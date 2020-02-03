package cat.emprul.viewcontroller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import cat.emprul.model.config.DbConfig;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"cat.emprul"})
@Import(DbConfig.class)
public class RootApplicationConfig {
	
	 private final DbConfig dataConfig;

     public RootApplicationConfig(DbConfig dataConfig) {
         this.dataConfig = dataConfig;
     }
     
     
//	@Bean
//	 public ViewResolver configureViewResolver() {
//	     InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
//	     viewResolve.setPrefix("/*");
//	     viewResolve.setSuffix(".xhtml");
//
//	     return viewResolve;
//	 }
	
	
	
	
}
