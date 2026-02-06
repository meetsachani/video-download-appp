package o;

@Deprecated
/* loaded from: classes4.dex */
public class GU0 extends Uz2 {
    public GU0(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    public static GU0 l(int i) {
        return o(0, i);
    }

    public static GU0 m(int i) {
        return o(i, Integer.MAX_VALUE);
    }

    public static GU0 n(int i, int i2) {
        return new GU0(i, i2, true);
    }

    public static GU0 o(int i, int i2) {
        return new GU0(i, i2, false);
    }

    @Override // o.Uz2
    public String k(int i) {
        char[] chars = Character.toChars(i);
        return "\\u" + AbstractC6234fB.a(chars[0]) + "\\u" + AbstractC6234fB.a(chars[1]);
    }
}
