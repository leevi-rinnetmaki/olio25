package orientaatioTehtavat3;

import orientaatioTehtavat3.distributions.Binomial;

public class ArrivalProcess {



public static void main(String[] args) {
    orientaatioTehtavat3.distributions.Binomial binomial = new Binomial(0.5, 100);
    System.out.println(binomial.sample());
}

}
