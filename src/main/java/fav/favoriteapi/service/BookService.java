package fav.favoriteapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fav.favoriteapi.domain.Book;
import fav.favoriteapi.domain.BookRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	
	private final BookRepository bookRepository;
	
	public List<Book> findAll(){
		return bookRepository.findAll();
	}

}
