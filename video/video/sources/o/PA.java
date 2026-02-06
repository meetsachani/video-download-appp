package o;

@InterfaceC10420wF0
@InterfaceC6584ga0
/* loaded from: classes3.dex */
public abstract class PA extends AbstractC10514we0 {
    public static final int b = 2;

    public static char[] e(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    @Override // o.AbstractC10514we0
    public String b(String str) {
        C10664xF1.E(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (c(str.charAt(i)) != null) {
                return d(str, i);
            }
        }
        return str;
    }

    @MB
    public abstract char[] c(char c);

    public final String d(String str, int i) {
        int length = str.length();
        char[] a = C7712lD1.a();
        int length2 = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char[] c = c(str.charAt(i));
            if (c != null) {
                int length3 = c.length;
                int i4 = i - i2;
                int i5 = i3 + i4;
                int i6 = i5 + length3;
                if (length2 < i6) {
                    length2 = ((length - i) * 2) + i6;
                    a = e(a, i3, length2);
                }
                if (i4 > 0) {
                    str.getChars(i2, i, a, i3);
                    i3 = i5;
                }
                if (length3 > 0) {
                    System.arraycopy(c, 0, a, i3, length3);
                    i3 += length3;
                }
                i2 = i + 1;
            }
            i++;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (length2 < i8) {
                a = e(a, i3, i8);
            }
            str.getChars(i2, length, a, i3);
            i3 = i8;
        }
        return new String(a, 0, i3);
    }
}
