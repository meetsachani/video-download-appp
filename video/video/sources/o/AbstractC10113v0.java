package o;

import java.util.Locale;
import java.util.Objects;

/* renamed from: o.v0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10113v0 implements ER {
    public Class<?> a;
    public Locale b;
    public Locale c;
    public Locale d;

    public AbstractC10113v0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Locale.getDefault();
    }

    @Override // o.ER
    public String b(Object obj) throws JR {
        return Objects.toString(obj, "");
    }

    @Override // o.ER
    public void c(String str) {
        Locale locale;
        if (C4500Ve2.N0(str)) {
            locale = Locale.forLanguageTag(str);
        } else {
            locale = null;
        }
        this.c = locale;
    }

    @Override // o.ER
    public void d(Locale locale) {
        this.d = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }

    @Override // o.ER
    public void e(Class<?> cls) {
        this.a = cls;
    }

    @Override // o.ER
    public void f(String str) {
        Locale locale;
        if (C4500Ve2.N0(str)) {
            locale = Locale.forLanguageTag(str);
        } else {
            locale = null;
        }
        this.b = locale;
    }

    public AbstractC10113v0(Class<?> cls, String str, String str2, Locale locale) {
        this.a = cls;
        this.b = C4500Ve2.N0(str) ? Locale.forLanguageTag(str) : null;
        this.c = C4500Ve2.N0(str2) ? Locale.forLanguageTag(str2) : null;
        this.d = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }
}
