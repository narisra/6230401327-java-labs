/**
 * This program is to create a class called MySimpleWindow which extends from class JFrame.
 * The class has a panel and two buttons. It also has methods to add components and set the features of the frame.
 * 
 * Author: Chattipoom Sirimul
 * ID: 623040132-7
 * Section: 1
 * Date: January 19, 2020
 */

package sirimul.chattipoom.lab6;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.SwingUtilities;

public class MySimpleWindow extends JFrame {
    // Quick fix warning: Java(536871008) ~ Searched from Google.
    private static final long serialVersionUID = -5235778330626143850L;

    // Constant variables.
    private static final String defaultFrameTitle = "MySimpleWindow Title";
    private static final String cancelButtonString = "Cancel";
    private static final String okButtonString = "Ok";

    // ---------- Components ----------
    protected JPanel mainPanel;
    protected JPanel buttonPanel;

    protected JButton cancelButton;
    protected JButton okButton;
    // ---------- ---------- ----------

    // A default constructor
    public MySimpleWindow() {
        // Set a default frame's title of this object.
        super(defaultFrameTitle);
    }

    // A constructor with one parameter: frame's title.
    public MySimpleWindow(String _frameTitle) {
        // Set a frame's title of this object.
        super(_frameTitle);
    }

    // A method for initializing components
    protected void createComponents() {
        // Create JPanels
        this.mainPanel = new JPanel(new BorderLayout());
        this.buttonPanel = new JPanel();

        // Create JButtons for this object.
        this.cancelButton = new JButton(cancelButtonString);
        this.okButton = new JButton(okButtonString);
    }

    // A method for adding components to the main frame.
    protected void addComponents() {
        // Add the buttons to the main panel.
        this.buttonPanel.add(this.cancelButton);
        this.buttonPanel.add(this.okButton);

        // Add the button panel to the main panel and put it at the end.
        this.mainPanel.add(this.buttonPanel, BorderLayout.PAGE_END);

        // Add the main panel to the main frame. (Put it at the center)
        this.add(this.mainPanel);
    }

    // A method for setting frame's features.
    protected void setFrameFeatures() {
        // Set the JFrame's sizes automatically by using pack().
        this.pack();
        // Make the JFrame visible.
        this.setVisible(true);
        // The program exit when the user clicks to close a frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the window location at the center of the screen.
        this.setLocationRelativeTo(null);
    }

    public static void createAndShowGUI() {
        final MySimpleWindow msw = new MySimpleWindow("My Simple Window");

        // Initialize components
        msw.createComponents();

        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
