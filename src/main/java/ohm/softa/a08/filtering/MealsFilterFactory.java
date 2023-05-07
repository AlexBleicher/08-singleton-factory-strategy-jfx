package ohm.softa.a08.filtering;

import java.util.HashMap;
import java.util.Map;

public abstract class MealsFilterFactory {

	private static final Map<String, MealsFilter> filters = new HashMap<>();

	static{
		filters.put("All", new NoFilter());
		filters.put("Vegetarian", new CategoryFilter("vegetarisch", "vegan"));
		filters.put("No pork", new NotesFilter("Schwein"));
		filters.put("No soy", new NotesFilter("mit Soja"));
	}

	public static MealsFilter getStrategy(String k){
		return filters.getOrDefault(k, new NoFilter());
	}
}
