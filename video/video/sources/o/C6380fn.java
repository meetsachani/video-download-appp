package o;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.Locale;

/* renamed from: o.fn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6380fn extends UV {
    public C6380fn() {
        this(false);
    }

    @Override // o.UV, o.AbstractC8831pl
    public Object g(Object obj, String str) throws ParseException {
        Object g = super.g(obj, str);
        if (g != null && !(g instanceof BigInteger)) {
            if (g instanceof Number) {
                return BigInteger.valueOf(((Number) g).longValue());
            }
            try {
                return new BigInteger(g.toString());
            } catch (NumberFormatException unused) {
                throw new WM("Suplied number is not of type BigInteger: " + g);
            }
        }
        return g;
    }

    public C6380fn(boolean z) {
        this(Locale.getDefault(), z);
    }

    public C6380fn(Locale locale) {
        this(locale, false);
    }

    public C6380fn(Locale locale, boolean z) {
        this(locale, (String) null, z);
    }

    public C6380fn(Locale locale, String str) {
        this(locale, str, false);
    }

    public C6380fn(Locale locale, String str, boolean z) {
        super(locale, str, z);
    }

    public C6380fn(Object obj) {
        this(obj, false);
    }

    public C6380fn(Object obj, boolean z) {
        this(obj, Locale.getDefault(), z);
    }

    public C6380fn(Object obj, Locale locale) {
        this(obj, locale, false);
    }

    public C6380fn(Object obj, Locale locale, boolean z) {
        this(obj, locale, null, z);
    }

    public C6380fn(Object obj, Locale locale, String str) {
        this(obj, locale, str, false);
    }

    public C6380fn(Object obj, Locale locale, String str, boolean z) {
        super(obj, locale, str, z);
    }
}
