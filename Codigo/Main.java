
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends JFrame {
    private HashMap urlMap;

    public static void main(String[] werfwerf) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });        
    }

    public void initMap(){
        ObjectInputStream fileReader = null;
        try {
            File strg = new File("HashMap.ser");
            if (!strg.exists()) strg.createNewFile();
            fileReader = new ObjectInputStream(new FileInputStream("HashMap.ser"));
            urlMap = (HashMap) fileReader.readObject();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            urlMap = new HashMap();
        }
    }

    public Main() {
        super("Acortador de URLs");
        System.out.println("Inicializando...");
        long startTime = System.nanoTime();
        urlMap = null;
        System.out.println("Recuperando URLs...");
        initMap();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;
        System.out.println("Tiempo en inicializar: "+duration+"ms");
        initUI();
    }

    private void initUI() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 1, 10, 10));
        getContentPane().setBackground(Color.BLACK);

        JButton[] buttons = {
            new JButton("1. Agregar URL"),
            new JButton("2. Buscar URL"),
            new JButton("3. Recuperar URL"),
            new JButton("4. Eliminar URL"),
            new JButton("5. Mostrar histograma"),
            new JButton("6. Importar URLs"),
            new JButton("7. Salir")
        };
        
        for (JButton button : buttons) {
            button.setBackground(Color.GRAY); 
            button.setForeground(Color.WHITE);             
            add(button);
        }

        buttons[0].addActionListener(e -> agregarURL());
        buttons[1].addActionListener(e -> buscarURL());
        buttons[2].addActionListener(e -> recuperarURL());
        buttons[3].addActionListener(e -> eliminarURL());
        buttons[4].addActionListener(e -> mostrarHistograma());
        buttons[5].addActionListener(e -> importarURLsDesdeArchivo());
        buttons[6].addActionListener(e -> exit()); 
    }

    private void importarURLsDesdeArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto y CSV", "txt", "csv"));
        if (fileChooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) return;
        boolean error = false;
        for (File file : fileChooser.getSelectedFiles()) {
            try {
                procesarArchivo(file);
            } catch (Exception e) {
                error = true;
                System.err.println("Error procesando archivo: " + file.getName());
            }
        }
        JOptionPane.showMessageDialog(this, 
            error ? "Error en algunos archivos" : "Importación completada");
    }

    private void procesarArchivo(File file) throws Exception {
        String name = file.getName().toLowerCase();
        
        if (name.endsWith(".txt")) {
            procesarTXT(file);
        } else if (name.endsWith(".csv")) {
            procesarCSV(file);
        } else {
            throw new Exception("Formato no soportado");
        }
    }

    private void procesarTXT(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String url = line.trim();
                if (!url.isEmpty()) {
                    try {
                        urlMap.add(url);
                    } catch (Exception e) {
                        System.out.println("Error al agregar: "+url+". "+e.getMessage());
                    }
                }
            }
        }
    }

    private void procesarCSV(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] partes = line.split(",");
                for (String parte : partes) {
                    String url = parte.trim()
                                    .replaceAll("^\"|\"$", "")
                                    .replaceAll("^'|'$", "");
                    if (!url.isEmpty()) {
                        try {
                            urlMap.add(url);
                        } catch (Exception e) {
                            System.out.println("Error al agregar: "+url+". "+e.getMessage());
                        }
                    }
                }
            }
        }
    }
    private void agregarURL() {
        String longUrl = JOptionPane.showInputDialog(this, "Ingrese la URL larga:");
        if (longUrl == null) return;

        try {
            String shortUrl = urlMap.add(longUrl);
            JOptionPane.showMessageDialog(this, "URL corta generada: " + shortUrl);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void buscarURL() {
        String longUrl = JOptionPane.showInputDialog(this, "Ingrese la URL larga:");
        if (longUrl == null) return;

        try {
            String shortUrl = urlMap.shorten(longUrl);
            JOptionPane.showMessageDialog(this, "URL corta: " + shortUrl);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se encontró la URL.");
        }
    }

    private void recuperarURL() {
        String shortCode = JOptionPane.showInputDialog(this, "Ingrese la URL acortada:");
        if (shortCode == null) return;

        try {
            Link original = urlMap.getLink(shortCode);
            if (original != null) {
                JOptionPane.showMessageDialog(this, "URL original: " + original.getLink());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la URL original.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void eliminarURL() {
        String longUrl = JOptionPane.showInputDialog(this, "Ingrese la URL larga a eliminar:");
        if (longUrl != null) {
            try {                
                Link eliminado = urlMap.remove(longUrl);
                if (eliminado != null) {
                    JOptionPane.showMessageDialog(this, "URL eliminada");
                } else {
                    JOptionPane.showMessageDialog(this, "La URL no está registrada.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar: " + e.getMessage());
            }
        }
    }
    
    private void mostrarHistograma() {
        int[] datos = urlMap.histograma(100);
        JFrame frame = new JFrame("Histograma de URLs");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new Histograma(datos));
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }

    public void exit(){
        ObjectOutputStream guardar = null;
        try {
            guardar = new ObjectOutputStream(new FileOutputStream("HashMap.ser"));
            guardar.writeObject(urlMap);
            guardar.close();
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
        }
        System.exit(0);
    }
}