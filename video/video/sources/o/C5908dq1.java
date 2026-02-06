package o;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.dq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5908dq1 extends AbstractC8848pp0 {
    @NotNull
    public final FileChannel Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5908dq1(boolean z, @NotNull FileChannel fileChannel) {
        super(z);
        C6562gT0.p(fileChannel, "fileChannel");
        this.Z0 = fileChannel;
    }

    @Override // o.AbstractC8848pp0
    public synchronized void o() {
        this.Z0.close();
    }

    @Override // o.AbstractC8848pp0
    public synchronized void p() {
        this.Z0.force(true);
    }

    @Override // o.AbstractC8848pp0
    public synchronized int q(long j, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "array");
        this.Z0.position(j);
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.Z0.read(wrap);
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
                    this.Z0.truncate(j);
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
        return this.Z0.size();
    }

    @Override // o.AbstractC8848pp0
    public synchronized void t(long j, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "array");
        this.Z0.position(j);
        this.Z0.write(ByteBuffer.wrap(bArr, i, i2));
    }
}
