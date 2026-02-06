package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.g;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import o.AbstractC5887dl;
import o.C9542sf;
import o.InterfaceC11300zs1;
import o.OU;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class j extends AbstractC5887dl implements a, g.b {
    public static final String j = "RTP/AVP/TCP;unicast;interleaved=%d-%d";
    public final LinkedBlockingQueue<byte[]> f;
    public final long g;
    public byte[] h;
    public int i;

    public j(long j2) {
        super(true);
        this.g = j2;
        this.f = new LinkedBlockingQueue<>();
        this.h = new byte[0];
        this.i = -1;
    }

    @Override // o.FU
    public long a(OU ou) {
        this.i = ou.a.getPort();
        return -1L;
    }

    @Override // o.FU
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public String d() {
        boolean z;
        if (this.i != -1) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        return TD2.M(j, Integer.valueOf(this.i), Integer.valueOf(this.i + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public int e() {
        return this.i;
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public boolean l() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.g.b
    public void m(byte[] bArr) {
        this.f.add(bArr);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public g.b o() {
        return this;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.h.length);
        System.arraycopy(this.h, 0, bArr, i, min);
        byte[] bArr2 = this.h;
        this.h = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i2) {
            return min;
        }
        try {
            byte[] poll = this.f.poll(this.g, TimeUnit.MILLISECONDS);
            if (poll == null) {
                return -1;
            }
            int min2 = Math.min(i2 - min, poll.length);
            System.arraycopy(poll, 0, bArr, i + min, min2);
            if (min2 < poll.length) {
                this.h = Arrays.copyOfRange(poll, min2, poll.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
