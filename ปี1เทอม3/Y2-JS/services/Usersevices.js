const express = require('express');
const UserController  = require('../controller/userCon');
const app = express();

app.get("/getUser",(req,res)=>{
    let body = req.body
    let result = UserController.getUserController
    console.log('body',body)
    res.status(200).send("test003")
})

app.post("/setUser",(req,res)=>{
    let body = req.body
    UserController.setUserController(body)
    console.log('body',body)
    res.status(200).send("test003")
})

module.exports = app