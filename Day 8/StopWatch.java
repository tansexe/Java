import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class StopWatch extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedTime;
    private boolean isRunning;

    public StopWatch() {
        setTitle("Stop Watch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Create the GUI components
        JPanel panel = new JPanel();
        timeLabel = new JLabel("00:00:00");
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        // Add the components to the panel
        panel.add(timeLabel);
        panel.add(startButton);
        panel.add(stopButton);
        panel.add(resetButton);

        // Add action listeners to the buttons
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Set the content pane and make the frame visible
        setContentPane(panel);
        setVisible(true);

        // Initialize the timer
        timer = new Timer(10, this);
        elapsedTime = 0;
        isRunning = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startTimer();
        } else if (e.getSource() == stopButton) {
            stopTimer();
        } else if (e.getSource() == resetButton) {
            resetTimer();
        } else if (e.getSource() == timer) {
            updateTime();
        }
    }

    private void startTimer() {
        if (!isRunning) {
            timer.start();
            isRunning = true;
        }
    }

    private void stopTimer() {
        if (isRunning) {
            timer.stop();
            isRunning = false;
        }
    }

    private void resetTimer() {
        if (isRunning) {
            stopTimer();
        }
        elapsedTime = 0;
        updateTimeLabel();
    }

    private void updateTime() {
        elapsedTime += 10;
        updateTimeLabel();
    }

    private void updateTimeLabel() {
        int hours = elapsedTime / (60 * 60 * 1000);
        int minutes = (elapsedTime / (60 * 1000)) % 60;
        int seconds = (elapsedTime / 1000) % 60;
        int milliseconds = (elapsedTime % 1000) / 10;
        timeLabel.setText(String.format("%02d:%02d:%02d.%02d", hours, minutes, seconds, milliseconds));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StopWatch();
            }
        });
    }
}