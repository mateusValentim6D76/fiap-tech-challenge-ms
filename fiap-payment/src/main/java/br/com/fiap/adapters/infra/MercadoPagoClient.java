package br.com.fiap.adapters.infra;

import com.mercadopago.MercadoPago;
import com.mercadopago.exceptions.MPConfException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Payment;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.ExcludedPaymentMethod;
import com.mercadopago.resources.datastructures.preference.Item;
import com.mercadopago.resources.datastructures.preference.Payer;

import com.mercadopago.resources.datastructures.preference.PaymentMethods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@Component
public class MercadoPagoClient {
    private final String accessToken;

    public MercadoPagoClient(@Value("${mercadopago.api.key}") String accessToken) throws MPConfException {
        this.accessToken = accessToken;
        MercadoPago.SDK.setAccessToken(accessToken);
    }
    public String createPreference(UUID paymentId, String returnUrl, BigDecimal amount) {
        Preference preference = new Preference();
        preference.setExternalReference(String.valueOf(paymentId));
        preference.setBinaryMode(true);
        // Configurações do pagador (cliente)
        Payer payer = new Payer();
        payer.setEmail("cliente@example.com");
        preference.setPayer(payer);
        // Configurações do pagamento
        PaymentMethods paymentMethods = new PaymentMethods();
        paymentMethods.setExcludedPaymentMethods((ArrayList<ExcludedPaymentMethod>) Arrays.asList(new ExcludedPaymentMethod("visa")));
        preference.setPaymentMethods(paymentMethods);
        // Configuração do item a ser pago
        Item item = new Item();
        item.setTitle("Payment");
        item.setQuantity(1);
        item.setUnitPrice(amount.floatValue());
        preference.appendItem(item);

        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        preference.setItems(items);
        try {
            preference.save();
            return preference.getSandboxInitPoint(); // Retorna o link para gerar o QR Code
        } catch (Exception e) {
            return null;
        }
    }
    public void processPayment(String paymentId, String paymentMethodId, String token, BigDecimal transactionAmount) {
        Payment payment = new Payment();
        payment.setTransactionAmount(transactionAmount.floatValue());
        payment.setPaymentMethodId(paymentMethodId);
        payment.setToken(token);
        payment.setDescription("Descrição do pagamento"); // Substitua pela descrição apropriada
        payment.setInstallments(1);
        payment.setPayer(new com.mercadopago.resources.datastructures.payment.Payer());
        // Dados adicionais do pagamento conforme necessário
        // payment.setAdditionalParam("paramName", "paramValue");
        try {
            payment.save();
            System.out.println("Pagamento processado com sucesso. ID do pagamento: " + payment.getId());
        } catch (MPException e) {
            System.err.println("Erro ao processar o pagamento: " + e.getMessage());
        }
    }
}
