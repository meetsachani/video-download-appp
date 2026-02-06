package o;

/* renamed from: o.z  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11087z extends AbstractC10844y {
    public AbstractC11087z(C10792xn c10792xn) {
        super(c10792xn);
    }

    public abstract void h(StringBuilder sb, int i);

    public abstract int i(int i);

    public final void j(StringBuilder sb, int i, int i2) {
        int f = b().f(i, i2);
        h(sb, f);
        int i3 = i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append(C3599Ly1.j);
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
