
const db = require('monk')('localhost:27017/UserManagementTestNodejs').get('user')


function getUserController(param){
    console.log('getUserController',param)
    let result = await db.find({},{name: "HOTTOY"})
    console.log('result',result)
}

function setUserController(param){
    console.log('setUserController',param)
    db.insert({
        name : param.name,
        code : param.idstudent 
    })
}

module.exports = {
    getUserController,
    setUserController
}