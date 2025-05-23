import java.awt.*;
import javax.swing.*;

/**
 * Panel que muestra gráficamente el histograma de distribución de URLs, con etiquetas y escala.
 */
public class Histograma extends JPanel {
    private int[] bins;

    public Histograma(int[] bins) {
        this.bins = bins;
        setPreferredSize(new Dimension(800, 500));
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (bins == null || bins.length == 0) return;

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("SansSerif", Font.BOLD, 15));
        g2.drawString("Histograma de distribución de URLs en la tabla hash", 220, 30);

        int width = getWidth();
        int height = getHeight();
        int margin = 50;

        int binWidth = (width - 2 * margin) / bins.length;
        int max = 0;
        for (int count : bins) if (count > max) max = count;
        if (max == 0) max = 1; 

        g2.setColor(Color.GRAY);
        for (int i = 0; i <= 10; i++) {
            int y = height - margin - (int)((i / 10.0) * (height - 2 * margin));
            g2.drawLine(margin, y, width - margin, y);
            g2.drawString(String.valueOf((int)(i * max / 10.0)), 5, y + 5);
        }

        for (int i = 0; i < bins.length; i++) {
            int x = margin + i * binWidth;
            int binHeight = (int)((bins[i] / (double) max) * (height - 2 * margin));
            int y = height - margin - binHeight;

            g2.setColor(Color.LIGHT_GRAY);
            g2.fillRect(x, y, binWidth - 2, binHeight);
            g2.setColor(Color.WHITE);
            g2.drawRect(x, y, binWidth - 2, binHeight);

            if (binWidth > 12 && bins.length <= 100) {
                g2.setFont(new Font("SansSerif", Font.PLAIN, 10));
                g2.drawString(String.valueOf(bins[i]), x, y - 2);
            }
        }

        g2.setColor(Color.WHITE);
        g2.setFont(new Font("SansSerif", Font.PLAIN, 12));
        g2.drawString("Bins (agrupaciones de posiciones de la tabla hash, son 100 bins donde cada uno abarca 655 posiciones aprox)", 100, height - 20);

    }
}