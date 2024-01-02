if(process.env.NODE_ENV !== 'production'){
    require('dotenv').config()
}

const axios = require('axios');
const fs = require('fs');
const path = require('path');
const https = require('https');
const { env } = require('process');
const express = require('express')

const cert = fs.readFileSync(
    path.resolve(__dirname, `../certs/${process.env.GN_CERT}`))
const agent = new https.Agent({
    pfx: cert,
    passphrase: ""
})

const credentials = Buffer.from(`${process.env.GN_CLIENT_ID}:${process.env.GN_CLIENT_SECRET}`)
.toString('base64');

const app = express();
app.set('view engine', 'ejs')
app.set('views', 'src/views')

app.get('/', (req, res) => {
    axios({
        method: 'POST',
        url: `${process.env.GN_ENDPOINT}/oauth/token`,
        headers: {
            Authorization: `Basic ${credentials}`,
            'Content-Type': 'application/json'
        },
        httpsAgent: agent,
        data: {
            grant_type: 'client_credentials'
        } 
    }).then((response) => {
        const accessToken = response.data?.access_token;
        const reqGN = axios.create({
            baseURL: process.env.GN_ENDPOINT,
            httpsAgent: agent,
            headers: {
                Authorization: `Bearer ${accessToken}`,
                'Content-Type': 'application/json'
            }
        });
        const dataCob = {
            calendario: {
              expiracao: 3600
            },
            devedor: {
              cpf: '12345678909',
              nome: 'Regis da Silva'
            },
            valor: {
              original: '123.45'
            },
            chave: 'd7510bcc-b420-4c02-9ccb-55cba0e898f1',
            solicitacaoPagador: 'Cobrança dos serviços prestados.'
          }
          reqGN.post('/v2/cob',dataCob).then((response) => res.send(response.data)
    );
        });
});

app.listen(8002, () => {
    console.log('running')
});



console.log(cert)