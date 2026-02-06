package o;

import android.annotation.SuppressLint;
import android.media.MediaParser$SeekableInputReader;
import java.io.IOException;

@ES1(30)
@SuppressLint({"Override"})
@Deprecated
/* renamed from: o.kQ0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7520kQ0 implements MediaParser$SeekableInputReader {
    @InterfaceC11300zs1
    public CU a;
    public long b;
    public long c;
    public long d;

    public long a() {
        long j = this.d;
        this.d = -1L;
        return j;
    }

    public void b(long j) {
        this.c = j;
    }

    public void c(CU cu, long j) {
        this.a = cu;
        this.b = j;
        this.d = -1L;
    }

    public long getLength() {
        return this.b;
    }

    public long getPosition() {
        return this.c;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((CU) TD2.o(this.a)).read(bArr, i, i2);
        this.c += read;
        return read;
    }

    public void seekToPosition(long j) {
        this.d = j;
    }
}
