#!/bin/bash

echo "start clean build"
{
  cd ..
  ./gradlew clean build --stacktrace --debug
}
echo -e "build done\n\n"

echo "kill port '8080' before start this spring app"
PID=$(sudo lsof -ti :8080)
if [ -z "${PID}" ] ; then
   echo -e "Nothing to kill\n\n"
else
   echo -e "8080 Process killed\n\n"
   sudo kill -9 ${PID}
fi

PWD="$(pwd)"
echo "start running"
{
  # shellcheck disable=SC2164
  cd build/libs
  mv simplelogging-0.0.1-SNAPSHOT.jar ../../
  cd ../..
  sudo nohup /usr/bin/java -jar simplelogging-0.0.1-SNAPSHOT.jar 1>/dev/null 2>/dev/null &
}

echo -e "done\n"