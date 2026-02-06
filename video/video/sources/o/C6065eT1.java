package o;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* renamed from: o.eT1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6065eT1 extends AbstractC9882u3 {
    public static final C6065eT1 d = new C6065eT1();
    public final String c;

    public C6065eT1() {
        this(null);
    }

    public ResourceBundle g(String str) {
        return ResourceBundle.getBundle(str);
    }

    public String h(String str, String str2) {
        return g(str).getString(str2);
    }

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        boolean z;
        String str2;
        if (str == null) {
            return null;
        }
        String[] split = str.split(AbstractC9882u3.b);
        int length = split.length;
        String str3 = this.c;
        if (str3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z && length != 2) {
            throw C6036eM0.a("Bad resource bundle key format [%s]; expected format is BundleName:KeyName.", str);
        }
        if (str3 != null && length != 1) {
            throw C6036eM0.a("Bad resource bundle key format [%s]; expected format is KeyName.", str);
        }
        if (z) {
            str3 = split[0];
        }
        if (z) {
            str2 = split[1];
        } else {
            str2 = split[0];
        }
        try {
            return h(str3, str2);
        } catch (MissingResourceException unused) {
            return null;
        } catch (Exception e) {
            throw C6036eM0.b(e, "Error looking up resource bundle [%s] and key [%s].", str3, str2);
        }
    }

    public String toString() {
        return super.toString() + " [bundleName=" + this.c + C6566gU0.g;
    }

    public C6065eT1(String str) {
        this.c = str;
    }
}
