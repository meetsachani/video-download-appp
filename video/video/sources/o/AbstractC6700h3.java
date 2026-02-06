package o;

import java.util.Comparator;

/* renamed from: o.h3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6700h3 extends P implements V92 {
    public AbstractC6700h3() {
    }

    @Override // o.V92
    public Comparator comparator() {
        return f().comparator();
    }

    public V92 f() {
        return (V92) d();
    }

    @Override // o.V92
    public Object first() {
        return f().first();
    }

    @Override // o.V92
    public Object last() {
        return f().last();
    }

    public AbstractC6700h3(V92 v92) {
        super(v92);
    }
}
