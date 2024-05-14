default:
  just --list

test:
  ./gradlew test

publishlocal:
  ./gradlew publishToMavenLocal

# dependencies:
#   ./gradlew -q dependencies > dependencies.txt
