## 表格
```
<table>
        <thead>
            标题栏
        </thead>
        <tbody>
            <tr>//第一行
                <td>第一格</td>
                <td>第二格</td>
                <td>第三格</td>
                <td>第四格</td>
                <td>第五格</td>
            </tr>
        </tbody>
    </table>
```
```
querySelectorAll  //务必使用该进行选取
```
## 表格全选按钮
- <input type="checkbox"> 
- getElementsByTagName('input') 选取框选择
- console.log(this.checked);确定当前栏是否被选取
```
j_tbs[i].onclick =function(){
    var flag =true;
    for(var i = 0;i<j_tbs.length;i++){
        if(!j_tbs[i].checked){
            flag = false;
            break; //退出for循环，提高效率
        }
    }
    j_cball.checked = flag;//全选框为否
}
```
## 获取元素值
```
console.log(div.id);
console.log(div.getAttribute('id'));程序员自己添加的属性
``