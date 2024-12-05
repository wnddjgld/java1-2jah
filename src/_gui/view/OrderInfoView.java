package _gui.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class OrderInfoView extends JPanel {

    JPanel panN = new JPanel(new GridLayout(2, 1));
    JPanel panC = new JPanel();
    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JTextField tfSearch = new JTextField(20);
    DefaultTableModel tableModel;
    JTable table;
    String[] header = {"주문번호", "주문고객", "주문제품", "수량", "배송지", "주문일자"};

    public OrderInfoView() {
        setLayout(new BorderLayout()); //FLowLayout 으로 설정
        panN.add(pan1);
        panN.add(pan2);
        add(panN, "NORTH");
        add(panC, "Center");
        addPan1();
        addPan2();
        addTable();
    }

    public void addPan1() {
        JLabel lblTitle = new JLabel("검색 프로그램");
        pan1.add(lblTitle);
    }

    public void addPan2() {
        JLabel lblSearch = new JLabel("검색어: ");
        JButton btnSearch = new JButton("검색");
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
    }

    public void addTable() {
        tableModel = new DefaultTableModel(header, 15) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        panC.add(scrollPane);
    }
}