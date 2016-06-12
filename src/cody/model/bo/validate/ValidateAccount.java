package cody.model.bo.validate;

import cody.model.dto.Account;

public class ValidateAccount implements Validate<Account> {
	
	@Override
	public boolean isValid(Account object) throws ValidateException {
		
		if(!praznoNullIliManjeOdVelicine(object.getUsername(), 3)){
			throw new ValidateException("Username mora imati vise od 3 slova");
		}
		
		if(!praznoNullIliManjeOdVelicine(object.getPassword(), 4)){
			throw new ValidateException("Password mora imati vise od 4 slova");
		}
		
		if(!praznoNullIliManjeOdVelicine(object.getName(), 2)){
			throw new ValidateException("Ime mora imati vise od dva slova");
		}
		
		if(!praznoNullIliManjeOdVelicine(object.getSecondName(), 2)){
			throw new ValidateException("Prezime mora imati vise od dva slova");
		}
		
		if(!praznoNullIliManjeOdVelicine(object.getEmail(),0)){
			throw new ValidateException("Email je prazan");
		}
		
		return true;
	}
	
	private boolean praznoNullIliManjeOdVelicine(String param , int lenght){
		if(param.trim() == "" | param == null | param.length() <= lenght){
			return false;
		}
		return true;
		
	}

}
