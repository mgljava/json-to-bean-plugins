package com.github.mgljava.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FileChooserListener implements ActionListener {

  private final JTextField jTextField;

  public FileChooserListener(JTextField jTextField) {
    this.jTextField = jTextField;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    chooser.showDialog(new JLabel(), "就是它了");
    File file = chooser.getSelectedFile();
    jTextField.setText(file.getAbsoluteFile().toString());
  }
}
