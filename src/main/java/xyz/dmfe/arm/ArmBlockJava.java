package xyz.dmfe.arm;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArmBlockJava {
    private Path file;
    private Charset charset;

    public ArmBlockJava(String fileName, String charsetName) throws Exception {
        file = Paths.get(ArmBlockJava.class.getClassLoader().getResource(fileName).toURI());
        charset = Charset.forName(charsetName);
    }

    public void printFile() {
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
