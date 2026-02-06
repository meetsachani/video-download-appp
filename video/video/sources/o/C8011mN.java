package o;

import java.util.Currency;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.mN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8011mN extends AbstractC10113v0 {
    public C8011mN(Locale locale) {
        super(Currency.class, null, null, locale);
    }

    @Override // o.ER
    public Object a(String str) throws JR {
        if (C4500Ve2.N0(str)) {
            try {
                return Currency.getInstance(str);
            } catch (IllegalArgumentException e) {
                JR jr = new JR(str, this.a, String.format(ResourceBundle.getBundle(UI0.k).getString("invalid.currency.value"), str, this.a.getName()));
                jr.initCause(e);
                throw jr;
            }
        }
        return null;
    }

    @Override // o.AbstractC10113v0, o.ER
    public String b(Object obj) throws JR {
        if (obj != null) {
            return ((Currency) obj).getCurrencyCode();
        }
        return null;
    }
}
