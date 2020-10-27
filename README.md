# Correspondence Demo

## Prerequisites to Development

### Required Software

Package | Required Version | Download Location | Installation Notes
-------- | ----------------- | ----------------- | ----------------------
JDK - Amazon Corretto 64bit | 11.xxx | [Corretto Downloads](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) | You may be stopped by antivirus. So long as you use the official download page linked, this will be a false alarm
Gradle | 5.x.x | [Gradle Download](https://gradle.org/install/) | [Java version 8+ required](https://www.oracle.com/java/technologies/javase-downloads.html), Make sure to add the gradle\bin filepath to Path in your envitonment variables
git | latest | [Git Download](https://git-scm.com/downloads) | Set [Notepad++ (download link)](https://notepad-plus-plus.org/downloads/) as the default editor, Use Windows default console window, leave everything else default/recommended
docker | latest | [docker install](https://docs.docker.com/docker-for-windows/install/) | Setup to use linux containers. Once the installation is complete, go to [this link](https://docs.docker.com/docker-for-windows/) to test your setup

### Installation Guide
Many of the installation pages as linked above have their own download instructions, but below are step-by-step download guides more specific for our uses or otherwise simplified from the download pages.

Before doing anything, go to your C:\ and create a folder in the drive called "dev" without the quotes. 
The filepath to this folder should be C:\dev\ - this is where you should place any installed software.
You may create subfolders under dev\ to organize.

There is also an FAQ included below this section for certain multistep procedures required.
##### Amazon Corretto
    - Click the Corretto Downloads link above
    - On the webpage, scroll to the table with download links sorted by platform
    - Locate the OS you are currently using, and click the corresponding JDK link from the Download Link column
    - If stopped by antivirus, run the installer anyway. If you do not immediately see a "Run Anyway" option choose to show more information on the popup and it should appear
    - Use the installer to install Corretto
    - Remember to change the download path to C:\dev
##### Gradle
    - Click the Gradle Download link above
    - Check your current Java version (see FAQ below for instructions)
    - If your version is at least 1.8.xxx, proceed with the Gradle download. If not, update or download Java via the link above
    - Scroll down to the Installing Manually section of the webpage
    - Click the download link, you'll be redirected to the Releases page
    - Locate the latest release and click the link for Binary-Only download
    - Unzip the downloaded file and place it into your C:\dev\ folder
    - Open the file you just placed, navigate to the \bin folder, and copy the filepath
    - Open your Environment Variables (see FAQ). Under System Variables, locate and click on Path.
    - Edit the Path variable and add the Gradle\bin filepath you copied (see FAQ)
    - To test the installation, open the command line and type "gradle -v" without quotes and the version number for your Gradle download should display
    - If it does not, double check your Path
##### Git
    - Click the Git download link above
    - On the downloads page, select the download link for the OS you are currently using
    - Run the download .exe
    - Leave checked components as-is, feel free to select Additional icons and/or Check daily for updates options
    - Select using Notepad++ as Git's default editor from the dropdown; if needed, click the Notepad++ download link above and install the latest version
        - Feel free to select another option if you're more comfortable/already have it installed; but Notepad++ is the easiest option
    - Select the recommended option of using "Git from the command line and also from 3rd party software" (should be default)
    - Select "Use the OpenSSL library" (should be default)
    - Select "Checkout Windows-style, commit Unix-style line endings" (should be default)
    - Select "Use Windows' default console window"
    - Leave default extra options, but remember to change the filepath to C:\dev\Git
    - Click install
    - Open the command line and type "git" without quotes to test the download. A list of valid git commands should display
    - If there is an error, open your Environment Variables and open Path under System Variables
        - If you do not see C:\dev\Git\cmd in the list of variables, locate the Git download location, open the folder, copy the filepath to the cmd folder, and add it to your Path
        - Test again by typing "git" in the command line
##### Docker
    - Click the Download from Docker Hub button at the top of the page
    - On the new page that opens, click the Get Docker button
    - Run the installation .exe
    - Make sure to set Docker up for Linux containers, not Windows, when the option appears
    - Remember to change the download path to C:\dev
    - Once downloaded, open Docker desktop via taskbar; click the arrow on the right of the taskbar to display hidden icons, and right click the Docker whale
    - Open your command line and go to the link above, under Docker's Installation notes, to test your setup

##### Jenkins (for Local usage)
[Jenkins download page](https://www.jenkins.io/download/)

    - Go to Jenkins download page
    - select windows option to start download
    - set the path under dev folder
    - go to c:\Program files (x86)\Jenkins\secrets\initialAdminPassword path or similar path in your environment to get intialAdminPassword txt file
    - Enter the password to sign in
    - Install suggested plugins (make sure to have git and docker plugins installed)
    
### Jenkins Pipeline

    - Create new job
    
    - Select pipeline option
    
    - Add the jenkins stages and commands in file
        1. Pull GitHub repo
        2. Gradle build
        3. Build docker image
        4. Run Docker container
        
    - Build now
     
     
    