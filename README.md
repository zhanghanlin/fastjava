# fastjava
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
