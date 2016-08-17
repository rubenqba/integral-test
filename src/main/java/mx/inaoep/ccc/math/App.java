package mx.inaoep.ccc.math;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.TrapezoidIntegrator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        TrapezoidIntegrator integrator = new TrapezoidIntegrator();

        PolynomialFunction f = new PolynomialFunction(new double[]{0, 0, 1});
        System.out.println("To String " + f.toString());
        System.out.println("Grado: " + f.degree());

        double i = integrator.integrate(100000, f, 1, 4);
        System.out.println("Trapezoid integral : " + i);

        i = integrator.integrate(100000, new FuncionX2(), 1, 4);
        System.out.println("Trapezoid integral : " + i);
    }
}

class FuncionX2 implements UnivariateFunction {

    public double value(double v) {
        return v * v;
    }
}