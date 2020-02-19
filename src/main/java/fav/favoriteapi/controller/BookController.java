package fav.favoriteapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fav.favoriteapi.domain.Book;
import fav.favoriteapi.service.BookService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BookController {
	private final BookService bookService;
	
	@GetMapping("/book")
	public ResponseEntity<BookResponse> findAll() {
		List<Book> books = bookService.findAll();
		BookResponse bookResponse = BookResponse.builder()
				.books(books)
				.build();
		return new ResponseEntity<>(bookResponse, HttpStatus.OK);
	}

}
