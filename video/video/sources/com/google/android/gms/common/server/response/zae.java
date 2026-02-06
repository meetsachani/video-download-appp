package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zae implements zai<Boolean> {
    @Override // com.google.android.gms.common.server.response.zai
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Boolean a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        boolean A;
        A = fastParser.A(bufferedReader, false);
        return Boolean.valueOf(A);
    }
}
