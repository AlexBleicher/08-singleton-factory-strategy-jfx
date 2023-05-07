package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;
import java.util.Locale;

public class CategoryFilter extends FilterBase{

	private String[] categories;

	public CategoryFilter(String... categories) {
		this.categories = categories;
	}

	@Override
	protected boolean include(Meal m) {
		return Arrays.stream(categories)
			.anyMatch(s -> s.equals(m.getCategory().toLowerCase()));
	}
}
