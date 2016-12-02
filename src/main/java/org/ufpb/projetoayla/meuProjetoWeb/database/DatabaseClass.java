package org.ufpb.projetoayla.meuProjetoWeb.database;

import java.util.HashMap;
import java.util.Map;

import org.ufpb.projetoayla.meuProjetoWeb.model.Palavra;
import org.ufpb.projetoayla.meuProjetoWeb.model.Profile;

public class DatabaseClass {

	private static Map<Long, Palavra> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Palavra> getMessages(){
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}
