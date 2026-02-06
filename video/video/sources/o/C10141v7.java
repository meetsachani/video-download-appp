package o;

import o.InterfaceC3760No2;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.v7  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10141v7 implements InterfaceC3760No2 {
    @NotNull
    public final InterfaceC3760No2 X;
    public final long Y;

    public /* synthetic */ C10141v7(InterfaceC3760No2 interfaceC3760No2, long j, C9516sY c9516sY) {
        this(interfaceC3760No2, j);
    }

    public final long a() {
        return this.Y;
    }

    @Override // o.InterfaceC3760No2
    @NotNull
    public InterfaceC3760No2 a0(long j) {
        return new C10141v7(this.X, Y70.V(this.Y, j), null);
    }

    @NotNull
    public final InterfaceC3760No2 b() {
        return this.X;
    }

    @Override // o.InterfaceC3760No2
    public long e() {
        return Y70.U(this.X.e(), this.Y);
    }

    @Override // o.InterfaceC3760No2
    public boolean g() {
        return InterfaceC3760No2.a.b(this);
    }

    @Override // o.InterfaceC3760No2
    public boolean h() {
        return InterfaceC3760No2.a.a(this);
    }

    @Override // o.InterfaceC3760No2
    @NotNull
    public InterfaceC3760No2 m0(long j) {
        return InterfaceC3760No2.a.c(this, j);
    }

    public C10141v7(InterfaceC3760No2 interfaceC3760No2, long j) {
        C6562gT0.p(interfaceC3760No2, "mark");
        this.X = interfaceC3760No2;
        this.Y = j;
    }
}
