package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zag implements zai<BigInteger> {
    @Override // com.google.android.gms.common.server.response.zai
    @InterfaceC11300zs1
    public final /* synthetic */ BigInteger a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        BigInteger v;
        v = fastParser.v(bufferedReader);
        return v;
    }
}
