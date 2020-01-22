## $(doucment).ready(function({}))
- JQuery入口函数，可写多个，顺序执行
- 区别JS原生代码window.onload = function(){}，原生代码会覆盖
- Jquery 不会等待图片加载完，DOM加载完便开始运行
## JQuery其他入口函数
- jQuerydoucment).ready(function({}))
- $(function(){} ); 推荐

## 释放JQuery $符号
- var nj = jQuery.noConflict();使用nj 代替$符号

## jQuery核心函数-$()
- 接受一个函数
- 接受一个字符串： $(".box")作为选择器
- 接受一个代码片段
- 接受DOM元素 返回jQuery对象，保存了找到的DOM对象

## jQuery 对象
- 伪数组：有0到.length-1的属性，且有length属性
```
var fakeArray01 = {0:'a',1:'b',length:2};//这是一个标准的伪数组对象 
```

## 静态方法和实例方法区别
- 静态方法直接写个类，不需要声明实体；而实例方法需要声明一个对象

### 原生JS遍历数组方式 
```
arr.forEach(function(value,index){
    console.log(index,value);})
```
只能遍历数组，不能遍历伪数组
### jQuery 遍历数组方式
```
    $.each(arr,function(index,value){
        console.log(index,value);
    })
```
### 原生JS中 Map方法（映射）
```
arr.map(function(value,index){//原生映射
    console.log(index,value);
 })
$.map(obj,function(value,index){jQuery映射，可映射伪数组（对象）
    console.log(index,value);
})
```
## 去除字符串
- var str2 = $.trim(str1);返回值是去除空格后的字符串(其余也去)

## $.isWindow() 返回值true or false