package o;

/* renamed from: o.u  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9869u extends AbstractC10844y {
    public static final int d = 8;
    public static final int e = 2;
    public static final int f = 10;

    public C9869u(C10792xn c10792xn) {
        super(c10792xn);
    }

    @Override // o.F0
    public String d() throws C9349rr1, C2605Bx0 {
        if (c().m() >= 48) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            int f2 = b().f(48, 2);
            sb.append("(393");
            sb.append(f2);
            sb.append(')');
            int f3 = b().f(50, 10);
            if (f3 / 100 == 0) {
                sb.append(C3599Ly1.j);
            }
            if (f3 / 10 == 0) {
                sb.append(C3599Ly1.j);
            }
            sb.append(f3);
            sb.append(b().c(60, null).b());
            return sb.toString();
        }
        throw C9349rr1.a();
    }
}
