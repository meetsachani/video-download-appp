package o;

/* renamed from: o.t  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9626t extends AbstractC10844y {
    public static final int d = 8;
    public static final int e = 2;

    public C9626t(C10792xn c10792xn) {
        super(c10792xn);
    }

    @Override // o.F0
    public String d() throws C9349rr1, C2605Bx0 {
        if (c().m() >= 48) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            int f = b().f(48, 2);
            sb.append("(392");
            sb.append(f);
            sb.append(')');
            sb.append(b().c(50, null).b());
            return sb.toString();
        }
        throw C9349rr1.a();
    }
}
