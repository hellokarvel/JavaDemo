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