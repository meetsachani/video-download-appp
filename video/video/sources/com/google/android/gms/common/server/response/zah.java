package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zah implements zai<BigDecimal> {
    @Override // com.google.android.gms.common.server.response.zai
    @InterfaceC11300zs1
    public final /* synthetic */ BigDecimal a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        BigDecimal u;
        u = fastParser.u(bufferedReader);
        return u;
    }
}
