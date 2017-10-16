# SpringBootMVC
Project skeleton for Software Project class in the University of Iceland.

## How do I get this ?
Your IDE ([IntelliJ](https://www.jetbrains.com/idea/), [Eclipse](https://eclipse.org/), [Spring Tool Suit](https://spring.io/tools)) should be able to clone a project from Github.
It should be easy to find information regarding how to do that for your chosen IDE.
It's also possible to download the project as a .zip [here](https://github.com/danielpall/SpringBootMVC/archive/master.zip).

## How do I run this ?
This project is setup using [Maven](https://maven.apache.org/what-is-maven.html) as a dependency manager, so if your IDE does not manage that, or you don't have it installed you can look [here](https://maven.apache.org/install.html) for further information.
When all the dependencies are downloaded, you can run the project by running the ``main()`` method in the class ``Application`` and then enter [localhost:8080](http://localhost:8080) into the address bar of your favorite web browser.

## What is going on ?
Look at the code and find the comments I wrote. I tried explaining what was happening in such a way that it should hopefully be easy to understand.

### What did you use to make this ?
I used IntelliJ Ultimate with Maven to setup this project. Students and Teachers get the Ultimate edition for free, apply [here](https://www.jetbrains.com/student/).

### Nothing is working! What can I do ?
My e-mail is in the course page. Shoot me an e-mail and we'll figure out the problem and solve it.

### Database
This project runs an internal database while it is running. If the project is restarted, then all data will be reset, i.e. no data will persist between restarts.
If you look at the [application.properties](https://github.com/danielpall/SpringBootMVC/blob/master/src/main/resources/application.properties) file, you can see how you can direct the project to use your own persistent database. The example shown is aimed at Postgres.


## What is this application showing ?  
This application is a small demonstration of using Spring Boot](https://projects.spring.io/spring-boot/) to handle the full stack for the webapp. It handles the frontend using Jasper for jsp pages, which 
allows for dynamic pages. It handles the backend with MVC pattern and easy to use annotations, and interfaces to a repository of our choice, in this instance, an in memory database.
When the application is running, you can go to [http://localhost:8080/postit](http://localhost:8080/postit) for a demonstration for this tech stack.

It's a simple postit application where an user writes a _name_ and a _note_ and posts it to a list. All users posts will be visible with name and note. 
It's also possible to see notes from certain users by going to the url  [http://localhost:8080/postit/username](http://localhost:8080/postit/username) where _username_ is the name of the user you want to see the postit notes from.