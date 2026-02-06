package o;

import java.lang.reflect.InvocationTargetException;

/* renamed from: o.Km  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3456Km implements JF1 {
    public final J31 X;
    public String Y;
    public boolean Y0;
    public Object Z;

    public C3456Km(String str, Object obj) {
        this(str, obj, false);
    }

    public boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public String c() {
        return this.Y;
    }

    public Object d() {
        return this.Z;
    }

    public boolean e() {
        return this.Y0;
    }

    @Override // o.JF1
    public boolean evaluate(Object obj) {
        try {
            return b(this.Z, MJ1.m(obj, this.Y));
        } catch (IllegalAccessException e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to access the property provided.");
            if (!C3651Mm.p(illegalArgumentException, e)) {
                this.X.g("Unable to access the property provided.", e);
            }
            throw illegalArgumentException;
        } catch (IllegalArgumentException e2) {
            if (this.Y0) {
                J31 j31 = this.X;
                j31.q("WARNING: Problem during evaluation. Null value encountered in property path..." + e2);
                return false;
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Problem during evaluation. Null value encountered in property path...");
            if (!C3651Mm.p(illegalArgumentException2, e2)) {
                this.X.g("Problem during evaluation. Null value encountered in property path...", e2);
            }
            throw illegalArgumentException2;
        } catch (NoSuchMethodException e3) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Property not found.");
            if (!C3651Mm.p(illegalArgumentException3, e3)) {
                this.X.g("Property not found.", e3);
            }
            throw illegalArgumentException3;
        } catch (InvocationTargetException e4) {
            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException("Exception occurred in property's getter");
            if (!C3651Mm.p(illegalArgumentException4, e4)) {
                this.X.g("Exception occurred in property's getter", e4);
            }
            throw illegalArgumentException4;
        }
    }

    public C3456Km(String str, Object obj, boolean z) {
        this.X = U31.q(getClass());
        if (str != null && str.length() > 0) {
            this.Y = str;
            this.Z = obj;
            this.Y0 = z;
            return;
        }
        throw new IllegalArgumentException("propertyName cannot be null or empty");
    }
}
