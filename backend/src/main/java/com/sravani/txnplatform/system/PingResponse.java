package com.sravani.txnplatform.system;

import java.time.Instant;

public record PingResponse(String status, String service, Instant time) {
}