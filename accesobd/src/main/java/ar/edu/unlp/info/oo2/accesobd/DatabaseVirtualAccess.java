package ar.edu.unlp.info.oo2.accesobd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseVirtualAccess implements DatabaseAccess {
    private DatabaseAccess database;
    private boolean loggedIn;
    private String key;

    public DatabaseVirtualAccess(DatabaseAccess bdd, String key) {
        this.loggedIn = false;
        this.database = bdd;
        this.key = key;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        this.revisarUsuario();
    	return this.database.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
    	this.revisarUsuario();
    	return this.database.insertNewRow(rowData);
    }

	private void revisarUsuario() {
		// TODO Auto-generated method stub
		if (!this.loggedIn) {
			throw new RuntimeException("El Usuario no se encuentra Loggeado");
		}
	}
	
	public boolean login (String pass) {
		if(this.key == pass) {
			this.loggedIn = true;
		} else {
			throw new RuntimeException("Contraseña incorrecta");
		}
		return this.loggedIn;
	}	
	
	public void logout () {
		this.loggedIn = false;
		this.key = null;
	}	
}