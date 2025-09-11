package perceptron;

public class ActivationFunctionImpl implements ActivationFunction{
    public int activate (double value){
        if (value>=0)
                return 1;
        return 0;
    }
}
