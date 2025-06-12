package application;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Venda");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel descricao = new JLabel();
        descricao.setText("Informe o valor:");
        frame.add(descricao);

        JTextField campo = new JTextField(20);
        frame.add(campo);

        JButton botao = new JButton("calcular");
        frame.add(botao);

        botao.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor = Double.parseDouble(campo.getText());
                    if (valor >= 500) {
                        Double desconto = Double.parseDouble(JOptionPane.showInputDialog(frame, "Informe o percentual de desconto:"));
                        if (desconto > 100 || desconto < 0) {
                            JOptionPane.showMessageDialog(null, "[ERRO]Porcentagem de desconto incorreta.");
                            frame.dispose();
                            return;
                        }
                        double valorDesconto = valor * (1 - desconto / 100);
                        JOptionPane.showMessageDialog(null, "Valor com desconto : " + valorDesconto);
                    } else {
                        JOptionPane.showMessageDialog(null, "Concluido com sucesso!");

                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "[ERRO]Digite valor numerico.");

                }
                frame.dispose();
            }
        }
        );

        frame.setVisible(true);

    }
}
