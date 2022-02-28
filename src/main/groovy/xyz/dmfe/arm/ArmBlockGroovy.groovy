package xyz.dmfe.arm

class ArmBlockGroovy {
    static printFile(String fileName, String charset) {
        new File(getClass().getResource(fileName).toURI()).eachLine(charset) {
            println it
        }
    }
}
