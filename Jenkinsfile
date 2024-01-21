pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Demo Project Successfully'
        sh '''pipeline {
    agent any

    stages {
        stage(\'Clean\') {
            steps {
                script {
                    // Clean your project
                    sh \'mvn clean\'
                }
            }
        }

        stage(\'Build\') {
            steps {
                script {
                    // Build your project
                    sh \'mvn install\'
                }
            }
        }

        stage(\'Run\') {
            steps {
                script {
                    // Run your project
                    sh \'java -jar /Users/girjeshbaghel/.jenkins/workspace/first_1maven/target/DemoProject-0.0.1-SNAPSHOT.jar\'
                }
            }
        }
    }
}
'''
        }
      }

    }
  }