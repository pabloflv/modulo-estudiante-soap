package ar.com.unla.api.soap.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ar.com.unla.api.dtos.request.UsuarioMateriaDTO;
import ar.com.unla.api.models.response.ApplicationResponse;
import ar.com.unla.api.services.UsuarioMateriaService;
import ar.com.unla.api.soap.request.CreateUsuarioMateriaControllerRequest;
import ar.com.unla.api.soap.response.CreateUsuarioMateriaControllerResponse;

@Endpoint
public class UsuarioMateriaController {
	private static final String NAMESPACE_URI = "ar.com.unla.api.soap";
	
	@Autowired
    private UsuarioMateriaService usuarioMateriaService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUsuarioMateriaControllerRequest")
	@ResponsePayload
    public CreateUsuarioMateriaControllerResponse create(@Valid @RequestPayload CreateUsuarioMateriaControllerRequest request) {
		CreateUsuarioMateriaControllerResponse response = new CreateUsuarioMateriaControllerResponse();
		UsuarioMateriaDTO usuarioMateriaDTO = new UsuarioMateriaDTO((long)request.getIdMateria(), (long)request.getIdUsuario(),
				request.getCalificacionExamen(), request.getCalificacionTps());
		
		response.setApplicationResponse(new ApplicationResponse<>(usuarioMateriaService.create(usuarioMateriaDTO),null));
		return response;
    }
}