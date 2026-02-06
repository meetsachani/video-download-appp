package o;

import java.util.Comparator;

/* renamed from: o.hG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6754hG1 extends TF1 implements V92 {
    private static final long serialVersionUID = 3448581314086406616L;

    public C6754hG1(V92 v92, JF1 jf1) {
        super(v92, jf1);
    }

    public static V92 j(V92 v92, JF1 jf1) {
        return new C6754hG1(v92, jf1);
    }

    @Override // o.V92
    public Comparator comparator() {
        return k().comparator();
    }

    @Override // o.V92
    public Object first() {
        return k().first();
    }

    public V92 k() {
        return (V92) d();
    }

    @Override // o.V92
    public Object last() {
        return k().last();
    }
}
