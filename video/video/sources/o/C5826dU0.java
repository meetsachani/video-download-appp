package o;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: o.dU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5826dU0<E> implements Enumeration<E> {
    public Iterator<? extends E> a;

    public C5826dU0() {
    }

    public Iterator<? extends E> a() {
        return this.a;
    }

    public void b(Iterator<? extends E> it) {
        this.a = it;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.a.hasNext();
    }

    @Override // java.util.Enumeration
    public E nextElement() {
        return this.a.next();
    }

    public C5826dU0(Iterator<? extends E> it) {
        this.a = it;
    }
}
