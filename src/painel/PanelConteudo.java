package painel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Panel usado para exibir os conteúdos do pedido: imagem e preparo.
 * @author Tayná Alexandra
 */
public class PanelConteudo extends JPanel {

    public PanelConteudo(JFrame pai) {
        super();
        setOpaque(false);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // setando a cor para um branco semitransparente
        g.setColor(new Color(255, 255, 255, 150));

        // desenha um retângulo em toda a extensão do painel
        //g.fillRect(0, 0, getWidth(), getHeight());
    }
}
