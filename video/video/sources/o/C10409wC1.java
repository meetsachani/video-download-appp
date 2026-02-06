package o;

@Z90
@InterfaceC10420wF0
/* renamed from: o.wC1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10409wC1 extends Wz2 {
    public static final char[] e = {'+'};
    public static final char[] f = C10671xH0.b.toCharArray();
    public final boolean c;
    public final boolean[] d;

    public C10409wC1(String str, boolean z) {
        C10664xF1.E(str);
        if (!str.matches(".*[0-9A-Za-z].*")) {
            String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            if (z && concat.contains(C4500Ve2.b)) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            this.c = z;
            this.d = h(concat);
            return;
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    public static boolean[] h(String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    @Override // o.Wz2, o.AbstractC10514we0
    public String b(String str) {
        C10664xF1.E(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return e(str, i);
            }
        }
        return str;
    }

    @Override // o.Wz2
    @MB
    public char[] d(int i) {
        boolean[] zArr = this.d;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.c) {
            return e;
        }
        if (i <= 127) {
            char[] cArr = f;
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        } else if (i <= 2047) {
            char[] cArr2 = f;
            return new char[]{'%', cArr2[(i >>> 10) | 12], cArr2[(i >>> 6) & 15], '%', cArr2[((i >>> 4) & 3) | 8], cArr2[i & 15]};
        } else if (i <= 65535) {
            char[] cArr3 = f;
            return new char[]{'%', C3599Ly1.i, cArr3[i >>> 12], '%', cArr3[((i >>> 10) & 3) | 8], cArr3[(i >>> 6) & 15], '%', cArr3[((i >>> 4) & 3) | 8], cArr3[i & 15]};
        } else if (i <= 1114111) {
            char[] cArr4 = f;
            return new char[]{'%', 'F', cArr4[(i >>> 18) & 7], '%', cArr4[((i >>> 16) & 3) | 8], cArr4[(i >>> 12) & 15], '%', cArr4[((i >>> 10) & 3) | 8], cArr4[(i >>> 6) & 15], '%', cArr4[((i >>> 4) & 3) | 8], cArr4[i & 15]};
        } else {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Invalid unicode character value ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // o.Wz2
    public int g(CharSequence charSequence, int i, int i2) {
        C10664xF1.E(charSequence);
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }
}
