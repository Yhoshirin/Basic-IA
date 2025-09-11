package perceptron;

public class Perceptron {

    private double peso1;
    private double peso2;
    private double learningRate;
    private double bias;
    private ActivationFunction activationFunction;

    public Perceptron(){
        this.peso1=0.5;
        this.peso2=-0.2;
        this.bias=0;
        this.learningRate=0.1;
        activationFunction = new ActivationFunctionImpl();
    }

    public int predict (int value1, int value2){
        double resultado = 0;
        resultado = (value1*peso1) + (value2*peso2) + bias;
        return activationFunction.activate(resultado);
    }
}

