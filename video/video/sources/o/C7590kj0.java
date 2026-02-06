package o;

@Deprecated
/* renamed from: o.kj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7590kj0 implements InterfaceC3741Nk {
    public static final double c = 0.9999d;
    public final double a;
    public long b;

    public C7590kj0() {
        this(0.9999d);
    }

    @Override // o.InterfaceC3741Nk
    public void a(long j, long j2) {
        long j3 = (8000000 * j) / j2;
        if (this.b == Long.MIN_VALUE) {
            this.b = j3;
            return;
        }
        double pow = Math.pow(this.a, Math.sqrt(j));
        this.b = (long) ((this.b * pow) + ((1.0d - pow) * j3));
    }

    @Override // o.InterfaceC3741Nk
    public long d() {
        return this.b;
    }

    @Override // o.InterfaceC3741Nk
    public void reset() {
        this.b = Long.MIN_VALUE;
    }

    public C7590kj0(double d) {
        this.a = d;
        this.b = Long.MIN_VALUE;
    }
}
