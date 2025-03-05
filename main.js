const http = require('http');
const fs = require('fs')

const port = 5000; 
const headers = {'Content-Type': "text/html"}; 

const server = http.createServer((req, res) => {     
    fs.readFile('index.html','utf-8', (err, data) => {         
        if (err) {             
            res.writeHead(500, headers);             
            res.end(err);         
        } else {             
            const render = data.replace("{{name}}", "Penaranda & Doronila").replace("{{age}}", "22 & 24");             
            res.writeHead(200, headers);             
            res.end(render);         
        }     
    }); 
});

server.listen(port, () => {     
    console.log(`http://localhost:${port}`); 
});
