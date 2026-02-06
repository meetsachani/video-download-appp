package o;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.tu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9846tu0 extends AbstractC3501Ky0 {
    public final long X;
    public final boolean Y;
    public long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9846tu0(@NotNull InterfaceC7072ia2 interfaceC7072ia2, long j, boolean z) {
        super(interfaceC7072ia2);
        C6562gT0.p(interfaceC7072ia2, "delegate");
        this.X = j;
        this.Y = z;
    }

    public final void a(C5422bq c5422bq, long j) {
        C5422bq c5422bq2 = new C5422bq();
        c5422bq2.Q1(c5422bq);
        c5422bq.write(c5422bq2, j);
        c5422bq2.h();
    }

    @Override // o.AbstractC3501Ky0, o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "sink");
        long j2 = this.Z;
        long j3 = this.X;
        if (j2 > j3) {
            j = 0;
        } else if (this.Y) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(c5422bq, j);
        int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
        if (i != 0) {
            this.Z += read;
        }
        long j5 = this.Z;
        long j6 = this.X;
        if ((j5 < j6 && i == 0) || j5 > j6) {
            if (read > 0 && j5 > j6) {
                a(c5422bq, c5422bq.size() - (this.Z - this.X));
            }
            throw new IOException("expected " + this.X + " bytes but got " + this.Z);
        }
        return read;
    }
}
