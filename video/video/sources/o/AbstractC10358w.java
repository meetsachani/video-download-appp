package o;

/* renamed from: o.w  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10358w extends AbstractC11087z {
    public static final int d = 5;
    public static final int e = 15;

    public AbstractC10358w(C10792xn c10792xn) {
        super(c10792xn);
    }

    @Override // o.F0
    public String d() throws C9349rr1 {
        if (c().m() == 60) {
            StringBuilder sb = new StringBuilder();
            f(sb, 5);
            j(sb, 45, 15);
            return sb.toString();
        }
        throw C9349rr1.a();
    }
}
