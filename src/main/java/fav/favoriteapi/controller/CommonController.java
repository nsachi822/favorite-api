package fav.favoriteapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fav.favoriteapi.domain.Common;
import fav.favoriteapi.service.CommonService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CommonController {

	private final CommonService commonService;

	@GetMapping("/")
	public ResponseEntity <CommonResponse> findAll() {
		List<Common> commons = commonService.findAll();
		CommonResponse commonResponse = CommonResponse.builder()
				.commons(commons)
				.build();
		return new ResponseEntity<>(commonResponse,HttpStatus.OK);
		
	}
	
	@PostMapping("/")
	public ResponseEntity<HttpStatus> save(@RequestBody CommonAddRequest request) {
		commonService.save(request.getContentname(),request.getType());
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Long id) {
		commonService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
