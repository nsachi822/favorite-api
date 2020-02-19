package fav.favoriteapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fav.favoriteapi.domain.Common;
import fav.favoriteapi.domain.CommonRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommonService {
	
	private final CommonRepository commonRepository;
	
	public List<Common> findAll() {
		return commonRepository.findAll();
	}
	
	public Common save(String contentname,String type) {
		return commonRepository.save(Common.newCommon(contentname,type));
	}
	
	public void delete(Long id) {
		commonRepository.findById(id).ifPresent(common -> commonRepository.delete(common));
	}

}
