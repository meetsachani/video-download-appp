package o;

/* renamed from: o.y  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10844y extends F0 {
    public static final int c = 40;

    public AbstractC10844y(C10792xn c10792xn) {
        super(c10792xn);
    }

    public static void e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    public final void f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        g(sb, i, length);
    }

    public final void g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = b().f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append(C3599Ly1.j);
            }
            if (f / 10 == 0) {
                sb.append(C3599Ly1.j);
            }
            sb.append(f);
        }
        e(sb, i2);
    }
}
