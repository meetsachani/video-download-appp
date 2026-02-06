package o;

@InterfaceC8303na2({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,202:1\n80#2:203\n80#2:204\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n176#1:203\n183#1:204\n*E\n"})
@InterfaceC6480g82(version = "1.9")
@InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
/* renamed from: o.nm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8351nm2 extends A1 {
    public long d;

    public C8351nm2() {
        super(EnumC6964i80.Y);
        a();
    }

    @Override // o.A1
    public long g() {
        return this.d;
    }

    public final void i(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.d + C7691l80.h(e()) + " is advanced by " + ((Object) Y70.h0(j)) + '.');
    }

    public final void j(long j) {
        long g0 = Y70.g0(j, e());
        if (((g0 - 1) | 1) == Long.MAX_VALUE) {
            long r = Y70.r(j, 2);
            if ((1 | (Y70.g0(r, e()) - 1)) == Long.MAX_VALUE) {
                i(j);
                return;
            }
            long j2 = this.d;
            try {
                j(r);
                j(Y70.U(j, r));
                return;
            } catch (IllegalStateException e) {
                this.d = j2;
                throw e;
            }
        }
        long j3 = this.d;
        long j4 = j3 + g0;
        if ((g0 ^ j3) >= 0 && (j3 ^ j4) < 0) {
            i(j);
        }
        this.d = j4;
    }
}
