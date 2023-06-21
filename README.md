Marketplace stage repo

This is the script for stage.marketplace.akc.org

To set up follow the steps below:

1. Clone the repo
2. Set/download the current webdrivers
3. Set the IDE JDK or use the VM that corresponds to your Java v runtime.

The structure

a. Helpers folder contains/explains how drivers and data is being used.
b. Model contains the strings that we use on our tests.
c. Pages contains all the project pages and elements.
d. Resources.Data contains all data files and users.
e. Specs contains all the specs, Base classes and how the driver is being manage.
f. POM.xml contains all project dependencies including Selenium Webdriver.

To run tests

Tests can be run from the MPTestSuite Class OR you can run them in parallel using multithreading from the testng.xml file
