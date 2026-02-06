package o;

import java.util.Locale;
import java.util.ResourceBundle;

/* loaded from: classes3.dex */
public class DP extends AbstractC10113v0 {
    public final C6780hN e;
    public final C8659p21 f;
    public final C6780hN g;
    public final C8659p21 h;

    public DP(Class<?> cls, String str, String str2, Locale locale) {
        super(cls, str, str2, locale);
        if (this.b == null) {
            C6780hN c6780hN = new C6780hN();
            this.e = c6780hN;
            c6780hN.t(true, false, 0);
            this.f = null;
        } else {
            C8659p21 c8659p21 = new C8659p21();
            this.f = c8659p21;
            c8659p21.u(this.b);
            this.e = null;
        }
        if (this.c == null) {
            C6780hN c6780hN2 = new C6780hN();
            this.g = c6780hN2;
            c6780hN2.t(true, false, 0);
            this.h = null;
            return;
        }
        C8659p21 c8659p212 = new C8659p21();
        this.h = c8659p212;
        c8659p212.u(this.c);
        this.g = null;
    }

    @Override // o.ER
    public Object a(String str) throws JR {
        Object a;
        Object b;
        if (!C4500Ve2.M0(str) && (str == null || !this.a.equals(String.class))) {
            return null;
        }
        try {
            C6780hN c6780hN = this.e;
            if (c6780hN != null) {
                synchronized (c6780hN) {
                    b = this.e.b(str, this.a);
                }
                return b;
            }
            synchronized (this.f) {
                a = this.f.a(str, this.a);
            }
            return a;
        } catch (WM e) {
            JR jr = new JR(str, this.a, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("conversion.impossible"), str, this.a.getCanonicalName()));
            jr.initCause(e);
            throw jr;
        }
    }

    @Override // o.AbstractC10113v0, o.ER
    public String b(Object obj) throws JR {
        String g;
        String d;
        if (obj != null) {
            try {
                C6780hN c6780hN = this.g;
                if (c6780hN != null) {
                    synchronized (c6780hN) {
                        d = this.g.d(obj);
                    }
                    return d;
                }
                synchronized (this.h) {
                    g = this.h.g(obj);
                }
                return g;
            } catch (WM e) {
                JR jr = new JR(ResourceBundle.getBundle(UI0.k, this.d).getString("field.not.primitive"));
                jr.initCause(e);
                throw jr;
            }
        }
        return null;
    }
}
