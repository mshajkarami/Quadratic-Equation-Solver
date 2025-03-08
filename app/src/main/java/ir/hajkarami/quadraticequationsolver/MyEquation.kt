package ir.hajkarami.quadraticequationsolver

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import ir.hajkarami.quadraticequationsolver.databinding.ActivityMainBinding

class MyEquation(equation: EquationModel,private val binding : ActivityMainBinding) : BaseObservable() {

    @get:Bindable
    var a: String = equation.a
        set(value) {
            field = value
            notifyPropertyChanged(BR.a)
        }

    @get:Bindable
    var b: String = equation.b
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }

    @get:Bindable
    var c: String = equation.c
        set(value) {
            field = value
            notifyPropertyChanged(BR.c)
        }

    fun solveEquation(view: View) {
        try {
            val a = a.toInt()
            val b = b.toInt()
            val c = c.toInt()
            val discriminant = b * b - 4 * a * c.toDouble()
            val result = when {
                discriminant > 0 -> {
                    val x1 = (-b + Math.sqrt(discriminant)) / (2 * a)
                    val x2 = (-b - Math.sqrt(discriminant)) / (2 * a)
                    "X1 = $x1, X2 = $x2"
                }

                discriminant < 0 -> {
                    "No real roots (complex roots)"
                }

                else -> {
                    val x = -b / (2 * a)
                    "X = $x"
                }
            }
            binding?.txtResult?.text = result
        } catch (e: NumberFormatException) {
            binding?.txtResult?.text = "Invalid input! Please enter valid numbers."
        }
    }
}

