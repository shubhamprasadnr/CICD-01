def call(String name) {
    script {
        sh """
            echo Hi ${name}
        """
    }
}
