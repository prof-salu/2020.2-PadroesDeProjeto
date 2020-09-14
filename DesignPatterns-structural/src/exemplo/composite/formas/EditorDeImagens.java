package exemplo.composite.formas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class EditorDeImagens {
	private EditorCanvas canvas;

	private FormaComposta formas = new FormaComposta();

	public EditorDeImagens() {
		canvas = new EditorCanvas();
	}

	public void carregarFormas(Forma... forma) {
		formas.clear();
		formas.add(forma);
		canvas.atualizar();
	}

	private class EditorCanvas extends Canvas {
		JFrame frame;

		private static final int PADDING = 10;

		EditorCanvas() {
			createFrame();
			atualizar();
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					formas.deselecionar();
					formas.selecionarForma(e.getX(), e.getY());
					e.getComponent().repaint();
				}
			});
		}

		void createFrame() {
			frame = new JFrame();
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);

			JPanel contentPanel = new JPanel();
			Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
			contentPanel.setBorder(padding);
			frame.setContentPane(contentPanel);

			frame.add(this);
			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		}

		public int getWidth() {
			return formas.getX() + formas.getLargura() + PADDING;
		}

		public int getHeight() {
			return formas.getY() + formas.getAltura() + PADDING;
		}

		void atualizar() {
			this.setSize(getWidth(), getHeight());
			frame.pack();
		}

		public void paint(Graphics grafico) {
			formas.desenhar(grafico);
		}
	}
}
