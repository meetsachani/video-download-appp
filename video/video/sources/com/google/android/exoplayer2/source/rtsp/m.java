package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.a;
import java.io.IOException;
import o.NU;
import o.SV1;

@Deprecated
/* loaded from: classes2.dex */
public final class m implements a.InterfaceC0095a {
    public final long a;

    public m(long j) {
        this.a = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0095a
    public a a(int i) throws IOException {
        int i2;
        l lVar = new l(this.a);
        l lVar2 = new l(this.a);
        boolean z = false;
        try {
            lVar.a(SV1.a(0));
            int e = lVar.e();
            if (e % 2 == 0) {
                z = true;
            }
            if (z) {
                i2 = e + 1;
            } else {
                i2 = e - 1;
            }
            lVar2.a(SV1.a(i2));
            if (z) {
                lVar.m(lVar2);
                return lVar;
            }
            lVar2.m(lVar);
            return lVar2;
        } catch (IOException e2) {
            NU.a(lVar);
            NU.a(lVar2);
            throw e2;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0095a
    public a.InterfaceC0095a b() {
        return new k(this.a);
    }
}
