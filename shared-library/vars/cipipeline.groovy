def call() {

    node('workstation') {
        sh "find . | sed -e '1d' | xargs rm -rf "
        git branch: 'main', url: "https://github.com/SPOORNACHANDRA/${component}"
        stage('compile code') {
            common.compile()
        }
        stage('Test') {
            print 'hello'
        }
        stage('code Quality') {
            print 'hello'
        }
        stage('code Security') {
            print 'hello'
        }
        stage('Release') {
            print 'hello'
        }
    }
}
