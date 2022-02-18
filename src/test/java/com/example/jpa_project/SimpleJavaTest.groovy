package com.example.jpa_project

import com.example.jpa_project.ch07Example.MultiId_EmbeddedClass_Parent
import spock.lang.Specification

class SimpleJavaTest extends Specification{

    def "equals_hashCode_test"(){
        when:
        MultiId_EmbeddedClass_Parent.ParentId firstId = new MultiId_EmbeddedClass_Parent.ParentId()
        firstId.id1 = "myId1"
        firstId.id2 = "myId2"

        MultiId_EmbeddedClass_Parent.ParentId secondId = new MultiId_EmbeddedClass_Parent.ParentId()
        secondId.id1 = "myId1"
        secondId.id2 = "myId2"

        then:
        firstId != secondId
    }
}
