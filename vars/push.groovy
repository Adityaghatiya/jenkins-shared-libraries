def call(String Project, String ImageTag, String dockerhubuser) {
    echo "Building Docker image: ${Project}:${ImageTag}"
    
    // Always build with local name first
    sh "docker build -t ${Project}:${ImageTag} ."
    
    echo "Docker image ${Project}:${ImageTag} built successfully"
}
