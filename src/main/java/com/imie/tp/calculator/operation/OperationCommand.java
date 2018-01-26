/**
 * description for AdditionCommand
 */
package com.imie.tp.calculator.operation;
/**
 * interface method for type of commands.
 * @author BenBen
 *
 */
public interface OperationCommand
{
    void make(float value);

    float getCurrentValue();
}
