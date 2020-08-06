def call(String channel) {
    String result = currentBuild.result?.toLowerCase() ?: 'success'
    echo "${channel} ${result}"
    sh 'env'
}
