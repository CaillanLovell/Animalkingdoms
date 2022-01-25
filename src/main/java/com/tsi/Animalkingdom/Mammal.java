package com.tsi.Animalkingdom;

public abstract class Mammal extends Animals{

    //////////////////////////////Attributes////////////////////////////////





    /////////////////////////////////Constructors//////////////////////////







    /////////////////////////////////Methods//////////////////////////////

    public abstract String  Reproduction();

    ////<build>
    //        <finalName>maven-unit-test</finalName>
    //        <plugins>
    //            <plugin>
    //                <groupId>org.apache.maven.plugins</groupId>
    //                <artifactId>maven-surefire-plugin</artifactId>
    //                <version>2.22.0</version>
    //            </plugin>
    //            <plugin>
    //                <groupId>org.jacoco</groupId>
    //                <artifactId>jacoco-maven-plugin</artifactId>
    //                <version>0.8.7</version>
    //                <executions>
    //                    <execution>
    //                        <id>jacoco-check</id>
    //                        <goals>
    //                            <goal>check</goal>
    //                        </goals>
    //                        <configuration>
    //                            <rules>
    //                                <rule>
    //                                    <element>PACKAGE</element>
    //                                    <limits>
    //                                        <limit>
    //                                            <counter>LINE</counter>
    //                                            <value>COVEREDRATIO</value>
    //                                            <minimum>0.1</minimum>
    //                                        </limit>
    //                                    </limits>
    //                                </rule>
    //                            </rules>
    //                        </configuration>
    //                    </execution>
    //                    <execution>
    //                        <goals>
    //                            <goal>prepare-agent</goal>
    //                        </goals>
    //                    </execution>
    //                    <execution>
    //                        <id>report</id>
    //                        <phase>prepare-package</phase>
    //                        <goals>
    //                            <goal>report</goal>
    //                        </goals>
    //                    </execution>
    //                </executions>
    //            </plugin>
    //        </plugins>
    //    </build>

}



