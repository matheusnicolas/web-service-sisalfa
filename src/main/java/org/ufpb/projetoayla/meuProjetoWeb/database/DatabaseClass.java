package org.ufpb.projetoayla.meuProjetoWeb.database;

import java.util.HashMap;
import java.util.Map;

import org.ufpb.projetoayla.meuProjetoWeb.model.Contexto;
import org.ufpb.projetoayla.meuProjetoWeb.model.Profile;

public class DatabaseClass {

	private static Map<Long, Contexto> contextos = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Contexto> getMessages(){
		return contextos;
	}
	
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}
