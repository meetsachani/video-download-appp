package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: o.oN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8500oN1 extends AbstractC5947e0 {
    public static final Pattern t = Pattern.compile("[{}()\\[\\].+*?^$\\\\|]");
    public final String r;
    public final String s;

    public C8500oN1() {
        this('\"', ',', EnumC4456Us.NEITHER);
    }

    @Override // o.AbstractC5947e0
    public String k(String str, boolean z) {
        String str2;
        int length;
        boolean z2;
        if (str == null && !this.p.equals(EnumC4456Us.NEITHER)) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (str2 == null) {
            length = 16;
        } else {
            length = str2.length() * 2;
        }
        StringBuilder sb = new StringBuilder(length);
        boolean z3 = false;
        if (str2 != null && str2.contains(Character.toString(g()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || l(str, z2)) {
            z3 = true;
        }
        if (z2) {
            str2 = str2.replaceAll(Character.toString(g()), Character.toString(g()) + Character.toString(g()));
        }
        if (z3) {
            sb.append(g());
        }
        sb.append(str2);
        if (z3) {
            sb.append(g());
        }
        return sb.toString();
    }

    @Override // o.AbstractC5947e0
    public String[] m(String str, boolean z) {
        if (!z && this.q != null) {
            this.q = null;
        }
        if (str == null) {
            String str2 = this.q;
            if (str2 == null) {
                return null;
            }
            this.q = null;
            return new String[]{str2};
        }
        if (z && this.q != null) {
            str = this.q + str;
        }
        this.q = null;
        if (!C4500Ve2.t(str, this.f720o)) {
            return o(w(str));
        }
        String[] o2 = o(u(str, z));
        for (int i = 0; i < o2.length; i++) {
            if (C4500Ve2.t(o2[i], this.f720o)) {
                o2[i] = p(o2[i]);
            }
        }
        return o2;
    }

    public final int n(String str, int i) {
        int indexOf = str.indexOf(this.f720o, i + 1);
        boolean z = false;
        while (s(str, indexOf)) {
            if (!z) {
                int i2 = indexOf + 1;
                if (str.charAt(i2) == this.n) {
                    return i2;
                }
            }
            do {
                indexOf = str.indexOf(this.f720o, indexOf + 1);
                z = !z;
                if (s(str, indexOf)) {
                }
            } while (str.charAt(indexOf + 1) == this.f720o);
        }
        return str.length();
    }

    public final String[] o(String[] strArr) {
        EnumC4456Us enumC4456Us = this.p;
        if (enumC4456Us == EnumC4456Us.EMPTY_SEPARATORS || enumC4456Us == EnumC4456Us.BOTH) {
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].isEmpty()) {
                    strArr[i] = null;
                }
            }
        }
        return strArr;
    }

    public final String p(String str) {
        if (!r(str) && str.startsWith(this.s)) {
            str = C4500Ve2.V1(C4500Ve2.a2(str, this.s), this.s);
        }
        String f2 = C4500Ve2.f2(str, this.s + this.s, this.s);
        if (f2.isEmpty()) {
            EnumC4456Us enumC4456Us = this.p;
            if (enumC4456Us == EnumC4456Us.BOTH || enumC4456Us == EnumC4456Us.EMPTY_QUOTES) {
                return null;
            }
            return f2;
        }
        return f2;
    }

    public final boolean q(String str) {
        if (C4500Ve2.H(str, this.f720o) % 2 != 0) {
            return true;
        }
        return false;
    }

    public final boolean r(String str) {
        if (C4500Ve2.H(str, this.f720o) == 1) {
            return true;
        }
        return false;
    }

    public final boolean s(String str, int i) {
        if (i != -1 && i < str.length() - 1) {
            return true;
        }
        return false;
    }

    public final boolean t(List<String> list) {
        String str = list.get(list.size() - 1);
        if (v(str) || r(str) || q(str)) {
            return true;
        }
        return false;
    }

    public final String[] u(String str, boolean z) {
        String substring;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf(this.n, i);
            int indexOf2 = str.indexOf(this.f720o, i);
            if (indexOf == -1) {
                arrayList.add(str.substring(i));
                i = str.length();
            } else {
                if (indexOf2 != -1 && indexOf2 <= indexOf && indexOf2 == i) {
                    indexOf = n(str, i);
                    if (indexOf >= str.length()) {
                        substring = str.substring(i);
                    } else {
                        substring = str.substring(i, indexOf);
                    }
                    arrayList.add(substring);
                } else {
                    arrayList.add(str.substring(i, indexOf));
                }
                i = indexOf + 1;
            }
        }
        if (z && t(arrayList)) {
            this.q = arrayList.get(arrayList.size() - 1) + "\n";
            arrayList.remove(arrayList.size() + (-1));
        } else if (str.lastIndexOf(this.n) == str.length() - 1) {
            arrayList.add("");
        }
        return (String[]) arrayList.toArray(C4206Se.u);
    }

    public final boolean v(String str) {
        if (str.startsWith(Character.toString(this.f720o)) && !str.endsWith(Character.toString(this.f720o))) {
            return true;
        }
        return false;
    }

    public final String[] w(String str) {
        return str.split(this.r, -1);
    }

    public C8500oN1(char c, char c2, EnumC4456Us enumC4456Us) {
        super(c2, c, enumC4456Us);
        this.r = t.matcher(Character.toString(c2)).replaceAll("\\\\$0");
        this.s = Character.toString(c);
    }

    @Override // o.UI0
    public void d(Locale locale) {
    }
}
