pipeline{
agent any

 environment {
        def gradleHome = tool name: 'gradle-5.6.4', type: 'gradle'
        def gradleCMD = "${gradleHome}/bin/gradle"
    }

 stages{
     
    stage("SCM Checkout"){
            steps{
                 git 'https://github.com/shadab-gada/correspondencedemo'
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

    stage("Run Container"){
            steps{
                 sh "docker run -d -p 8080:8080 correspondencedemo"
            }
    }
   }
}