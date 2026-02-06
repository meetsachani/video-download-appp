package o;

import java.util.ResourceBundle;

/* renamed from: o.tP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9727tP<T, I> extends V<T, I> {
    @Override // o.V
    public Object b(String str) throws JR {
        if (C4500Ve2.I0(str)) {
            return null;
        }
        try {
            return new C3562Lo(s(), r()).b(Boolean.class, str.trim());
        } catch (WM e) {
            JR jr = new JR(str, this.b.getType(), ResourceBundle.getBundle("convertLanguageToBoolean", this.d).getString("input.not.boolean"));
            jr.initCause(e);
            throw jr;
        }
    }

    @Override // o.V
    public String c(Object obj) throws JR {
        if (obj != null) {
            try {
                if (((Boolean) obj).booleanValue()) {
                    return u();
                }
                return t();
            } catch (ClassCastException e) {
                JR jr = new JR(ResourceBundle.getBundle("convertLanguageToBoolean", this.d).getString("field.not.boolean"));
                jr.initCause(e);
                throw jr;
            }
        }
        return "";
    }

    public abstract String[] r();

    public abstract String[] s();

    public abstract String t();

    public abstract String u();
}
