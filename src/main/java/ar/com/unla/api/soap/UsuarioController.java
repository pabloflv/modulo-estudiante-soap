package ar.com.unla.api.soap;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ar.com.unla.api.soap.request.ExportToPDFUsuarioControllerRequest;
import ar.com.unla.api.soap.request.GetAnaliticoUsuarioControllerRequest;
import ar.com.unla.api.soap.response.GetAnaliticoUsuarioControllerResponse;
import ar.com.unla.api.models.response.ApplicationResponse;
import ar.com.unla.api.services.AnaliticoService;

@Endpoint
public class UsuarioController {
	private static final String NAMESPACE_URI = "ar.com.unla.api.soap";
	private final HttpServletResponse servletResponse;
	
	public UsuarioController(HttpServletResponse servletResponse) {
        this.servletResponse = servletResponse;
    }
	
	@Autowired
    private AnaliticoService analiticoService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "exportToPDFUsuarioControllerRequest")
	public void exportToPDF(@RequestPayload ExportToPDFUsuarioControllerRequest request) throws IOException {
		analiticoService.exportToPDF(servletResponse, request.getIdUsuario());
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAnaliticoUsuarioControllerRequest")
	@ResponsePayload
	public GetAnaliticoUsuarioControllerResponse getAnalitico(@RequestPayload GetAnaliticoUsuarioControllerRequest request)
			throws IOException {
		GetAnaliticoUsuarioControllerResponse response = new GetAnaliticoUsuarioControllerResponse();
		
		response.setApplicationResponse(new ApplicationResponse<>(analiticoService.getAnalitico(request.getIdUsuario()), null));
		return response;
	}
}