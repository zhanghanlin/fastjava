# fastjava
* 发布jar：
> mvn clean
> 
> mvn build deploy

* 项目pom.xml引用
```xml
<repositories>
		<repository>
			<id>fastjava-mvn-repo</id>
			<url>https://raw.github.com/zhanghanlin/fastjava/mvn-repo/</url>
			<layout>default</layout>
            <releases>
                <enabled>true</enabled>
                <updatePolicy>never</updatePolicy>
            </releases>
            <snapshots>
                <enabled>true</enabled>
                <updatePolicy>never</updatePolicy>
            </snapshots>
		</repository>
</repositories>
```
```xml
<dependency>
		<groupId>com</groupId>
		<artifactId>fastjava</artifactId>
		<version>1.0</version>
</dependency>
```

* 使用github作为maven仓库请参考：[maven-repository-on-github](http://stackoverflow.com/questions/14013644/hosting-a-maven-repository-on-github)
