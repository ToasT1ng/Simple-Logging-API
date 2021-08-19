# Simple Logging API

## What is this?
Simple Logging API Sample with Spring Cloud Sleuth

## Usage

### Test
```
$ git clone https://github.com/ToasT1ng/Simple-Logging-API.git
$ bash <directory>/shellscript/start.sh
$ curl -XPOST localhost:8080/once
```
<br/>

### Loop Logging
```
$ curl -XPOST 'localhost:8080/loop?msg=<YOUR_MSG>&loopTimes=<YOUR_LOOP_TIME>&term=<YOUR_TERM>'
$ curl -XPOST 'localhost:8080/loop?msg=hello&loopTimes=10&term=1'
```

**msg** = Message for logging   
**loopTimes** = How many times do you want to log   
**term** = Thread will sleep as many seconds as you put in. After sleeping, spring will log your **msg**

<br/>

### If you want to restart Spring App
Just simply rerun `start.sh` again
```
$ bash <directory>/shellscript/start.sh
```
