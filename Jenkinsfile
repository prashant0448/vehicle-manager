pipeline{
    agent any
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