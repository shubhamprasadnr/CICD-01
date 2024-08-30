def call(String name,String repoURL) {
    git branch: '${name}', url: '${repoURL}'
}
