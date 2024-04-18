# springboot 集成飞书SDK 示例项目
## 1. Intro
- 本项目是一个极简的示例项目，用来说明如何使用**飞书Java-SDK**来向群组发送消息和接受回调

## 2. 接口和配置
- 发送消息：LarkController.sendMsg()
- 发送卡片消息： LarkController.sendCardMsg()
- 回调接口： LarkController.webhook()


- 配置信息在 application.properties 中


## 3. 飞书使用教程

- 在飞书开放平台 创建企业自建应用 或 使用默认机器人
- 在群聊中添加自建应用或机器人
- 申请添加各种接口需要的权限
- 引入Maven 包：
`<dependency>
    <groupId>com.larksuite.oapi</groupId>
    <artifactId>oapi-sdk</artifactId>
    <version>2.2.2</version>
</dependency>`
- 使用本示例中的代码
- 回调功能需要额外在开发者后台配置回调接口