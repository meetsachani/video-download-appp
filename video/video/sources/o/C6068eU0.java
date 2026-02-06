package o;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: o.eU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6068eU0 implements Enumeration {
    public Iterator a;

    public C6068eU0() {
    }

    public Iterator a() {
        return this.a;
    }

    public void b(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.a.hasNext();
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        return this.a.next();
    }

    public C6068eU0(Iterator it) {
        this.a = it;
    }
}
