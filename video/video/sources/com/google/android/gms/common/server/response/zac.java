package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zac implements zai<Float> {
    @Override // com.google.android.gms.common.server.response.zai
    @InterfaceC11300zs1
    public final /* synthetic */ Float a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        float m;
        m = fastParser.m(bufferedReader);
        return Float.valueOf(m);
    }
}
