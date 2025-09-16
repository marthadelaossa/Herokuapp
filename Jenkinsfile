pipeline {
  agent any

  environment {
    // opcional: acelerador de caché de dependencias
    GRADLE_USER_HOME = "${WORKSPACE}/.gradle"
  }

  stages {
    stage('Checkout') {
      steps {
        // Multibranch / Pipeline from SCM: checkout scm usa la configuración del job
        checkout scm
        // alternativa para Pipeline clásico:
        // git url: 'https://github.com/ORG/REPO.git', credentialsId: 'github-pat'
      }
    }

    stage('Build & Test') {
      steps {
        // usa el wrapper (más portable). En Windows usar "bat 'gradlew.bat ...'" si aplica.
        sh './gradlew clean test --no-daemon'
      }
    }
  }

  post {
    always {
      // publica los XML de JUnit generados por Gradle
      junit 'build/test-results/**/*.xml'
      // opcional: archive de artefactos
      archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
    }
    success {
      echo 'BUILD SUCCESS — tests OK'
    }
    failure {
      echo 'BUILD FAILED — revisa los tests'
    }
  }
}
