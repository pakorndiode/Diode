var x = 0
var y = 0
function U(x,y){
    var i
     i=x%y
    while(i>0)
    {
        x = y
        y = i
        i = x%y
        console.log('x= '+x+' y= '+y)
    }
    return y
}

console.log('ค่า หรม.เท่ากับ'+U(2050, 1500))

function F(x) {
    var i
    i=x-1
    while (i > 0) {
        x=x*i
        i = i-1
    }
    return x
}
console.log('ค่าของfactorial = '+F(6))

var array =[80,40,30,70,60]
function A(data){
    var sum = 0
    for (var i = 0; i < array.length; i++) {
        sum+= array[i]
    }
    sum = sum / array.length
    return sum
}
console.log(A(array))

var ourPm =[{
        'name':'ยุทธิ์',
        'lname': 'จัยรัน',
        'age':72,
        'salary':18000.765
    },
    {
        'name': 'หมา',
        'lname': 'รึ',
        'age': 36,
        'salary': 18000.765
    },
    {
        'name': 'แมว',
        'lname': 'ระ',
        'age': 78,
        'salary': 18000.765
    }]
console.log(ourPm[1].lname)