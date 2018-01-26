/**
 *
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
    public AdditionOperation(float baseValue) {
        super(baseValue);
    }

    @Override
    public void make(float value) {
        this.baseValue += value;
    }

    public float getCurrentValue() {
        // TODO Auto-generated method stub
        return 0;
    }

}
