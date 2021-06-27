# Getting Started

## Setting up your development environment

1. Install Java 16: `https://www.oracle.com/java/technologies/javase-jdk16-downloads.html` (Recommended, login necessary)

	* or AdoptOpenJDK 16: `https://adoptopenjdk.net/`

	* *other Java providers are available, but it's recommended to avoid them unless you know what you are doing.*

2. Install git: `https://git-scm.com/downloads`

3. Install Maven: `https://maven.apache.org/download.cgi`

	* You'll find it easier to install via package managers, such as:

		* Windows: `choco install maven` (Chocolatey: `https://chocolatey.org/install`)

		* macOS: `brew install maven` (Homebrew: `https://brew.sh/#install`)

		* Linux: `sudo apt install maven`

4. Install MariaDB: `https://mariadb.org/download/`

	* You may find it easier to install via package managers, such as:

		* Windows: `choco install mariadb` (Chocolatey: `https://chocolatey.org/install`)

		* macOS: `brew install mariadb` (Homebrew: `https://brew.sh/#install`)

		* Linux: `sudo apt install mariadb-server`

	* Post installation setup differs from platform to platform

		* If you're on Windows, you're able to set the root password as part of the standard installation process

		* Some platforms and some versions support the use of `sudo mysql_secure_installation`, while others require more elaborate terminal work. Here are some guides:

			* `https://mariadb.com/kb/en/mysql_secure_installation/`

			* `https://www.digitalocean.com/community/tutorials/how-to-reset-your-mysql-or-mariadb-root-password`

	* If you get the message: "Specified key was too long; max key length is 767 bytes"

		* Change your database encoding to latin1 (undesirable but apparently works)

		* Alternatively, upgrade to at least MariaDB 10.2 (this may require an OS update for your server hosting platform)

5. Install an IDE

	* IntelliJ is good: `https://www.jetbrains.com/idea/download/`

	* Eclipse is good: `https://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/lunasr2`

	* Visual Studio Code is decent: `https://code.visualstudio.com/`

	* Hardcore? Notepad++ is popular: `https://notepad-plus-plus.org/download/`

	* TextPad is a good hardcore for Windows: `http://www.textpad.com/download/`

	* Masochist? Vim: `http://www.vim.org/download.php` or Emacs: `http://www.gnu.org/software/emacs/#Obtaining`

6. Install an EditorConfig plugin, if necessary: `https://editorconfig.org/#download`

# Style Guide

All plugins actively maintained by Civclassic ought to follow the following
rules regarding their layout, formatting, etc. Contributors are expected to
follow them too.

## File Layout

An example of how a given repository should be generally laid out can be seen in
the example plugin: [CivTemplate](https://github.com/CivClassic/CivTemplate).

## Root Folder

The root folder should ideally only contain the following files:

* `src/` - The source folder
* `.editorconfig` - Should be identical to or based on [this](./.editorconfig)
* `.gitattributes` - Should be identical to or based on [this](./.gitattributes)
* `.gitignore` - Should be identical to or based on [this](./.gitignore)
* `LICENSE.txt` - The license for the project as a whole
* `pom.xml` - The Maven config file for the project
* `README.md` - Markdown file detailing information about the project

## Licenses

Typically, all Civclassic plugins are licensed under
[BSD-3](https://opensource.org/licenses/BSD-3-Clause) or
[MIT](https://opensource.org/licenses/MIT), however if you are submitting a
new project to Civclassic, you may choose any free and open source license.
[Take your pick](https://opensource.org/licenses/alphabetical). You should be
aware though that your chosen license may have implications on who is willing
to adopt or contribute to your plugin.

You agree, when contributing to one of Civclassic's plugins, to license your
code under that project's respective license. We are a small group of plugin
developers, we cannot afford to have our own version of Bukkit's legal drama.
