package api;

import model.data_structures.ListaEncadenada;
import model.vo.VOMovingViolations;



/**
 * Basic API for testing the functionality of the STS manager
 */
public interface IMovingViolationsManager {

	/**
	 * Method to load the Moving Violations of the STS
	 * @param movingViolationsFile - path to the file 
	 */
	void loadMovingViolations(String movingViolationsFile);
	
	public ListaEncadenada <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode);
	
	
	public ListaEncadenada <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator);

	
}
