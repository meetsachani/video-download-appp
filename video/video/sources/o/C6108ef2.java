package o;

import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.ef2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6108ef2 {
    public static String a(CharSequence charSequence, CharSequence charSequence2) {
        C10664xF1.E(charSequence);
        C10664xF1.E(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt(i) == charSequence2.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (k(charSequence, i2) || k(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        C10664xF1.E(charSequence);
        C10664xF1.E(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt((charSequence.length() - i) - 1) == charSequence2.charAt((charSequence2.length() - i) - 1)) {
            i++;
        }
        if (k(charSequence, (charSequence.length() - i) - 1) || k(charSequence2, (charSequence2.length() - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(charSequence.length() - i, charSequence.length()).toString();
    }

    @MB
    public static String c(@MB String str) {
        return C7226jD1.c(str);
    }

    public static boolean d(@MB String str) {
        return C7226jD1.k(str);
    }

    public static String e(@MB String str, @MB Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = f(objArr[i2]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) valueOf, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(C6566gU0.h);
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String f(@MB Object obj) {
        String str;
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append(C11304zt1.a);
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb2);
            if (valueOf.length() != 0) {
                str = "Exception during lenientFormat for ".concat(valueOf);
            } else {
                str = new String("Exception during lenientFormat for ");
            }
            logger.log(level, str, (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static String g(@MB String str) {
        return C7226jD1.h(str);
    }

    public static String h(String str, int i, char c) {
        C10664xF1.E(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static String i(String str, int i, char c) {
        C10664xF1.E(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String j(String str, int i) {
        C10664xF1.E(str);
        boolean z = false;
        if (i <= 1) {
            if (i >= 0) {
                z = true;
            }
            C10664xF1.k(z, "invalid count: %s", i);
            if (i == 0) {
                return "";
            }
            return str;
        }
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 == j) {
            char[] cArr = new char[i2];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i3 = i2 - length;
                if (length < i3) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i3);
                    return new String(cArr);
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Required array size too large: ");
            sb.append(j);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    @InterfaceC5299bJ2
    public static boolean k(CharSequence charSequence, int i) {
        if (i >= 0 && i <= charSequence.length() - 2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1))) {
            return true;
        }
        return false;
    }
}
