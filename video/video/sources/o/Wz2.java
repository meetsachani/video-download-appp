package o;

@InterfaceC10420wF0
@InterfaceC6584ga0
/* loaded from: classes3.dex */
public abstract class Wz2 extends AbstractC10514we0 {
    public static final int b = 32;

    public static int c(CharSequence charSequence, int i, int i2) {
        C10664xF1.E(charSequence);
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt >= 55296 && charAt <= 57343) {
                if (charAt <= 56319) {
                    if (i3 == i2) {
                        return -charAt;
                    }
                    char charAt2 = charSequence.charAt(i3);
                    if (Character.isLowSurrogate(charAt2)) {
                        return Character.toCodePoint(charAt, charAt2);
                    }
                    String valueOf = String.valueOf(charSequence);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 89);
                    sb.append("Expected low surrogate but got char '");
                    sb.append(charAt2);
                    sb.append("' with value ");
                    sb.append((int) charAt2);
                    sb.append(" at index ");
                    sb.append(i3);
                    sb.append(" in '");
                    sb.append(valueOf);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
                String valueOf2 = String.valueOf(charSequence);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 88);
                sb2.append("Unexpected low surrogate character '");
                sb2.append(charAt);
                sb2.append("' with value ");
                sb2.append((int) charAt);
                sb2.append(" at index ");
                sb2.append(i);
                sb2.append(" in '");
                sb2.append(valueOf2);
                sb2.append("'");
                throw new IllegalArgumentException(sb2.toString());
            }
            return charAt;
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static char[] f(char[] cArr, int i, int i2) {
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
        int g = g(str, 0, length);
        if (g == length) {
            return str;
        }
        return e(str, g);
    }

    @MB
    public abstract char[] d(int i);

    public final String e(String str, int i) {
        int i2;
        int length = str.length();
        char[] a = C7712lD1.a();
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int c = c(str, i, length);
            if (c >= 0) {
                char[] d = d(c);
                if (Character.isSupplementaryCodePoint(c)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int i5 = i2 + i;
                if (d != null) {
                    int i6 = i - i3;
                    int i7 = i4 + i6;
                    int length2 = d.length + i7;
                    if (a.length < length2) {
                        a = f(a, i4, length2 + (length - i) + 32);
                    }
                    if (i6 > 0) {
                        str.getChars(i3, i, a, i4);
                        i4 = i7;
                    }
                    if (d.length > 0) {
                        System.arraycopy(d, 0, a, i4, d.length);
                        i4 += d.length;
                    }
                    i3 = i5;
                }
                i = g(str, i5, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i8 + i4;
            if (a.length < i9) {
                a = f(a, i4, i9);
            }
            str.getChars(i3, length, a, i4);
            i4 = i9;
        }
        return new String(a, 0, i4);
    }

    public int g(CharSequence charSequence, int i, int i2) {
        int i3;
        while (i < i2) {
            int c = c(charSequence, i, i2);
            if (c < 0 || d(c) != null) {
                break;
            }
            if (Character.isSupplementaryCodePoint(c)) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            i += i3;
        }
        return i;
    }
}
