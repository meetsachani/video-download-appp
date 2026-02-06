package o;

import java.util.NoSuchElementException;

/* renamed from: o.Tj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4326Tj2 implements EH1 {
    public final EH1 X;

    public C4326Tj2(EH1 eh1) {
        this.X = eh1;
    }

    @Override // o.EH1
    public synchronized void clear() {
        this.X.clear();
    }

    @Override // o.EH1
    public synchronized void d(Object obj) {
        this.X.d(obj);
    }

    @Override // o.EH1
    public synchronized boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // o.EH1
    public synchronized Object peek() throws NoSuchElementException {
        return this.X.peek();
    }

    @Override // o.EH1
    public synchronized Object pop() throws NoSuchElementException {
        return this.X.pop();
    }

    public synchronized String toString() {
        return this.X.toString();
    }
}
