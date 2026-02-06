package o;

import java.io.RandomAccessFile;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.jW0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7299jW0 extends AbstractC8848pp0 {
    @NotNull
    public final RandomAccessFile Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7299jW0(boolean z, @NotNull RandomAccessFile randomAccessFile) {
        super(z);
        C6562gT0.p(randomAccessFile, "randomAccessFile");
        this.Z0 = randomAccessFile;
    }

    @Override // o.AbstractC8848pp0
    public synchronized void o() {
        this.Z0.close();
    }

    @Override // o.AbstractC8848pp0
    public synchronized void p() {
        this.Z0.getFD().sync();
    }

    @Override // o.AbstractC8848pp0
    public synchronized int q(long j, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "array");
        this.Z0.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.Z0.read(bArr, i, i2 - i3);
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
            } else {
                i3 += read;
            }
        }
        return i3;
    }

    @Override // o.AbstractC8848pp0
    public synchronized void r(long j) {
        try {
            try {
                long size = size();
                long j2 = j - size;
                if (j2 > 0) {
                    int i = (int) j2;
                    t(size, new byte[i], 0, i);
                } else {
                    this.Z0.setLength(j);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // o.AbstractC8848pp0
    public synchronized long s() {
        return this.Z0.length();
    }

    @Override // o.AbstractC8848pp0
    public synchronized void t(long j, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "array");
        this.Z0.seek(j);
        this.Z0.write(bArr, i, i2);
    }
}
