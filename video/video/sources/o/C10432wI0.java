package o;

import java.util.Objects;

/* renamed from: o.wI0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10432wI0 extends RuntimeException {
    public final int X;
    public final String Y;
    public final transient FT1<?> Z;

    public C10432wI0(FT1<?> ft1) {
        super(b(ft1));
        this.X = ft1.b();
        this.Y = ft1.h();
        this.Z = ft1;
    }

    public static String b(FT1<?> ft1) {
        Objects.requireNonNull(ft1, "response == null");
        return "HTTP " + ft1.b() + C4500Ve2.b + ft1.h();
    }

    public int a() {
        return this.X;
    }

    public String c() {
        return this.Y;
    }

    @InterfaceC10571ws1
    public FT1<?> d() {
        return this.Z;
    }
}
