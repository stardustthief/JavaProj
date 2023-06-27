# JavaProj
This project is based on LP solutions (http://lpsolutions.hu) coding task – creating a HTML Code Generator.
The HTML CodeGenerator is a Java program that allows users to generate HTML code based on provided inputs such as name, email, and repositoryURL.

**********************************************************************************************************************

SYSTEM REQUIREMENTS
  ▫ Processor: 1 GHz or higher
  ▫ Memory: 1 GB RAM or higher
  ▫ Storage: 10 MB of free disk space

SOFTWARE REQUIREMENTS
  ▫ Java Development Kit (JDK) 8 or higher
  ▫ Operating System: Windows, macOS, or Linux

**********************************************************************************************************************

INSTALLATION AND SETUP

To install and set up the HTML Code Generator, follow these steps:
1. Download the source code files from the provided source.
2. Install the Java Development Kit (JDK) on your system if it is not already installed.
3. Open a command prompt or terminal and navigate to the directory where you downloaded the source code files.
4. Compile the Java source code files using the following command:
  'javac HtmlCodeGenerator.java'
5. Run the program using the following command:
    'java HtmlCodeGenerator'

**********************************************************************************************************************
USAGE AND FUNCTIONALITY

Command - Line Interface
- The HTML Code Generator utilizes a command-line interface foruser interaction. 
  Upon running the program, it prompts the user toenter the name, email and specify HTML elements to remove.

Input Validation and Error Handling
- The program performs input validation to ensure the entered nameand email are in the correct format. 
  It checks for the absence ofspecial characters in the name and validates the email format usingregular expressions. 
  If invalid inputs are provided, appropriate errormessages are displayed and the user is prompted to re-enter thevalues.

Customization Options
The program allows customization through the following options:  
- Repository URL: The program includes a default repository URLin the generated HTML code. 
                This URL can be customized bymodifying the repositoryUrl variable in the source code.
- Removing HTML Elements: Users can specify HTML elementsthey want to remove from the final HTML output. 
                        The programprompts for the elements to remove, allowing the user to entermultiple elements.

**********************************************************************************************************************

TROUBLESHOOTING
- „javac” is not recognized as a command:
  ensure that you haveinstalled the Java Development Kit (JDK) and the ’javac’command is accessible from the command prompt or terminal.
  Check your system’s PATH environment variable.
- invalid input error messages: if you receive error messagesindicating invalid inputs, make sure to follow the specified inputformats.
  Ensure that the name does not contain specialcharacters and the email is in the correct format (e.g.: user@example.com)

**********************************************************************************************************************

REFERENCES
- Oracle Java Documentation: https://docs.oracle.com/en/java/
- Regular Expressions in Java: https://docs.oracle.com/en/java/javase/11
