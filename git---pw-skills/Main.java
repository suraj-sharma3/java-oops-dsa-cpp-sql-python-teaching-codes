/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
/*
Basic Git Commands : Use Git Bash for these commands -

git commands are case sensitive (write the commands in lowercase)

1) git version or git --version : to know the git version
2) git help : gives brief information about important git commands
3) clear : to clear the screen
4) git help command_name : this will provide all the information about a particular command with the name command_name
e.g. git help init : this will provide info about the init command
e.g. git help config : this will provide info about the config command

if you're working with git for the first time then you have to put your name & email address in the configuration file of git
so that git can maintain a record of all the changes that you do to a file. Git takes the name of the person who accesses or does changes 
to a file from the configuration file only where the user submits his name & email id 

you would have to provide your github user name & email id to the git's configuration file by using git config command when you use git for the first time

5) git config --list : to list everything that is present in the configuration file of git
6) git config --list --show-origin : this will show us where the configuration file is located i.e, the origin of the configuration file
7) git config --global user.name "suraj-sharma13" : this will put the name as user name in the git configuration file
8) git config --global user.email "sharmasuraj1303@gmail.com" : this will put this email as user email in the git configuration file
    to check if your user name & email id is present in git config file or not, do git config --list
    
Git ecosystem (stage & snapshots) : 

first create a folder in your local system, this will be your working area 

pwd : this command will tell in which directory or folder you are currently
cd drive / folder_name : to enter into a folder or drive (cd means change directory)

in git bash, go to the folder that you created for the working area using the cd command

to go to any drive of your computer : enter the command - cd drive_name:
e.g. cd C:
to go to any folder in a particular drive : first go that drive then enter the command - cd folder_name
e.g. cd MyFiles (Note : there should be no space in the name of the file)

once you come to your desired folder, you would have to bring the Git environment in your folder 
to bring the git environment (the 3 stages including the local repository), we would have to run the
git init command.

the git init command will initialize git & will create an empty git repository for you 

to check if git has been initialized in your desired folder or not, go to "this pc"
then go your desired folder that you created for your working area
check if .git file is present in that folder or not, if you can't see your file (.git file is hidden), you should select view hidden files from properties & then you'll be able to see the .git file

if the .git file is present in your desired folder, then a local repository has been given to you 

save your java or any other programs in the folder where the .git file is present
to check where your program files are present in the git ecosystem i.e, in which area of the git ecosystem - working area or staging area or local repository,
you can use the git status command

once you enter the git status command, git will give you a message that shows the list of untracked files
untracked files are those files which are still in the working area

the files on which you are working are present in the working area & are untracked files

once you're done with working on your files, you can add those files into the staging area which means that now these files can be tracked

to push your files from your folder (working area) into the staging area, use the below given commands : 

to push all files from your folder (working area) to the staging area at once : use git add . (here . means all files)
to push a single file from your folder (working area) to the staging area : use git add file_name (e.g. git add hello.java)

once you add your files to the staging area & now if you run the command git status, you would no longer see untracked files, now you'll see all your files under changes to be committed message

if you want to again work on the files that you added to the staging area, you would again have to bring those files from the staging area to the working area i.e, you would have to unstage those files

to bring your files from staging area back to working area use the following command : 

git rm --cached file_name
e.g. git rm --cached hello.java

once you bring some files from staging area to working area, again those files would become untracked files

if you have added a file in the staging area, & then you do some changes on that file by mistake or even intentionally & you want to restore that file to it's original form i.e, remove the changes that you made 
use the command : git restore file_name
e.g. git restore hello.java

git status command tells us in which area of the git ecosystem our files are presently

once you have added your files to the staging area, you can now push them to the local repository too 
once the files reach the staging area, git starts tracking those files

pushing files from staging area to the local repository :

whenever you open Git, first run the command git init & then you can do other things

command to use : git commit -m "suitable message"
within the quotes, you can mention what changes you did on the files before pushing those files to the local repository
e.g. you added a method named "addNum" to the file hello.java & now you're pushing the file to the local repository, you can enter the command : 
git commit -m "added method addNum to hello.java file"

if you check the status by running git status command after you've pushed all your files from the staging area to the local repository
you'll get a message "nothing to commit, working tree clean"

Note : before pushing your files to the local repository from the staging area, you would have to run the below given commands
you can even run these commands at the start before you work on any of your files
by running the below given commands, you're telling Git your GitHub username & email id i.e, you are giving it access to your repository on the server

git config --global user.name "suraj-sharma13"
git config --global user.email "sharmasuraj1303@gmail.com"

How to push files from your local repository to the server repository (GitHub) :

first create a new repository on GitHub :

whenever you open Git, first run the command git init & then you can do other things

run the git init command

go to Git, run the command : git branch -M main

copy the link of your GitHub repository from GitHub "your repositories" option
then run this command to add your GitHub repository origin : git remote add origin link_of_your_github_repository

to copy & paste things on git bash or cmd, use right click options & not the short cut keys, short cut keys don't work with git bash or cmd

e.g. git remote add origin https://github.com/suraj-sharma13/JavaDemo.git

once you add the origin of your GitHub repository, now run the below given command to push all your files from the local repository to the server repository (GitHub repository)

git push -u origin main

after running this command, all your files will be added to your GitHub repository

once we have pushed all our files to our GitHub repository, now all our team members can access our files

if you are getting an error at any of the steps, make a new repository & repeat the process again from git init to all the other steps

1) go to your desired folder in git bash
2) run git init command to create git ecosystem in your desired folder
3) run git config --global user.name "suraj-sharma13"
   run git config --global user.email "sharmasuraj1303@gmail.com"
4) run git commit -m "message" command 
5) run git branch -M main command
6) run git remote add origin link_of_the_github_repository command
7) run git push -u origin main command

git clone & git pull :

if a developer wants the files that are present in the GitHub repository, the developer will run git clone link_of_the_github_repository command on his system 

suppose 2 developers clone the GitHub repository files on their systems & developer 1 from those 2 did some changes in the files on his system & then pushed those files back into the GitHub repository
the changes that developer 1 did will not be visible to developer 2 in his system
now if developer 2 wants to see the changes that developer 1 did to those files in his system
developer 2 would have to use git pull command 

git clone command is used to pull all the files from the GitHub repository to a developer's system
command to clone : git clone link_of_the_github_repository
git pull command is used to pull all the changes that were done to the files from the GitHub repository to a developer's system
command to pull : git pull (after developer 1 has pushed all the changes to the GitHub repository)

Note : we can go to our desired folder using this pc & once we are in that folder, we can open git bash there by viewing more options & then clicking "git bash here" option
this would bring git directly to our desired folder

to push the files along with the changes done from the developer's local repository to the GitHub repository : 

1) git add . - to add all the files with the changes to the staging area
2) git commit -m "message" - to add all the files to the local repository 
3) git push - to push all the files along with the changes done to the GitHub repository

as the changes by developer 1 will not be visible in the system of developer 2 even though developer 1 has pushed the files with changes to GitHub repository
to make developer 2 see all the changes, we should open git bash after going to the devloper 2 folder & then
run the "git pull" command

Branch in git : 

usually the default branch is the "master" branch
whenever you work on a project, git gives you an independent line of development which is called as branch
everyone who is working on a project, work on a single branch that is associated with that project

suppose one of the developers wanted to experiment with the project, instead of experimenting with the main branch
that developer can make a separate independent branch for himself & experiment on that branch & then if the changes are suitable,
he can merge his branch with the main branch

every developer can make his own separate branch to experiment & then they can merge their respective branches with the main branch

in this way every developer can experiment with the project without affecting the main project & only add the changes done by them to the main project if those changes are worth adding

to check how many branches are there currently in git, we can run the command : git branch
this command tells us the total number of branches as well as the branch that we're in currently

to create a new branch, we can run the command : git branch branch_name
e.g. git branch surajdev

to move from your current branch to another branch, run the command : git checkout branch_name_you_wanna_go_to
e.g. git checkout dev - we'll checkout from the branch we are currently in & will move to dev branch

to check the status of files in the branch we're currently in, run the command : git status

the changes that we did to a particular branch, we need to first push those changes to the staging area
by doing git add . & then to the local repository by git commit -m "message" 

now if we want to merge our branch with some other branch :

1) we need to move out of our branch & got to the branch we want to merge to
e.g. git checkout main (here main is the branch we want to merge our branch to)
2) now we can merge our branch to this branch by running the command :
git merge dev (now dev branch will merge with main branch)
3) now do git add . to move your work to the staging area
4) now do git commit -m "message" to move your work to the local repository
5) git push origin main to push your work to the GitHub repository

git log command : 

git log : this command tells the complete history of all the commits that have been done


command used to return to any branch : git checkout branch_name
e.g. git checkout master (we'll return to the master branch)
