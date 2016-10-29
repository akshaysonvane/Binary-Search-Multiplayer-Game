1. Create Server class that add some object to RMIRegistry.
2. Create client that access object from RMIRegistry.
3. Add class folder to CLASSPATH env variable.
4. on server side, start RMIRegistry and start server executable.

5. On client side, create java.policy file like shown below.

grant codeBase "file:E:/Softwareengineering202/RMI-" {
{
    permission javsecurity.AllPermission;
};

Start client with this cmd line: java -Djava.security.policy=E:\Softwareengineering202\RMI\java.policy HelloClient