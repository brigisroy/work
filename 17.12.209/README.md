**PreparedStatement**

  PreparedStatement are found under `PreparedStatement` and method named `prepareStatement`
  
  Syntex
 ```
 PreparedStatement stmt=conn.prepareStatement("<quries passing >(`column1`, `column2`, `column3`) VALUES(?,?,?)");
 stmt.setString(1,<pass the variable>);
 stmt.setString(2,<pass the variable>);
 stmt.setString(3,<pass the variable>);
 ```
 The variable which your passing should be a string 
 
 [Code for PreparedStatement](https://github.com/brigisroy/work/blob/master/17.12.209/PreparedStatementInterface.java)

**Config Properties**

Syntex
```
File configFile = new File("<Location of the file>");
FileReader reader = new FileReader(configFile);
Properties props = new Properties();
props.load(reader);
String host = props.getProperty("db_link");
System.out.println("Host name is: " + host);
```

[Code for Config Properties](https://github.com/brigisroy/work/blob/master/17.12.209/Config_java.java)
