package o;

/* renamed from: o.n00  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8163n00 implements InterfaceC5095aT1 {
    public static final char a = '.';
    public static final char b = '(';
    public static final char c = ')';
    public static final char d = '[';
    public static final char e = ']';

    @Override // o.InterfaceC5095aT1
    public String a(String str) {
        char charAt;
        if (str != null && str.length() != 0) {
            for (int i = 0; i < str.length() && (charAt = str.charAt(i)) != '.' && charAt != '['; i++) {
                if (charAt == '(') {
                    int indexOf = str.indexOf(41, i);
                    if (indexOf >= 0) {
                        return str.substring(i + 1, indexOf);
                    }
                    throw new IllegalArgumentException("Missing End Delimiter");
                }
            }
        }
        return null;
    }

    @Override // o.InterfaceC5095aT1
    public boolean b(String str) {
        char charAt;
        if (str != null && str.length() != 0) {
            for (int i = 0; i < str.length() && (charAt = str.charAt(i)) != '.' && charAt != '['; i++) {
                if (charAt == '(') {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.InterfaceC5095aT1
    public boolean c(String str) {
        if (str == null || str.length() == 0 || remove(str) == null) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC5095aT1
    public String d(String str) {
        if (str != null && str.length() != 0) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (z) {
                    if (charAt == ']') {
                        return str.substring(0, i + 1);
                    }
                } else if (z2) {
                    if (charAt == ')') {
                        return str.substring(0, i + 1);
                    }
                } else if (charAt == '.') {
                    return str.substring(0, i);
                } else {
                    if (charAt == '(') {
                        z2 = true;
                    } else if (charAt == '[') {
                        z = true;
                    }
                }
            }
            return str;
        }
        return null;
    }

    @Override // o.InterfaceC5095aT1
    public boolean e(String str) {
        char charAt;
        if (str != null && str.length() != 0) {
            for (int i = 0; i < str.length() && (charAt = str.charAt(i)) != '.' && charAt != '('; i++) {
                if (charAt == '[') {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.InterfaceC5095aT1
    public int getIndex(String str) {
        char charAt;
        if (str != null && str.length() != 0) {
            for (int i = 0; i < str.length() && (charAt = str.charAt(i)) != '.' && charAt != '('; i++) {
                if (charAt == '[') {
                    int indexOf = str.indexOf(93, i);
                    if (indexOf >= 0) {
                        String substring = str.substring(i + 1, indexOf);
                        if (substring.length() != 0) {
                            try {
                                return Integer.parseInt(substring, 10);
                            } catch (Exception unused) {
                                throw new IllegalArgumentException("Invalid index value '" + substring + "'");
                            }
                        }
                        throw new IllegalArgumentException("No Index Value");
                    }
                    throw new IllegalArgumentException("Missing End Delimiter");
                }
            }
        }
        return -1;
    }

    @Override // o.InterfaceC5095aT1
    public String getProperty(String str) {
        if (str != null && str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.') {
                    return str.substring(0, i);
                }
                if (charAt == '(' || charAt == '[') {
                    return str.substring(0, i);
                }
            }
            return str;
        }
        return str;
    }

    @Override // o.InterfaceC5095aT1
    public String remove(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String d2 = d(str);
        if (str.length() == d2.length()) {
            return null;
        }
        int length = d2.length();
        if (str.charAt(length) == '.') {
            length++;
        }
        return str.substring(length);
    }
}
