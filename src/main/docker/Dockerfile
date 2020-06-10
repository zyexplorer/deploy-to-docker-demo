# Base os image
FROM registry.cn-beijing.aliyuncs.com/awyl/java:v1
MAINTAINER ZY <zyexplorej2ee@sina.com>
LABEL Description="app image"  Version="1.0"

#设置时区 设置挂载了 /etc/localtime:/etc/localtime 则可以不用设置此项
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

#ENV Active="dev"
#ENV JAVA_OPTS="\
#-server \
#-Xmx512m \
#-Xms512m \
#-Xmn256m \
#-XX:SurvivorRatio=8 \
#-XX:MetaspaceSize=128m \
#-XX:MaxMetaspaceSize=256m \
#-XX:+UseParallelGC 3 \
#-XX:ParallelGCThreads=4 \
#-XX:+UseParallelOldGC \
#-XX:+UseAdaptiveSizePolicy \
#-XX:+PrintGCDetails \
#-XX:+PrintTenuringDistribution \
#-XX:+PrintGCTimeStamps \
#-XX:+HeapDumpOnOutOfMemoryError \
#-XX:HeapDumpPath=/ \
#-Xloggc:/gc.log \
#-XX:+UseGCLogFileRotation \
#-XX:NumberOfGCLogFiles=5 \
#-XX:GCLogFileSize=10M"

#java web
RUN mkdir /home/data

VOLUME /home/data

#将项目文件从本地传到镜像中
ADD *.jar /home/data

#开放8080端口
EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java -jar /home/data/*.jar" ]