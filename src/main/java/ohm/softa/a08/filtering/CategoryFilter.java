package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;
import java.util.Locale;

public class CategoryFilter extends FilterBase{

	private String[] categories;

	private boolean exclude;

	public CategoryFilter(boolean e, String... categories) {
		this.categories = categories;
		exclude = e;
	}

	@Override
	protected boolean include(Meal m) {
		if(!exclude) {
			return Arrays.stream(categories)
				.anyMatch(s -> s.equals(m.getCategory().toLowerCase()));
		}
		else{
			return Arrays.stream(categories)
				.noneMatch(s->s.equals(m.getCategory().toLowerCase()));
		}
	}
}
