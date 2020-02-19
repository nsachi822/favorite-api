package fav.favoriteapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class Common {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String contentname;
	
	private String type;
	
	public static Common newCommon (String contentname,String type) {
		Common common = new Common();
		common.contentname = contentname;
		common.type = type;
		return common;
	}
	
}
