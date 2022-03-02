package xyz.dmfe.arm

import java.nio.file.Files

class ArmBlockGroovy {
    static printFile(String fileName, String charset) {
// Such blocks are supported from Groovy 3+.
//        new File(getClass().getResource(fileName).toURI()).eachLine(charset) {
//            println it
//        }

//        new File(getClass().getResource(fileName).toURI()).withReader { reader ->
//            reader.each {
//                print it
//            }
//        }

// ARM blocks are not supported in Groovy < 3
//        try (BufferedReader reader = Files.newBufferedReader(new File(getClass().getResource(fileName).toURI()), charset)) {
//
//        } catch (IOException e) {
//
//        }
    }
}
