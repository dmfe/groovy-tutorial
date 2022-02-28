package xyz.dmfe

import xyz.dmfe.organization.Organization
import xyz.dmfe.person.Person

class DiffWithJava {
    static void main(String[] args) {
        Object o = "Object"
        int result = method(o)

        println result

        int[] array = [1, 2, 3]

        println array

        // For Groovy 3+, you can optionally use the Java array initializers long syntax:
        // def array2 = new int[] {1, 2, 3}

        Person person = new Person()
        person.name = 'Mike'
        person.secondName = 'Nick'

        Person personTwo = new Person()
        personTwo.name = 'Harry'
        personTwo.secondName = 'Dirty'

        println "Person name: ${person.name} second name: ${person.secondName}"

        Organization organization = new Organization()
        organization.addEmployee(person)
        organization.addEmployee(personTwo)
        organization.printEmployees()
    }

    static int method(String arg) {
        return 1
    }

    static int method(Object arg) {
        return 2
    }
}
