package o;

import java.io.IOException;
import java.io.InterruptedIOException;

@Deprecated
/* renamed from: o.pt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8863pt {
    public static final int k = 131072;
    public final C6161et a;
    public final InterfaceC4844Ys b;
    public final OU c;
    public final String d;
    public final byte[] e;
    @InterfaceC11300zs1
    public final a f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    /* renamed from: o.pt$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(long j, long j2, long j3);
    }

    public C8863pt(C6161et c6161et, OU ou, @InterfaceC11300zs1 byte[] bArr, @InterfaceC11300zs1 a aVar) {
        this.a = c6161et;
        this.b = c6161et.y();
        this.c = ou;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = aVar;
        this.d = c6161et.z().a(ou);
        this.g = ou.g;
    }

    @InterfaceC10697xN2
    public void a() throws IOException {
        long j;
        g();
        InterfaceC4844Ys interfaceC4844Ys = this.b;
        String str = this.d;
        OU ou = this.c;
        this.i = interfaceC4844Ys.e(str, ou.g, ou.h);
        OU ou2 = this.c;
        long j2 = ou2.h;
        if (j2 != -1) {
            this.h = ou2.g + j2;
        } else {
            long g = InterfaceC6278fM.g(this.b.d(this.d));
            if (g == -1) {
                g = -1;
            }
            this.h = g;
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(c(), this.i, 0L);
        }
        while (true) {
            long j3 = this.h;
            if (j3 != -1 && this.g >= j3) {
                return;
            }
            g();
            long j4 = this.h;
            if (j4 == -1) {
                j = Long.MAX_VALUE;
            } else {
                j = j4 - this.g;
            }
            long h = this.b.h(this.d, this.g, j);
            if (h > 0) {
                this.g += h;
            } else {
                long j5 = -h;
                if (j5 == Long.MAX_VALUE) {
                    j5 = -1;
                }
                long j6 = this.g;
                this.g = j6 + f(j6, j5);
            }
        }
    }

    public void b() {
        this.j = true;
    }

    public final long c() {
        long j = this.h;
        if (j == -1) {
            return -1L;
        }
        return j - this.c.g;
    }

    public final void d(long j) {
        this.i += j;
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(c(), this.i, j);
        }
    }

    public final void e(long j) {
        if (this.h != j) {
            this.h = j;
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(c(), this.i, 0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[Catch: IOException -> 0x0068, TryCatch #0 {IOException -> 0x0068, blocks: (B:27:0x0064, B:33:0x006f, B:35:0x007d, B:37:0x0085), top: B:43:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: IOException -> 0x0068, TRY_LEAVE, TryCatch #0 {IOException -> 0x0068, blocks: (B:27:0x0064, B:33:0x006f, B:35:0x007d, B:37:0x0085), top: B:43:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(long j, long j2) throws IOException {
        boolean z;
        long j3;
        int i;
        boolean z2 = true;
        if (j + j2 != this.h && j2 != -1) {
            z = false;
        } else {
            z = true;
        }
        if (j2 != -1) {
            try {
                j3 = this.a.a(this.c.a().i(j).h(j2).a());
            } catch (IOException unused) {
                NU.a(this.a);
            }
            if (!z2) {
                g();
                try {
                    j3 = this.a.a(this.c.a().i(j).h(-1L).a());
                } catch (IOException e) {
                    NU.a(this.a);
                    throw e;
                }
            }
            if (z && j3 != -1) {
                try {
                    e(j3 + j);
                } catch (IOException e2) {
                    NU.a(this.a);
                    throw e2;
                }
            }
            i = 0;
            int i2 = 0;
            while (i != -1) {
                g();
                C6161et c6161et = this.a;
                byte[] bArr = this.e;
                i = c6161et.read(bArr, 0, bArr.length);
                if (i != -1) {
                    d(i);
                    i2 += i;
                }
            }
            if (z) {
                e(j + i2);
            }
            this.a.close();
            return i2;
        }
        z2 = false;
        j3 = -1;
        if (!z2) {
        }
        if (z) {
            e(j3 + j);
        }
        i = 0;
        int i22 = 0;
        while (i != -1) {
        }
        if (z) {
        }
        this.a.close();
        return i22;
    }

    public final void g() throws InterruptedIOException {
        if (!this.j) {
            return;
        }
        throw new InterruptedIOException();
    }
}
