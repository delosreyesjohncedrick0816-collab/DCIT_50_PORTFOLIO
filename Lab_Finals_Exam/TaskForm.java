package ui;

import controller.TaskManager;
import model.Task;

import javax.swing.*;
import java.awt.*;

public class TaskForm extends JFrame {

    private JTextField txtId, txtName;
    private JTextArea txtDescription;
    private JComboBox<String> cmbStatus;

    private TaskManager taskManager;
    private MainWindow mainWindow;

    public TaskForm(MainWindow mainWindow, TaskManager taskManager) {
        this.mainWindow = mainWindow;
        this.taskManager = taskManager;

        setTitle("Add Task");
        setSize(400, 300);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2, 5, 5));

        txtId = new JTextField(String.valueOf(taskManager.generateTaskId()));
        txtId.setEditable(false);

        txtName = new JTextField();
        txtDescription = new JTextArea();

        cmbStatus = new JComboBox<>(new String[]{
                "NOT STARTED", "ONGOING", "DONE"
        });

        JButton btnSave = new JButton("Save Task");
        btnSave.addActionListener(e -> saveTask());

        add(new JLabel("Task ID:"));
        add(txtId);

        add(new JLabel("Task Name:"));
        add(txtName);

        add(new JLabel("Task Description:"));
        add(new JScrollPane(txtDescription));

        add(new JLabel("Status:"));
        add(cmbStatus);

        add(new JLabel());
        add(btnSave);
    }

    private void saveTask() {
        if (txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Task Name is required");
            return;
        }

        Task task = new Task(
                Integer.parseInt(txtId.getText()),
                txtName.getText(),
                txtDescription.getText(),
                cmbStatus.getSelectedItem().toString()
        );

        taskManager.addTask(task);
        mainWindow.refreshTable();
        dispose();
    }
}
