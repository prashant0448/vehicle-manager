pipeline{
    agent any
    tools{
        maven 'maven_3_6_3'
        jdk 'jdk8'
    }
        stages{
            stage('Test'){
                steps{
                    echo 'Testing stage'
                    bat "mvn test"
                }
            }
            stage('Build'){
                    steps{
                        echo 'Build stage'
                        bat "mvn clean install"
                    }
                }
            }
    }
