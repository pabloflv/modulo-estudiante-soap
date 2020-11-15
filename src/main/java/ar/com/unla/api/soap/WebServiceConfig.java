package ar.com.unla.api.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}
	
	@Bean(name = "UsuarioController")
	public DefaultWsdl11Definition usuarioControllerWsdl11Definition(XsdSchema usuarioControllerSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("UsuarioControllerPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("ar.com.unla.api.soap");
		wsdl11Definition.setSchema(usuarioControllerSchema);
		return wsdl11Definition;
	}
	@Bean
	public XsdSchema usuarioControllerSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/UsuarioController.xsd"));
	}
	
	@Bean(name = "UsuarioExamenFinalController")
	public DefaultWsdl11Definition usuarioExamenFinalControllerWsdl11Definition(XsdSchema usuarioExamenFinalControllerSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("UsuarioExamenFinalControllerPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("ar.com.unla.api.soap");
		wsdl11Definition.setSchema(usuarioExamenFinalControllerSchema);
		return wsdl11Definition;
	}
	@Bean
	public XsdSchema usuarioExamenFinalControllerSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/UsuarioExamenFinalController.xsd"));
	}
}