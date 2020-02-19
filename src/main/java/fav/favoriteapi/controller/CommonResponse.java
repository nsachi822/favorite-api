package fav.favoriteapi.controller;

import java.util.List;

import fav.favoriteapi.domain.Common;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommonResponse {

	private List<Common> commons;
}
