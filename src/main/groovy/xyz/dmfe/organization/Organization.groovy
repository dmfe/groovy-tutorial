package xyz.dmfe.organization

import xyz.dmfe.person.Person

class Organization {
    List<Person> employees

    Organization() {
        employees = []
    }

    void addEmployee(Person person) {
        person.secondName = 'TOP SECRET'
        employees.add(person)
    }

    void printEmployees() {
        employees.each {
            println "Employee name: ${it.name} second name: ${it.secondName}"
        }
    }
}
