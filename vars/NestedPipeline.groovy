/**
 * Example of using the custom nested pipeline
 */
def call(body) {
    // Init the MPL library
    echo "Init nested pipeline"
    MPLInit()

    // Executing the pipeline without additional configuration
    pipeline {  // Declarative pipeline
        node {
            stage('Checkout') {
                MPLModule()
            }
            stage('Build') {
                MPLModule()
            }
            stage('Test') {
                MPLModule()
            }
        }
    }
}