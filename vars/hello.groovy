def call(name="world") {
    println "hello ${name}"
    // pipeline {
    //     agent none
    //     stages {
    //         stage('Test') {
    //             steps {
    //                 println 'test'
    //             }
    //         }
    //         stage('Build') {
    //             steps {
    //                 println 'build'
    //             }
    //         }
    //         stage('Deploy') {
    //             steps {
    //                 println 'deploy'
    //             }
    //         }
    //     }
    // }

    try {
        lock(resource: env.JOB_NAME, inversePrecedence: true) {
            node {
                stage('Test') {
                    println "test"
                }

                stage('Build') {
                    println 'build'
                }

                stage('Deploy') {
                    println 'deploy'
                }
                    
            }
        }
    } catch (e) {
        throw e
    }

}
