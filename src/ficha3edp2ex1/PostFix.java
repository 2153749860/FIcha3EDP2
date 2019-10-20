/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3edp2ex1;

/**
 *
 * @author tiago
 */
public class PostFix<T> {

    private ArrayStack<Double> calc;

    public PostFix() {
        this.calc = new ArrayStack<>();
    }

    public Double calcular(String texto) throws EmptyCollectionException {
        String[] partes = texto.split(" ");

        for (int i = 0; i < partes.length; i++) {
            switch (partes[i]) {
                case "+":
                    if (calc.size() < 2) {
                        System.out.println("Não tem dois elementos!");
                        return null;
                    } else {
                        double numero1 = calc.pop();
                        double numero2 = calc.pop();
                        this.calc.push(numero1 + numero2);
                    }
                    break;
                case "-":
                    if (calc.size() < 2) {
                        System.out.println("Não tem dois elementos!");
                        return null;
                    } else {
                        double numero1 = calc.pop();
                        double numero2 = calc.pop();
                        this.calc.push(numero1 - numero2);
                    }
                    break;
                case "*":
                    if (calc.size() < 2) {
                        System.out.println("Não tem dois elementos!");
                        return null;
                    } else {
                        double numero1 = calc.pop();
                        double numero2 = calc.pop();
                        this.calc.push(numero1 * numero2);
                    }
                    break;
                case "/":
                    if (calc.size() < 2) {
                        System.out.println("Não tem dois elementos!");
                        return null;
                    } else {
                        double numero2 = calc.pop();
                        double numero1 = calc.pop();
                        this.calc.push(numero1 / numero2);
                    }
                    break;
                default:
                    if(isDouble(partes[i])){
                        calc.push(Double.parseDouble(partes[i]));
                    }
                    else{
                        return null;
                    }
                    break;
            }
        }
        return this.calc.pop();
        //return this.calc.peek();
    }
    
    boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
