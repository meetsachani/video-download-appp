package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.Pl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3943Pl2 extends AbstractRunnableC3650Ml2 {
    @InterfaceC7058iW0
    @NotNull
    public final Runnable Z;

    public C3943Pl2(@NotNull Runnable runnable, long j, boolean z) {
        super(j, z);
        this.Z = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.Z.run();
    }

    @NotNull
    public String toString() {
        String d;
        StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        sb.append(NV.a(this.Z));
        sb.append(C11304zt1.a);
        sb.append(NV.b(this.Z));
        sb.append(C6566gU0.h);
        sb.append(this.X);
        sb.append(C6566gU0.h);
        d = C4528Vl2.d(this.Y);
        sb.append(d);
        sb.append(']');
        return sb.toString();
    }
}
