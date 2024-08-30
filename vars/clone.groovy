def call(def context, String name,String repoURL) {
    context.git branch: '${name}', url: '${repoURL}'
}
