pipeline
{
    agent any
    stages{
        stage('Compile'){
            steps{
                    withMaven(maven : 'maven_3_6_3')
                    {
                        sh 'mvn clean compile'
                    }
                }
        }
        stage('Test'){
                steps{
                        withMaven(maven : 'maven_3_6_3')
                        {
                            sh 'mvn test'
                        }
                    }
            }
        stage('Build'){
                steps{
                        withMaven(maven : 'maven_3_6_3')
                        {
                            sh 'mvn install'
                        }
                    }
            }
    }
}