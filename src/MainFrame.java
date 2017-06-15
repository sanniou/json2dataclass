import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by yujichang on 2017/6/14.
 */
public class MainFrame extends JDialog {
    private JPanel jP;
    private JButton button1;
    private JTextArea textArea1;
    private OnClickListener onclickListener;

    public MainFrame() {
        init();
        setContentPane(jP);
        setModal(true);
        setTitle("Json2DataClass");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void init() {
        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (onclickListener != null) {
                    onclickListener.onClick(textArea1.getText());
                }
            }
        });
    }

    public void setOnclickListener(OnClickListener onclickListener) {
        this.onclickListener = onclickListener;
    }

    interface OnClickListener {
        void onClick(String text);
    }

}
