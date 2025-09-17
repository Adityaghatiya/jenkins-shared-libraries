def call(String Project, String ImageTag, String dockerhubuser) {
    withCredentials([usernamePassword(credentialsId: 'dockercreds',
                                      usernameVariable: 'USERNAME',
                                      passwordVariable: 'PASSWORD')]) {
        // Tag the image before pushing
        sh "docker tag ${Project}:${ImageTag} ${USERNAME}/${Project}:${ImageTag}"
        
        // Secure login using --password-stdin
        sh "echo ${PASSWORD} | docker login -u ${USERNAME} --password-stdin"
        
        // Push to DockerHub
        sh "docker push ${USERNAME}/${Project}:${ImageTag}"
    }
}
