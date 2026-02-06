package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: o.u21  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9880u21 implements InterfaceC10123v21 {
    public static final Locale[] c = new Locale[0];
    public static final Locale d = new Locale("en", "XA");
    public static final Locale e = new Locale("ar", "XB");
    public static final Locale f = C9637t21.b("en-Latn");
    public final Locale[] a;
    public final String b;

    /* renamed from: o.u21$a */
    /* loaded from: classes.dex */
    public static class a {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    public C9880u21(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = c;
            this.b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    k(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.b = sb.toString();
    }

    public static String h(Locale locale) {
        String a2 = a.a(locale);
        if (!a2.isEmpty()) {
            return a2;
        }
        return "";
    }

    public static boolean i(Locale locale) {
        if (!d.equals(locale) && !e.equals(locale)) {
            return false;
        }
        return true;
    }

    public static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String h = h(locale);
        if (h.isEmpty()) {
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return 1;
            }
            return 0;
        }
        return h.equals(h(locale2)) ? 1 : 0;
    }

    public static void k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    @Override // o.InterfaceC10123v21
    public int a(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                if (localeArr[i].equals(locale)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // o.InterfaceC10123v21
    public String b() {
        return this.b;
    }

    @Override // o.InterfaceC10123v21
    public Object c() {
        return null;
    }

    @Override // o.InterfaceC10123v21
    public Locale d(String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public final Locale e(Collection<String> collection, boolean z) {
        int f2 = f(collection, z);
        if (f2 == -1) {
            return null;
        }
        return this.a[f2];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9880u21)) {
            return false;
        }
        Locale[] localeArr = ((C9880u21) obj).a;
        if (this.a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(Collection<String> collection, boolean z) {
        int i;
        Locale[] localeArr = this.a;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z) {
            i = g(f);
            if (i == 0) {
                return 0;
            }
        }
        i = Integer.MAX_VALUE;
        for (String str : collection) {
            int g = g(C9637t21.b(str));
            if (g == 0) {
                return 0;
            }
            if (g < i) {
                i = g;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public final int g(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                if (j(locale, localeArr[i]) > 0) {
                    return i;
                }
                i++;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    @Override // o.InterfaceC10123v21
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
            return null;
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // o.InterfaceC10123v21
    public boolean isEmpty() {
        if (this.a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10123v21
    public int size() {
        return this.a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6566gU0.f);
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append(C6566gU0.g);
                return sb.toString();
            }
        }
    }
}
