package fav.favoriteapi.controller;

import java.util.List;

import fav.favoriteapi.domain.Book;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BookResponse {

	private List<Book> books;
}
