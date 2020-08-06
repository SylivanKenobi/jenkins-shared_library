def call(String channel) {
    String result = currentBuild.result?.toLowerCase() ?: 'success'
    node {
        sh 'echo channel'
    }
}
