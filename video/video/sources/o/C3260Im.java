package o;

import java.lang.reflect.InvocationTargetException;

/* renamed from: o.Im  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3260Im implements JF1 {
    public final J31 X = U31.q(getClass());
    public String Y;
    public JF1 Z;

    public C3260Im(String str, JF1 jf1) {
        this.Y = str;
        this.Z = jf1;
    }

    public JF1 b() {
        return this.Z;
    }

    public String c() {
        return this.Y;
    }

    public void d(JF1 jf1) {
        this.Z = jf1;
    }

    public void e(String str) {
        this.Y = str;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        try {
            return this.Z.evaluate(MJ1.m(obj, this.Y));
        } catch (IllegalAccessException e) {
            this.X.g("Unable to access the property provided.", e);
            throw new IllegalArgumentException("Unable to access the property provided.");
        } catch (IllegalArgumentException e2) {
            this.X.g("ERROR: Problem during evaluation.", e2);
            throw e2;
        } catch (NoSuchMethodException e3) {
            this.X.g("Property not found.", e3);
            throw new IllegalArgumentException("Property not found.");
        } catch (InvocationTargetException e4) {
            this.X.g("Exception occurred in property's getter", e4);
            throw new IllegalArgumentException("Exception occurred in property's getter");
        }
    }
}
