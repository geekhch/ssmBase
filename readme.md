### ssm框架基础配置文件项目说明
1. 使用idea IDE
2. 包含ssm框架基础配置文件，可直接下载使用，不用再到处搜索配置参数啦，欢迎提出建议。
3. 使用时需要修改的参数（数据库）：
    + src/resources/generatorConfig.xml
        [!img](./readme/generator1.jpg)
        [!img](./readme/generator2.jpg)
    
    + src/resources/mybatis-config.xml
        [!img](./readme/mybatis-config.jpg)
    
    由于idea的管理机制，生成的xml格式mapper文件需要移动到resources对应目录下才会生效！
   
    + pom.xml(需要加入其它maven包时修改)
4. generator使用方法：
    [!img](./readme/generator3.jpg)
