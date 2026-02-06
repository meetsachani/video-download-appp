package o;

import java.lang.reflect.InvocationTargetException;

/* renamed from: o.Lm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3554Lm implements InterfaceC3189Hs2 {
    public final J31 X;
    public String Y;
    public boolean Z;

    public C3554Lm(String str) {
        this(str, false);
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        try {
            return MJ1.m(obj, this.Y);
        } catch (IllegalAccessException e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to access the property provided.");
            if (!C3651Mm.p(illegalArgumentException, e)) {
                this.X.g("Unable to access the property provided.", e);
            }
            throw illegalArgumentException;
        } catch (IllegalArgumentException e2) {
            if (this.Z) {
                this.X.q("WARNING: Problem during transformation. Null value encountered in property path..." + e2);
                return null;
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Problem during transformation. Null value encountered in property path...");
            if (!C3651Mm.p(illegalArgumentException2, e2)) {
                this.X.g("Problem during transformation. Null value encountered in property path...", e2);
            }
            throw illegalArgumentException2;
        } catch (NoSuchMethodException e3) {
            String str = "No property found for name [" + this.Y + C6566gU0.g;
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(str);
            if (!C3651Mm.p(illegalArgumentException3, e3)) {
                this.X.g(str, e3);
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

    public String b() {
        return this.Y;
    }

    public boolean c() {
        return this.Z;
    }

    public C3554Lm(String str, boolean z) {
        this.X = U31.q(getClass());
        if (str != null && str.length() > 0) {
            this.Y = str;
            this.Z = z;
            return;
        }
        throw new IllegalArgumentException("propertyName cannot be null or empty");
    }
}
