package VideoManagementSystem;

/**
 *
 * @author Larry
 * @author Georgia
 */
public class videoRentalGUI extends javax.swing.JFrame {

    
    public videoRentalGUI() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainTabPanel = new javax.swing.JTabbedPane();
        mainCustomerTab = new javax.swing.JPanel();
        customerSubTabs = new javax.swing.JTabbedPane();
        customerAdd = new javax.swing.JPanel();
        addCustomerButton = new javax.swing.JButton();
        addCustomerNameLabel = new javax.swing.JLabel();
        addCustomerLastNameText = new javax.swing.JTextField();
        addCustomerLastNameLabel = new javax.swing.JLabel();
        addCustomerFirstNameLabel = new javax.swing.JLabel();
        addCustomerFirstNameText = new javax.swing.JTextField();
        addCustomerPhoneLabel = new javax.swing.JLabel();
        addCustomerPhoneNumberText = new javax.swing.JTextField();
        addCustomerAddressLabel = new javax.swing.JLabel();
        addCustomerStreet = new javax.swing.JLabel();
        addCustomerStreetAddressText = new javax.swing.JTextField();
        addCustomerCityLabel = new javax.swing.JLabel();
        addCustomerCityText = new javax.swing.JTextField();
        addCustomerStateLabel = new javax.swing.JLabel();
        addCustomerStateText = new javax.swing.JTextField();
        addCustomerZipLabel = new javax.swing.JLabel();
        addCustomerZipText = new javax.swing.JTextField();
        customerDelete = new javax.swing.JPanel();
        deleteCustomerButton = new javax.swing.JButton();
        customerListDropDownList = new javax.swing.JComboBox();
        customerQuery = new javax.swing.JPanel();
        queryCustomerLastNameText = new javax.swing.JTextField();
        queryCustomerFirstNameLabel = new javax.swing.JLabel();
        queryCustomerPhoneLabel = new javax.swing.JLabel();
        queryCustomerLastNameLabel = new javax.swing.JLabel();
        queryCustomerFirstNameText = new javax.swing.JTextField();
        queryCustomerButton = new javax.swing.JButton();
        queryCustomerPhoneNumberText = new javax.swing.JTextField();
        queryCustomerNameAddLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        mainInventoryTab = new javax.swing.JPanel();
        inventorySubTabs = new javax.swing.JTabbedPane();
        movieAdd = new javax.swing.JPanel();
        addMovieButton = new javax.swing.JButton();
        addMovieIDLabel = new javax.swing.JLabel();
        addMovieIDText = new javax.swing.JTextField();
        addMovieTitleLabel = new javax.swing.JLabel();
        addMovieTitleText = new javax.swing.JTextField();
        addMovieTypeLabel = new javax.swing.JLabel();
        addMovieTypeDropDownText = new javax.swing.JComboBox();
        addMovieRatingLabel = new javax.swing.JLabel();
        addMovieRatingText = new javax.swing.JTextField();
        addMovieLengthLabel = new javax.swing.JLabel();
        addMovieLengthText = new javax.swing.JTextField();
        addMovieYearLabel = new javax.swing.JLabel();
        addMovieYearText = new javax.swing.JTextField();
        addMovieDirectorLabel = new javax.swing.JLabel();
        addMovieDirectorText = new javax.swing.JTextField();
        movieRemove = new javax.swing.JPanel();
        removeMovieIDText = new javax.swing.JTextField();
        removeMovieIDLabel = new javax.swing.JLabel();
        removeMovieButton = new javax.swing.JButton();
        movieQuery = new javax.swing.JPanel();
        queryMovieIDText = new javax.swing.JTextField();
        queryMovieIDLabel = new javax.swing.JLabel();
        queryMovieTitleLabel = new javax.swing.JLabel();
        queryMovieTitleText = new javax.swing.JTextField();
        queryMovieTypeLabel = new javax.swing.JLabel();
        queryMovieTypeDropDownText = new javax.swing.JComboBox();
        queryMovieRatingText = new javax.swing.JTextField();
        queryMovieRatingLabel = new javax.swing.JLabel();
        queryMovieLengthLabel = new javax.swing.JLabel();
        queryMovieLengthText = new javax.swing.JTextField();
        queryMovieYearText = new javax.swing.JTextField();
        queryMovieYearLabel = new javax.swing.JLabel();
        queryMovieDirectorText = new javax.swing.JTextField();
        queryMovieDirectorLabel = new javax.swing.JLabel();
        queryMovieButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollBar1 = new javax.swing.JScrollBar();
        jButton2 = new javax.swing.JButton();
        mainTransactionsTab = new javax.swing.JPanel();
        transactionsSubTab = new javax.swing.JTabbedPane();
        transactionsCheckOutTab = new javax.swing.JPanel();
        transactionsCheckOutCustomerIDLabel = new javax.swing.JLabel();
        transactionsCheckOutCustomerIDText = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        transactionsCheckOutButton = new javax.swing.JButton();
        transactionsCheckOutLateFeeButton = new javax.swing.JButton();
        jScrollBar3 = new javax.swing.JScrollBar();
        transactionsCheckOutSearchButton = new javax.swing.JButton();
        transactionsCheckInTab = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        transactionsCheckInButton = new javax.swing.JButton();
        transactionsCheckInLateFeeButton = new javax.swing.JButton();
        jScrollBar2 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Rental Program Group 5");

        mainTabPanel.setBorder(new javax.swing.border.MatteBorder(null));
        mainTabPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        addCustomerButton.setText("Add");

        addCustomerNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addCustomerNameLabel.setText("Customer Name");

        addCustomerLastNameLabel.setText("Last");

        addCustomerFirstNameLabel.setText("First");

        addCustomerFirstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerFirstNameTextActionPerformed(evt);
            }
        });

        addCustomerPhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addCustomerPhoneLabel.setText("Phone Number");

        addCustomerPhoneNumberText.setToolTipText("1-222-222-2222");

        addCustomerAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addCustomerAddressLabel.setText("Customer Address");

        addCustomerStreet.setText("Street Address");

        addCustomerStreetAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerStreetAddressTextActionPerformed(evt);
            }
        });

        addCustomerCityLabel.setText("City");

        addCustomerCityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerCityTextActionPerformed(evt);
            }
        });

        addCustomerStateLabel.setText("State");

        addCustomerZipLabel.setText("Zip Code");

        javax.swing.GroupLayout customerAddLayout = new javax.swing.GroupLayout(customerAdd);
        customerAdd.setLayout(customerAddLayout);
        customerAddLayout.setHorizontalGroup(
            customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerAddLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerAddLayout.createSequentialGroup()
                        .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(customerAddLayout.createSequentialGroup()
                                    .addComponent(addCustomerLastNameLabel)
                                    .addGap(95, 95, 95)
                                    .addComponent(addCustomerFirstNameLabel))
                                .addComponent(addCustomerPhoneLabel)
                                .addGroup(customerAddLayout.createSequentialGroup()
                                    .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addCustomerPhoneNumberText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addCustomerNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addCustomerLastNameText, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(addCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(addCustomerAddressLabel)
                                .addComponent(addCustomerStreet)
                                .addComponent(addCustomerStreetAddressText))
                            .addGroup(customerAddLayout.createSequentialGroup()
                                .addComponent(addCustomerCityLabel)
                                .addGap(102, 102, 102)
                                .addComponent(addCustomerStateLabel)
                                .addGap(92, 92, 92)
                                .addComponent(addCustomerZipLabel))
                            .addGroup(customerAddLayout.createSequentialGroup()
                                .addComponent(addCustomerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addCustomerStateText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(addCustomerZipText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 179, Short.MAX_VALUE)))
                .addContainerGap())
        );
        customerAddLayout.setVerticalGroup(
            customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCustomerNameLabel)
                .addGap(5, 5, 5)
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerLastNameLabel)
                    .addComponent(addCustomerFirstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerPhoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerStreet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerStreetAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerCityLabel)
                    .addComponent(addCustomerStateLabel)
                    .addComponent(addCustomerZipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerStateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(addCustomerButton)
                .addContainerGap())
        );

        customerSubTabs.addTab("New Customer", customerAdd);

        deleteCustomerButton.setText("Delete");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });

        customerListDropDownList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Customer 1", "Customer 2", "Customer 3", "Customer 4" }));

        javax.swing.GroupLayout customerDeleteLayout = new javax.swing.GroupLayout(customerDelete);
        customerDelete.setLayout(customerDeleteLayout);
        customerDeleteLayout.setHorizontalGroup(
            customerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDeleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(customerDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerListDropDownList, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customerDeleteLayout.setVerticalGroup(
            customerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerListDropDownList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addComponent(deleteCustomerButton)
                .addContainerGap())
        );

        customerSubTabs.addTab("Remove Customer", customerDelete);

        queryCustomerFirstNameLabel.setText("First");

        queryCustomerPhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        queryCustomerPhoneLabel.setText("Phone Number");

        queryCustomerLastNameLabel.setText("Last");

        queryCustomerFirstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryCustomerFirstNameTextActionPerformed(evt);
            }
        });

        queryCustomerButton.setText("Search");

        queryCustomerPhoneNumberText.setToolTipText("1-222-222-2222");

        queryCustomerNameAddLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        queryCustomerNameAddLabel.setText("Customer Name");

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "List 1", "List 2", "List 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jButton1.setText("Edit");

        javax.swing.GroupLayout customerQueryLayout = new javax.swing.GroupLayout(customerQuery);
        customerQuery.setLayout(customerQueryLayout);
        customerQueryLayout.setHorizontalGroup(
            customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerQueryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(queryCustomerNameAddLabel)
                            .addComponent(queryCustomerLastNameLabel)
                            .addComponent(queryCustomerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerFirstNameLabel)
                            .addComponent(queryCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerPhoneLabel)
                            .addComponent(queryCustomerPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        customerQueryLayout.setVerticalGroup(
            customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerQueryLayout.createSequentialGroup()
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(queryCustomerNameAddLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerLastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerFirstNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerPhoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryCustomerButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        customerSubTabs.addTab("Search Customer", customerQuery);

        javax.swing.GroupLayout mainCustomerTabLayout = new javax.swing.GroupLayout(mainCustomerTab);
        mainCustomerTab.setLayout(mainCustomerTabLayout);
        mainCustomerTabLayout.setHorizontalGroup(
            mainCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerSubTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        mainCustomerTabLayout.setVerticalGroup(
            mainCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerSubTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        mainTabPanel.addTab("Customers", mainCustomerTab);

        addMovieButton.setText("Add");

        addMovieIDLabel.setText("Movie ID");

        addMovieIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieIDTextActionPerformed(evt);
            }
        });

        addMovieTitleLabel.setText("Title");

        addMovieTypeLabel.setText("Type");

        addMovieTypeDropDownText.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horror", "SciFi", "Drama", "Romance" }));

        addMovieRatingLabel.setText("Rating");

        addMovieLengthLabel.setText("Length");

        addMovieYearLabel.setText("Year");

        addMovieDirectorLabel.setText("Director");

        javax.swing.GroupLayout movieAddLayout = new javax.swing.GroupLayout(movieAdd);
        movieAdd.setLayout(movieAddLayout);
        movieAddLayout.setHorizontalGroup(
            movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(movieAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addMovieDirectorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMovieYearLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMovieLengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMovieRatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMovieTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMovieTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMovieIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addMovieIDText)
                    .addComponent(addMovieTitleText)
                    .addComponent(addMovieTypeDropDownText, 0, 115, Short.MAX_VALUE)
                    .addComponent(addMovieRatingText)
                    .addComponent(addMovieLengthText)
                    .addComponent(addMovieYearText)
                    .addComponent(addMovieDirectorText))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        movieAddLayout.setVerticalGroup(
            movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieIDLabel)
                    .addComponent(addMovieIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieTitleLabel)
                    .addComponent(addMovieTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieTypeLabel)
                    .addComponent(addMovieTypeDropDownText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieRatingLabel)
                    .addComponent(addMovieRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMovieLengthLabel)
                    .addComponent(addMovieLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieYearLabel)
                    .addComponent(addMovieYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieDirectorLabel)
                    .addComponent(addMovieDirectorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(addMovieButton)
                .addContainerGap())
        );

        inventorySubTabs.addTab("Add Movie", movieAdd);

        removeMovieIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMovieIDTextActionPerformed(evt);
            }
        });

        removeMovieIDLabel.setText("Movie ID");

        removeMovieButton.setText("Delete");

        javax.swing.GroupLayout movieRemoveLayout = new javax.swing.GroupLayout(movieRemove);
        movieRemove.setLayout(movieRemoveLayout);
        movieRemoveLayout.setHorizontalGroup(
            movieRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieRemoveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeMovieIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeMovieIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieRemoveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        movieRemoveLayout.setVerticalGroup(
            movieRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieRemoveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeMovieIDLabel)
                    .addComponent(removeMovieIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(removeMovieButton)
                .addContainerGap())
        );

        inventorySubTabs.addTab("Remove Movie", movieRemove);

        queryMovieIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryMovieIDTextActionPerformed(evt);
            }
        });

        queryMovieIDLabel.setText("Movie ID");

        queryMovieTitleLabel.setText("Title");

        queryMovieTypeLabel.setText("Type");

        queryMovieTypeDropDownText.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horror", "SciFi", "Drama", "Romance" }));

        queryMovieRatingLabel.setText("Rating");

        queryMovieLengthLabel.setText("Length");

        queryMovieYearLabel.setText("Year");

        queryMovieDirectorLabel.setText("Director");

        queryMovieButton.setText("Search");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "List 1", "List 2", "List 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Edit");

        javax.swing.GroupLayout movieQueryLayout = new javax.swing.GroupLayout(movieQuery);
        movieQuery.setLayout(movieQueryLayout);
        movieQueryLayout.setHorizontalGroup(
            movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(movieQueryLayout.createSequentialGroup()
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addComponent(queryMovieIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieIDText))
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(queryMovieDirectorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(queryMovieYearLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(queryMovieLengthLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(queryMovieRatingLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(queryMovieTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(queryMovieTitleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(queryMovieTitleText, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(queryMovieTypeDropDownText, 0, 115, Short.MAX_VALUE)
                                    .addComponent(queryMovieRatingText)
                                    .addComponent(queryMovieLengthText)
                                    .addComponent(queryMovieYearText)
                                    .addComponent(queryMovieDirectorText))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieQueryLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        movieQueryLayout.setVerticalGroup(
            movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(movieQueryLayout.createSequentialGroup()
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieIDLabel)
                            .addComponent(queryMovieIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieTitleLabel)
                            .addComponent(queryMovieTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieTypeLabel)
                            .addComponent(queryMovieTypeDropDownText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieRatingLabel)
                            .addComponent(queryMovieRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieLengthLabel)
                            .addComponent(queryMovieLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieYearLabel)
                            .addComponent(queryMovieYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieDirectorLabel)
                            .addComponent(queryMovieDirectorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryMovieButton)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        inventorySubTabs.addTab("Search Movie", movieQuery);

        javax.swing.GroupLayout mainInventoryTabLayout = new javax.swing.GroupLayout(mainInventoryTab);
        mainInventoryTab.setLayout(mainInventoryTabLayout);
        mainInventoryTabLayout.setHorizontalGroup(
            mainInventoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventorySubTabs)
        );
        mainInventoryTabLayout.setVerticalGroup(
            mainInventoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainInventoryTabLayout.createSequentialGroup()
                .addComponent(inventorySubTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainTabPanel.addTab("Inventory", mainInventoryTab);

        transactionsCheckOutCustomerIDLabel.setText("Customer ID");

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "List 1", "List 2", "List 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        transactionsCheckOutButton.setText("Check Out");

        transactionsCheckOutLateFeeButton.setText("Late Fee");

        transactionsCheckOutSearchButton.setText("Search");

        javax.swing.GroupLayout transactionsCheckOutTabLayout = new javax.swing.GroupLayout(transactionsCheckOutTab);
        transactionsCheckOutTab.setLayout(transactionsCheckOutTabLayout);
        transactionsCheckOutTabLayout.setHorizontalGroup(
            transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                        .addComponent(transactionsCheckOutCustomerIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutCustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 269, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionsCheckOutTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(transactionsCheckOutLateFeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        transactionsCheckOutTabLayout.setVerticalGroup(
            transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionsCheckOutCustomerIDLabel)
                    .addComponent(transactionsCheckOutCustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionsCheckOutSearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionsCheckOutButton)
                    .addComponent(transactionsCheckOutLateFeeButton))
                .addContainerGap())
        );

        transactionsSubTab.addTab("Check Out", transactionsCheckOutTab);

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "List 1", "List 2", "List 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        transactionsCheckInButton.setText("Check In");
        transactionsCheckInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsCheckInButtonActionPerformed(evt);
            }
        });

        transactionsCheckInLateFeeButton.setText("Late Fee");

        javax.swing.GroupLayout transactionsCheckInTabLayout = new javax.swing.GroupLayout(transactionsCheckInTab);
        transactionsCheckInTab.setLayout(transactionsCheckInTabLayout);
        transactionsCheckInTabLayout.setHorizontalGroup(
            transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionsCheckInTabLayout.createSequentialGroup()
                        .addGap(0, 347, Short.MAX_VALUE)
                        .addComponent(transactionsCheckInLateFeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        transactionsCheckInTabLayout.setVerticalGroup(
            transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionsCheckInButton)
                    .addComponent(transactionsCheckInLateFeeButton))
                .addContainerGap())
        );

        transactionsSubTab.addTab("Check In", transactionsCheckInTab);

        javax.swing.GroupLayout mainTransactionsTabLayout = new javax.swing.GroupLayout(mainTransactionsTab);
        mainTransactionsTab.setLayout(mainTransactionsTabLayout);
        mainTransactionsTabLayout.setHorizontalGroup(
            mainTransactionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactionsSubTab)
        );
        mainTransactionsTabLayout.setVerticalGroup(
            mainTransactionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactionsSubTab)
        );

        mainTabPanel.addTab("Transactions", mainTransactionsTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void addCustomerFirstNameTextActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO 
    }                                                        

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO 
    }                                                    

    private void addCustomerStreetAddressTextActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        // TODO 
    }                                                            

    private void addCustomerCityTextActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO 
    }                                                   

    private void queryCustomerFirstNameTextActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO 
    }                                                          

    private void addMovieIDTextActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO 
    }                                              

    private void removeMovieIDTextActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO 
    }                                                 

    private void queryMovieIDTextActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO 
    }                                                

    private void transactionsCheckInButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO 
    }                                                         

    public static void main(String args[]) {
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(videoRentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(videoRentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(videoRentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(videoRentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new videoRentalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel addCustomerAddressLabel;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JLabel addCustomerCityLabel;
    private javax.swing.JTextField addCustomerCityText;
    private javax.swing.JLabel addCustomerFirstNameLabel;
    private javax.swing.JTextField addCustomerFirstNameText;
    private javax.swing.JLabel addCustomerLastNameLabel;
    private javax.swing.JTextField addCustomerLastNameText;
    private javax.swing.JLabel addCustomerNameLabel;
    private javax.swing.JLabel addCustomerPhoneLabel;
    private javax.swing.JTextField addCustomerPhoneNumberText;
    private javax.swing.JLabel addCustomerStateLabel;
    private javax.swing.JTextField addCustomerStateText;
    private javax.swing.JLabel addCustomerStreet;
    private javax.swing.JTextField addCustomerStreetAddressText;
    private javax.swing.JLabel addCustomerZipLabel;
    private javax.swing.JTextField addCustomerZipText;
    private javax.swing.JButton addMovieButton;
    private javax.swing.JLabel addMovieDirectorLabel;
    private javax.swing.JTextField addMovieDirectorText;
    private javax.swing.JLabel addMovieIDLabel;
    private javax.swing.JTextField addMovieIDText;
    private javax.swing.JLabel addMovieLengthLabel;
    private javax.swing.JTextField addMovieLengthText;
    private javax.swing.JLabel addMovieRatingLabel;
    private javax.swing.JTextField addMovieRatingText;
    private javax.swing.JLabel addMovieTitleLabel;
    private javax.swing.JTextField addMovieTitleText;
    private javax.swing.JComboBox addMovieTypeDropDownText;
    private javax.swing.JLabel addMovieTypeLabel;
    private javax.swing.JLabel addMovieYearLabel;
    private javax.swing.JTextField addMovieYearText;
    private javax.swing.JPanel customerAdd;
    private javax.swing.JPanel customerDelete;
    private javax.swing.JComboBox customerListDropDownList;
    private javax.swing.JPanel customerQuery;
    private javax.swing.JTabbedPane customerSubTabs;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JTabbedPane inventorySubTabs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainCustomerTab;
    private javax.swing.JPanel mainInventoryTab;
    private javax.swing.JTabbedPane mainTabPanel;
    private javax.swing.JPanel mainTransactionsTab;
    private javax.swing.JPanel movieAdd;
    private javax.swing.JPanel movieQuery;
    private javax.swing.JPanel movieRemove;
    private javax.swing.JButton queryCustomerButton;
    private javax.swing.JLabel queryCustomerFirstNameLabel;
    private javax.swing.JTextField queryCustomerFirstNameText;
    private javax.swing.JLabel queryCustomerLastNameLabel;
    private javax.swing.JTextField queryCustomerLastNameText;
    private javax.swing.JLabel queryCustomerNameAddLabel;
    private javax.swing.JLabel queryCustomerPhoneLabel;
    private javax.swing.JTextField queryCustomerPhoneNumberText;
    private javax.swing.JButton queryMovieButton;
    private javax.swing.JLabel queryMovieDirectorLabel;
    private javax.swing.JTextField queryMovieDirectorText;
    private javax.swing.JLabel queryMovieIDLabel;
    private javax.swing.JTextField queryMovieIDText;
    private javax.swing.JLabel queryMovieLengthLabel;
    private javax.swing.JTextField queryMovieLengthText;
    private javax.swing.JLabel queryMovieRatingLabel;
    private javax.swing.JTextField queryMovieRatingText;
    private javax.swing.JLabel queryMovieTitleLabel;
    private javax.swing.JTextField queryMovieTitleText;
    private javax.swing.JComboBox queryMovieTypeDropDownText;
    private javax.swing.JLabel queryMovieTypeLabel;
    private javax.swing.JLabel queryMovieYearLabel;
    private javax.swing.JTextField queryMovieYearText;
    private javax.swing.JButton removeMovieButton;
    private javax.swing.JLabel removeMovieIDLabel;
    private javax.swing.JTextField removeMovieIDText;
    private javax.swing.JButton transactionsCheckInButton;
    private javax.swing.JButton transactionsCheckInLateFeeButton;
    private javax.swing.JPanel transactionsCheckInTab;
    private javax.swing.JButton transactionsCheckOutButton;
    private javax.swing.JLabel transactionsCheckOutCustomerIDLabel;
    private javax.swing.JTextField transactionsCheckOutCustomerIDText;
    private javax.swing.JButton transactionsCheckOutLateFeeButton;
    private javax.swing.JButton transactionsCheckOutSearchButton;
    private javax.swing.JPanel transactionsCheckOutTab;
    private javax.swing.JTabbedPane transactionsSubTab;
    // End of variables declaration                   
}
