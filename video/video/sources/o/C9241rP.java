package o;

import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.rP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9241rP extends AbstractC10113v0 {
    public C9241rP(Class<?> cls, String str, String str2, Locale locale) {
        super(cls, str, str2, locale);
    }

    @Override // o.ER
    public Object a(String str) throws JR {
        if (C4500Ve2.N0(str)) {
            Enum i = C4006Qd0.i(this.a, str);
            if (i != null) {
                return i;
            }
            throw new JR(str, this.a, String.format(ResourceBundle.getBundle(UI0.k).getString("illegal.enum.value"), str, this.a.getName()));
        }
        return null;
    }

    @Override // o.AbstractC10113v0, o.ER
    public String b(Object obj) {
        if (obj != null) {
            return ((Enum) obj).name();
        }
        return "";
    }
}
