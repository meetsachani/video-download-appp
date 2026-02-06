package o;

/* renamed from: o.s  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9383s extends AbstractC10358w {
    public C9383s(C10792xn c10792xn) {
        super(c10792xn);
    }

    @Override // o.AbstractC11087z
    public void h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // o.AbstractC11087z
    public int i(int i) {
        if (i < 10000) {
            return i;
        }
        return i - 10000;
    }
}
