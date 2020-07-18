# Ling （后端）

个人练习小项目，基于Spring Boot, Shiro, Vue, Element实现的一款前后端分离的后台权限管理系统

## 项目源码

 表头|后端源码|前端源码
  ---| :--:  | :--:
github|(https://github.com/ling6930/Ling)|https://github.com/ling6930/Ling-ui

## 使用教程

### 后端
1. 下载源码
   git clone https://gitee.com/liuge1988/kitty.git
2. 编译代码
  找到 pom.xml，执行 mvn clean install 命令编译一键打包。
  一般来说不会有什么问题，如果还是编译不成功，可以按照优先级逐个编译试一试。
3. 导入数据库
   新建数据库，导入 doc/kitty.sql 脚本，导入初始化数据库。
   修改 application.yml 中的数据库连接和账号密码为自己的数据库配置。
4. 启动项目

### 前端
1. 下载源码
   git clone https://github.com/goufaning/permission-app.git
2. 安装node.js
3. 进入项目根目录，执行 npm install, 下载和安装项目相关依赖包
4. 执行 npm run dev 命令，启动项目，通过 http://localhost:8080 访问。
