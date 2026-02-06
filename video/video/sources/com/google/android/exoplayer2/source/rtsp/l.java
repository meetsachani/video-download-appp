package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.g;
import java.io.IOException;
import o.C5699cy2;
import o.C7775lT0;
import o.C9542sf;
import o.InterfaceC11300zs1;
import o.InterfaceC4261Sr2;
import o.OU;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class l implements a {
    public static final String d = "RTP/AVP;unicast;client_port=%d-%d";
    public final C5699cy2 b;
    @InterfaceC11300zs1
    public l c;

    public l(long j) {
        this.b = new C5699cy2(2000, C7775lT0.d(j));
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        return this.b.a(ou);
    }

    @Override // o.FU
    public void close() {
        this.b.close();
        l lVar = this.c;
        if (lVar != null) {
            lVar.close();
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public String d() {
        boolean z;
        int e = e();
        if (e != -1) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        return TD2.M(d, Integer.valueOf(e), Integer.valueOf(e + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public int e() {
        int e = this.b.e();
        if (e == -1) {
            return -1;
        }
        return e;
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.b.getUri();
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public boolean l() {
        return true;
    }

    public void m(l lVar) {
        boolean z;
        if (this != lVar) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.c = lVar;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    @InterfaceC11300zs1
    public g.b o() {
        return null;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.b.read(bArr, i, i2);
        } catch (C5699cy2.a e) {
            if (e.X == 2002) {
                return -1;
            }
            throw e;
        }
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        this.b.s(interfaceC4261Sr2);
    }
}
