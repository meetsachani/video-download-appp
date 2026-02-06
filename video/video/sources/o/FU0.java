package o;

/* loaded from: classes4.dex */
public class FU0 extends Vz2 {
    public FU0(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    public static FU0 l(int i) {
        return o(0, i);
    }

    public static FU0 m(int i) {
        return o(i, Integer.MAX_VALUE);
    }

    public static FU0 n(int i, int i2) {
        return new FU0(i, i2, true);
    }

    public static FU0 o(int i, int i2) {
        return new FU0(i, i2, false);
    }

    @Override // o.Vz2
    public String k(int i) {
        char[] chars = Character.toChars(i);
        return "\\u" + AbstractC5991eB.a(chars[0]) + "\\u" + AbstractC5991eB.a(chars[1]);
    }
}
