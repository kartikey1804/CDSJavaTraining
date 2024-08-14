import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class RestaurantBilling extends JFrame {
    private JTextArea orderTextArea;
    private JLabel totalLabel;
    private double totalAmount = 0.0;
    private ArrayList<MenuItem> orderList = new ArrayList<>();

    public RestaurantBilling() {
        // Set up the main frame
        setTitle("Restaurant Billing System");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create menu panel
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 2));

        // Define menu items
        String[] items = {"Burger", "Pizza", "Pasta", "Salad", "Soda"};
        double[] prices = {5.99, 7.99, 6.99, 4.99, 1.99};

        // Add menu items to the menu panel
        for (int i = 0; i < items.length; i++) {
            JButton button = new JButton(items[i] + " ($" + prices[i] + ")");
            double price = prices[i];
            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    addItemToOrder(items[finalI], price);
                }
            });
            menuPanel.add(button);
        }

        // Create order panel
        JPanel orderPanel = new JPanel();
        orderPanel.setLayout(new BorderLayout());

        // Order text area
        orderTextArea = new JTextArea();
        orderTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderTextArea);
        orderPanel.add(scrollPane, BorderLayout.CENTER);

        // Total label
        totalLabel = new JLabel("Total: $0.00");
        orderPanel.add(totalLabel, BorderLayout.SOUTH);

        // Add panels to the frame
        add(menuPanel, BorderLayout.NORTH);
        add(orderPanel, BorderLayout.CENTER);

        // Create bottom panel for bill generation
        JPanel bottomPanel = new JPanel();
        JButton generateBillButton = new JButton("Generate Bill");
        generateBillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateBill();
            }
        });
        bottomPanel.add(generateBillButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);
    }

    private void addItemToOrder(String itemName, double price) {
        orderList.add(new MenuItem(itemName, price));
        totalAmount += price;
        updateOrderTextArea();
    }

    private void updateOrderTextArea() {
        orderTextArea.setText("");
        for (MenuItem item : orderList) {
            orderTextArea.append(item.getName() + " - $" + item.getPrice() + "\n");
        }
        totalLabel.setText("Total: $" + String.format("%.2f", totalAmount));
    }

    private void generateBill() {
        JOptionPane.showMessageDialog(this, "Total amount to be paid: $" + String.format("%.2f", totalAmount), "Bill", JOptionPane.INFORMATION_MESSAGE);
        // Clear order
        orderList.clear();
        totalAmount = 0.0;
        updateOrderTextArea();
    }

    public static void main(String[] args) {
        new RestaurantBilling();
    }

    class MenuItem {
        private String name;
        private double price;

        public MenuItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
