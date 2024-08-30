def call(String branch, String repoURL) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  branch ]],
        userRemoteConfigs: [[ url: repoURL ]]
    ])
  }
