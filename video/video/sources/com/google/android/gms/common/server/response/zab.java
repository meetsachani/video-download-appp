package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zab implements zai<Long> {
    @Override // com.google.android.gms.common.server.response.zai
    @InterfaceC11300zs1
    public final /* synthetic */ Long a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        long p;
        p = fastParser.p(bufferedReader);
        return Long.valueOf(p);
    }
}
