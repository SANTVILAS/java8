package optional_related_questions;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	public static Optional<String> ofNullable() {

		Optional<String> stringOptional = Optional.ofNullable("santvilas");
		return stringOptional;

	}
	
	public static Optional<String> of() {

		Optional<String> stringOptional = Optional.of("Hey");
		return stringOptional;

	}
	
	public static Optional<String> empty() {

		
		return Optional.empty();

	}

	public static void main(String[] args) {
        System.out.println(ofNullable().get());
        System.out.println(of().get());
        System.out.println(of().empty());
	}

}
