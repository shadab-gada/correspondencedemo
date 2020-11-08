pipeline{
agent {
        label 'linux'
    }

 environment {
        def gradleHome = tool name: 'GRADLE56', type: 'gradle'
        def gradleCMD = "${gradleHome}/bin/gradle"
    }

 stages{

    stage("SCM Checkout"){
            steps{
                 git 'https://github.com/vertexinc/vcd-correspondence'
            }
    }

    stage("Gradle Build"){
            steps{
                sh "${gradleCMD} build"
           }
    }

    stage("Build docker image"){
            steps{
                sh "docker build -t correspondencedemo:latest ."
            }
    }

    stage("pushing to ECR"){
            steps {
                                script {
                                    docker.withRegistry("https://597123819409.dkr.ecr.us-east-1.amazonaws.com/demo", 'ecr:us-east-1:aws-jenkins-demo') {
                                        docker.image(correspondence).push('latest')
                                    }
                                }
                            }
        }
    }

   }