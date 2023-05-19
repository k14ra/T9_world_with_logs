package edu.alonso.daw.tema9_world.utils;

import java.util.Comparator;

import edu.alonso.daw.tema9_world.model.City;

public class NameCityComparator implements Comparator<City>{

	@Override
	public int compare(City o1, City o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
