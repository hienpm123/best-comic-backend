package comic.one.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import comic.one.entities.Category;
import comic.one.repositories.CategoryRepository;

@RestController
@RequestMapping("/v1")
public class CategoryController {
	@Autowired
	private final CategoryRepository repository;

	CategoryController(CategoryRepository repository) {
		this.repository = repository;
	}

	@PostMapping("/category")
	Category newEmployee(@RequestBody Category newCategory) {
		return repository.save(newCategory);
	}
}
