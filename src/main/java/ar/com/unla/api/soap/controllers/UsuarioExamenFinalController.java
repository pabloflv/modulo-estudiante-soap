package ar.com.unla.api.soap.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ar.com.unla.api.dtos.request.UsuarioExamenFinalDTO;
import ar.com.unla.api.models.response.ApplicationResponse;
import ar.com.unla.api.services.UsuarioExamenFinalService;
import ar.com.unla.api.soap.request.CreateUsuarioExamenFinalControllerRequest;
import ar.com.unla.api.soap.request.UpdateRemainderUsuarioExamenFinalControllerRequest;
import ar.com.unla.api.soap.response.CreateUsuarioExamenFinalControllerResponse;
import ar.com.unla.api.soap.response.UpdateRemainderUsuarioExamenFinalControllerResponse;

@Endpoint
public class UsuarioExamenFinalController {
	private static final String NAMESPACE_URI = "ar.com.unla.api.soap";
	
	@Autowired
    private UsuarioExamenFinalService usuarioExamenFinalService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUsuarioExamenFinalControllerRequest")
	@ResponsePayload
	public CreateUsuarioExamenFinalControllerResponse create(@Valid @RequestPayload CreateUsuarioExamenFinalControllerRequest request) {
		CreateUsuarioExamenFinalControllerResponse response = new CreateUsuarioExamenFinalControllerResponse();
		UsuarioExamenFinalDTO usuarioExamenFinalDTO = new UsuarioExamenFinalDTO((long)request.getIdExamenFinal(),
													(long)request.getIdUsuario(), request.isRecordatorio(), request.getCalificacion());
		
		response.setApplicationResponse(new ApplicationResponse<>(usuarioExamenFinalService.create(usuarioExamenFinalDTO), null));
		return response;
    }
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateRemainderUsuarioExamenFinalControllerRequest")
	@ResponsePayload
	public UpdateRemainderUsuarioExamenFinalControllerResponse updateRemainder(
			@RequestPayload UpdateRemainderUsuarioExamenFinalControllerRequest request) {
		UpdateRemainderUsuarioExamenFinalControllerResponse response = new UpdateRemainderUsuarioExamenFinalControllerResponse();
		
		response.setApplicationResponse(new ApplicationResponse<>(usuarioExamenFinalService.updateRemainder(
				(long)request.getIdUsuarioExamenFinal(), request.isRecordatorio()), null));
		return response;
    }
}
