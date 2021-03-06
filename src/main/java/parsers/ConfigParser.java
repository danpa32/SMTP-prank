package parsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConfigParser {
    private String address;
    private int port;
    private int numberOfGroups;
    private String witness;

    private String mySubString(String line) {
        return line.substring(line.indexOf("=") + 1);
    }

    private int myParseInt(String line) {
        return Integer.parseInt(line.substring(line.indexOf("=") + 1));
    }

    public ConfigParser(File file) throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(file));

        line = br.readLine();
        address = mySubString(line);
        System.out.println("Server address: " + address);

        line = br.readLine();
        port = myParseInt(line);
        System.out.println("Server port: " + port);

        line = br.readLine();
        numberOfGroups = myParseInt(line);
        System.out.println("Number of groups: " + numberOfGroups);
    }

    public String getAddress() {
        return address;
    }

    public int getPort() {
        return port;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }
}
