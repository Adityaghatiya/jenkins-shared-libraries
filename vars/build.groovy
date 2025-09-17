def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo 'Building Docker image'
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo 'docker image created'
}
