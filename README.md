
## Documentazioni e tutorial ##

Istruzioni installazione JRE 1.8
https://www.java.com/it/download/help/download_options.xml

Istruzioni installazione Maven
https://maven.apache.org/install.html

Istruzioni installazione Git
https://git-scm.com/book/it/v1/Per-Iniziare-Installare-Git

Istruzioni installazione IntelliJIDEA Community Edition
https://www.jetbrains.com/idea/documentation/

Link di istallazione di XAMPP:
https://www.apachefriends.org/download.html

Documentazione Spring Framework
https://docs.spring.io/spring/docs/current/spring-framework-reference/pdf/spring-framework-reference.pdf

Documentazione Spring Boot
https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/

Documentazione JPA
https://docs.spring.io/spring-data/jpa/docs/current/reference/pdf/spring-data-jpa-reference.pdf

Ottimo tutorial JPA
https://www.petrikainulainen.net/spring-data-jpa-tutorial/

Strategie per definire i metodi-query
https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-creating-database-queries-from-method-names/
https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-introduction-to-query-methods/

Documentazione JWT
https://stormpath.com/blog/jwt-java-create-verify
https://stormpath.com/blog/beginners-guide-jwts-in-java
https://github.com/jwtk/jjwt

Documentazione JSR-303
http://beanvalidation.org/1.0/spec/

Project Lombok
https://projectlombok.org/

Libreria criptaggio password
http://www.jasypt.org/

Istruzioni installazione PostMan
https://www.angeloparziale.it/blog/2017/06/22/postman/

Documentazione AJAX:
https://www.w3schools.com/xml/ajax_intro.asp

------------------------------------------

# Snippets o link utili: #

## Spring Initializer ##
<https://start.spring.io/>

## Struttura del DB ##

 ### nome DB: accountdb (H2 - in Memory DB) il nome non è importante ###
  
    TABLE users      (String ID, String USERNAME, String PASSWORD, String PERMISSION) 
  
    TABLE accounts   (String ID, String FK_USER, Double TOTAL) 
  
    TABLE operations (String ID, Date DATE, Double VALUE, String DESCRIPTION, String FK_ACCOUNT1, String FK_ACCOUNT2)

  ### nome DB: coupondb (in MySQL) ###
  
    TABLE coupon      ( (autogenerated int) couponid, String couponcode, String account)
