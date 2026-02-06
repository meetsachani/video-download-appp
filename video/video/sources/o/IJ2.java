package o;

import java.util.Enumeration;
import o.JJ2;

/* loaded from: classes4.dex */
public class IJ2 implements Enumeration {
    public final /* synthetic */ Enumeration a;
    public final /* synthetic */ JJ2 b;

    public IJ2(JJ2 jj2, Enumeration enumeration) {
        this.b = jj2;
        this.a = enumeration;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        return ((JJ2.b) this.a.nextElement()).b();
    }
}
