if (process.env.NODE_ENV !== 'production') {
    require('dotenv').config()
}

const { env } = require('process');
const express = require('express')
const GNRequest = require('./apis/gerencianet')

const app = express();
app.set('view engine', 'ejs')
app.set('views', 'src/views')

const reqGNAlready = GNRequest();
app.get('/', async (req, res) => {
    const reqGN =  await reqGNAlready();
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
    const cobResponse = await reqGN.post('/v2/cob', dataCob)

    const qrCodeResponse = await reqGN.get(`/v2/loc/${cobResponse.data.loc.id}/qrcode`)

    res.render('qrcode', {qrcodeImage: qrCodeResponse.data.imagemQrcode})
});

app.listen(8002, () => {
    console.log('running')
});
