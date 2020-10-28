node{
    stage("SCM Checkout"){
           git 'https://github.com/shadab-gada/correspondencedemo'
    }

    stage("Gradle Build"){
            def gradleHome = tool name: 'gradle-5.6.4', type: 'gradle'
            def gradleCMD = "${gradleHome}/bin/gradle"
            sh "${gradleCMD} build"
    }

    stage("Build docker image"){
            sh "docker build -t correspondencedemo:latest ."
    }

    stage("Run Container"){
            sh "docker run -d -p 8080:8080 correspondencedemo"
    }
}