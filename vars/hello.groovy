def call(name="world") {
    println "hello ${name}"
    pipeline {
        agent none
        stages {
            stage('Test') {
                steps {
                    println 'test'
                }
            }
            stage('Build') {
                steps {
                    println 'build'
                }
            }
            stage('Deploy') {
                steps {
                    println 'deploy'
                }
            }
        }
    }

}
