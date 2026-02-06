package o;

import o.InterfaceC4734Xo2;
import org.jetbrains.annotations.NotNull;

@InterfaceC6480g82(version = "1.3")
/* renamed from: o.Kk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3450Kk1 implements InterfaceC4734Xo2.c {
    @NotNull
    public static final C3450Kk1 b = new C3450Kk1();
    public static final long c = System.nanoTime();

    private final long f() {
        return System.nanoTime() - c;
    }

    @Override // o.InterfaceC4734Xo2.c, o.InterfaceC4734Xo2
    public /* bridge */ /* synthetic */ ZG a() {
        return InterfaceC4734Xo2.b.a.i(e());
    }

    public final long b(long j, long j2) {
        return InterfaceC4734Xo2.b.a.m(Y41.d(j, EnumC6964i80.Y, j2));
    }

    public final long c(long j, long j2) {
        return Y41.h(j, j2, EnumC6964i80.Y);
    }

    public final long d(long j) {
        return Y41.f(f(), j, EnumC6964i80.Y);
    }

    public long e() {
        return InterfaceC4734Xo2.b.a.m(f());
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // o.InterfaceC4734Xo2
    public /* bridge */ /* synthetic */ InterfaceC3760No2 a() {
        return InterfaceC4734Xo2.b.a.i(e());
    }
}
