package com.sravani.txnplatform.system;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PingControllerTest {

    @Test
    void pingReturnsUpWithServiceName() {
        PingController controller = new PingController("txn-platform");

        PingResponse response = controller.ping();

        assertThat(response.status()).isEqualTo("UP");
        assertThat(response.service()).isEqualTo("txn-platform");
        assertThat(response.time()).isNotNull();
    }
}