# Login Data Generator <img src="/images/icons/icon.png" alt="Icon" width="30" height="30">

**Login Data Generator Advanced** is a more feature-rich version of my previous project **Login Data Generator**.  
It's a simple desktop application that generates random usernames and passwords, with the option to customize the maximum number of uppercase, lowercase, special characters, and digits.

Users can also change the user interface with themes such as light or dark.  
This program is especially useful for developers, testers, or anyone who needs quick and customizable login data.  
The application features a clean and user-friendly UI built with JavaFX.

---

## 🔧 Features

* **Random Username Generator**  
  Easily generate usernames consisting of letters and/or numbers.

* **Random Password Generator**  
  Generate secure passwords with adjustable length and complexity.

* **Custom Character Settings**  
  Set the maximum number of uppercase/lowercase characters, digits, and special characters for both usernames and passwords.

* **Custom UI Themes**  
  Choose between different themes like dark and light to optimize the user experience.

* **Copy to Clipboard**  
  Instantly copy generated usernames and passwords with a single click.

* **Simple JavaFX UI**  
  Lightweight and intuitive graphical interface using JavaFX.

---

## 🖼️ User Interface

The UI consists of the following elements:

* Input fields to set the maximum number of letters, digits, and special characters for usernames and passwords
* "Generate" buttons for username and password
* Text fields to display the generated values
* "Copy" buttons to copy the generated data to the clipboard

Example layout (structure may vary):  
![Login-Data-Generator_UI](/images/screenshots/app.png)

---

## 🛠️ Technologies Used

* **Java 23**
* **JavaFX** for UI design
* **Maven**

---

## 🚀 Getting Started

To run the project (requires the `.jar` file to be built):

```bash
git clone https://github.com/DK-DaKnight/login-data-generator-advanced.git
cd login-data-generator-advanced
mvn clean install
java -jar target/LoginDataGenerator.jar
```
---

## 📂 Project Structure

```
└── login-data-generator-advanced/
    └── src/
        ├── main/
        │   ├── java/
        │   │   ├── com/daknight/logindatagenerator/
        │   │   │   ├── ui/
        │   │   │   │   ├── grid/
        │   │   │   │   │   └── GridBuilder.java
        │   │   │   │   ├── menu/
        │   │   │   │   │   ├── settings/
        │   │   │   │   │   │   ├── config/
        │   │   │   │   │   │   │   ├── Config.java
        │   │   │   │   │   │   │   ├── PasswordSettings.java
        │   │   │   │   │   │   │   ├── ThemeSettings.java
        │   │   │   │   │   │   │   └── UsernameSettings.java
        │   │   │   │   │   │   └── SettingsWindow.java
        │   │   │   │   │   └── MenuBarBuilder.java
        │   │   │   │   └── LoginDataGeneratorUI.java
        │   │   │   ├── utils/
        │   │   │   │   ├── generators/
        │   │   │   │   │   ├── PasswordGenerator.java
        │   │   │   │   │   └── UsernameGenerator.java
        │   │   │   │   └── lib/
        │   │   │   │       ├── arrays/
        │   │   │   │       │   ├── Characters.java
        │   │   │   │       │   └── Numbers.java
        │   │   │   │       └── style/
        │   │   │   │           └── uielements/
        │   │   │   │               ├── ButtonStyle.java
        │   │   │   │               ├── ListViewStyle.java
        │   │   │   │               ├── SpinnerStyle.java
        │   │   │   │               └── TextElementsStyle.java
        │   │   │   └── AppLauncher.java
        │   │   └── module-info.java
        │   └── resources/
        │       └── com/daknight/logindatagenerator/logindatagenerator/
        │           └── hello-view.fxml
        └── test/
            └── java/
                └── com/daknight/logindatagenerator/
                    └── util/
                        ├── generators/
                        │   ├── PasswordGeneratorTest.java
                        │   └── UsernameGeneratorTest.java
                        └── lib/
                            └── arrays/
                                ├── CharactersTest.java
                                └── NumbersTest.java
```

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 🙋‍♂️ Author

**DK-DaKnight**
GitHub: [DK-DaKnight](https://github.com/yourusername)