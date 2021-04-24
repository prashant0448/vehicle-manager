pipeline{
    agent any
        stages{
            stage('Test'){
                steps{
                    withMaven(maven: 'maven_3_6_3'){
                    echo 'Testing stage'
                    bat "mvn test"
                    }
                }
            }
            stage('Build'){
                    steps{
                        withMaven(maven: 'maven_3_6_3'){
                        echo 'Build stage'
                        bat "mvn clean install"
                        }
                    }
                }
            }
    }