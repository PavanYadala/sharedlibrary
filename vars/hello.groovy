def call(String name = 'human') {
    echo "Hello, ${name}."
    sh '''
      echo "Hello"
      '''
}
