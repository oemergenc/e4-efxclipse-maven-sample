package sample.mvn.lib

import spock.lang.Specification

class HelloWorldHelperSpec extends Specification {

    def "Hello World means hello world"() {
        given:
        def hello = HelloWorldHelper.Hello
        when:
        def upperCase = hello.toUpperCase()
        then:
        upperCase == "HELLO WORLD"
    }
}
