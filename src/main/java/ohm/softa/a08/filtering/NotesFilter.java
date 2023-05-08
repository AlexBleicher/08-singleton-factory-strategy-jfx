package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;

public class NotesFilter extends FilterBase{

	String[] notes;

	public NotesFilter(String... notes) {
		this.notes = notes;
	}

	@Override
	protected boolean include(Meal m) {
		for (String note : m.getNotes()) {
			for (String s : notes) {
				if(note.contains(s)){
					return false;
				}
			}
		}
		return true;
	}
}
