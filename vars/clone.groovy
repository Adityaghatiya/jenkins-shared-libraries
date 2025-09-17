def call(String GitUrl, String GitBranch){
  echo 'Cloning code'
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo 'Code cloned'
}
