const express = require('express');
const app = express();
const port = 8001;
const userServices = require('./services/Usersevices')

app.use(express.json());
app.use(userServices)

app.listen(port,()=>{
    console.log('Start in port', port)
})