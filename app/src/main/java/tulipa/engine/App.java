/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tulipa.engine;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        JFrame janela = new JFrame("Tulipa");

        JLabel rotulo = new JLabel("Teste de janela da Tulipa Engine");

        janela.add(rotulo);

        janela.setSize(300, 200);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setVisible(true);
    }
}
