pipeline{
    agent any
        stages{
            stage('Test'){
                steps{
                    echo 'Testing stage'
                    sh "mvn test"
                }
            }
            stage('Build'){
                    steps{
                        echo 'Build stage'
                        sh "mvn clean install"
                    }
                }
            }
    }