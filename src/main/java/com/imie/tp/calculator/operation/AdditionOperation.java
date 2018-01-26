/**
 * description for AdditionOperation
 */
package com.imie.tp.calculator.operation;

/**
 * Operation is an addition.
 * @author BenBen
 */
public class AdditionOperation extends OperationCommandBase {
    /**
     * calls the parent's constructor.
     * @param baseValue
     */
    public AdditionOperation(final float baseValue) {
        super(baseValue);
    }

    /**
     * does the addition.
     * @overide make method
     */
    public void make(float value) {
      this.currentValue += value;
    }

    public float getCurrentValue() {
        
        return this.currentValue;
    }

}
