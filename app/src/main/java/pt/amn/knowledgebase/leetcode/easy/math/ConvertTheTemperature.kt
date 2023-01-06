package pt.amn.knowledgebase.leetcode.easy.math

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given a non-negative floating point number rounded to two decimal places celsius,
 * that denotes the temperature in Celsius.
 *
 * You should convert Celsius into Kelvin and Fahrenheit and return it as
 * an array ans = [kelvin, fahrenheit].
 *
 * Return the array ans. Answers within 10-5 of the actual answer will be accepted.
 *
 * Note that:
 *
 * Kelvin = Celsius + 273.15
 * Fahrenheit = Celsius * 1.80 + 32.00
 *
 */
class ConvertTheTemperature(private val celsius: Double) : Solution<DoubleArray> {

    override fun getResult(): DoubleArray =
        doubleArrayOf(celsius + 273.15, celsius * 1.8 + 32.00)

}