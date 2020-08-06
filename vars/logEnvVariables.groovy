def call(String channel) {
    String result = currentBuild.result?.toLowerCase() ?: 'success'
    sh 'echo channel result'
    sh 'env'
}
