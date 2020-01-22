## 编程范式
- 传统JS：命令式
- vue.js：森林式，响应式

## vue.js
- el：决定vue对象挂载到哪个元素上
- data：数据属性
- methods: 函数
- let 声明的变量只在 let 命令所在的代码块内有效。
- const 声明一个只读的常量，一旦声明，常量的值就不能改变

## 定义变量es6代替var
- 作用域存在缺陷
- const常量
- let 变量

## v-for 遍历循环
```
movies:['海王','哈利波特','星际穿越','重生之妖孽人生']
<li v-for = 'item in movies'>{{item}}</li>       
```

## v-on 监听
- 语法糖：@ ——监听（on）

## v-bind 改变属性
- 缩写成“：”


## Vue中的MVVM
- View→ViewModel→Model
- view: DOM层，展示信息
- Model：固定数据或来自服务器
- ViewModel：桥梁，一方面Data Binding 数据绑定；另一方面将Model改变反映到View中去
也实现了监听

## mustache（胡须）语法{{}}
- v-once:只读取一次



