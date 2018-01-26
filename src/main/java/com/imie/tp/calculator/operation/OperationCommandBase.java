/**
 * description for AdditionCommandBase
 */
package com.imie.tp.calculator.operation;

/**
 * implementation of method.
 * @author BenBen
 *
 */
public abstract class OperationCommandBase implements OperationCommand {
    public float currentValue = 10;
      
    /**
     * Sets the currentValue variable to baseValue.
     * @param baseValue
     */
    public OperationCommandBase(float baseValue){
      
            this.currentValue = baseValue;
  }


}
