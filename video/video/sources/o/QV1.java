package o;

import android.util.Log;

/* loaded from: classes2.dex */
public final class QV1 implements PV1 {
    public static final String f = "RtpPcmReader";
    public final OV1 a;
    public InterfaceC10568wr2 b;
    public long c = C10323vs.b;
    public long d = 0;
    public int e = -1;

    public QV1(OV1 ov1) {
        this.a = ov1;
    }

    @Override // o.PV1
    public void a(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i, 1);
        this.b = b;
        b.a(this.a.c);
    }

    @Override // o.PV1
    public void c(long j, int i) {
        this.c = j;
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j, int i, boolean z) {
        int b;
        C9542sf.g(this.b);
        int i2 = this.e;
        if (i2 != -1 && i != (b = LV1.b(i2))) {
            Log.w(f, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b), Integer.valueOf(i)));
        }
        long a = RV1.a(this.d, j, this.c, this.a.b);
        int a2 = c3012Fy1.a();
        this.b.e(c3012Fy1, a2);
        this.b.b(a, 1, a2, 0, null);
        this.e = i;
    }
}
