package cody.model.bo.validate;

public interface Validate<T> {

	public boolean isValid(T object) throws ValidateException;
}
