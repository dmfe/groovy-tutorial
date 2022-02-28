package xyz.dmfe.person

import groovy.transform.PackageScope

class Person {
    // Omitting a modifier on a filed doesn't result a package-private field like in Java.
    // Instead, it is used to create a property, that is to say a private field, an associated
    // getter and an associated setter.
    String name

    // To create a package-private field @PackageScope annotation can be used.
    @PackageScope String secondName
}
