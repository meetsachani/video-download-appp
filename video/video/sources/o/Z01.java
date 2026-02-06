package o;

import java.util.Iterator;
import java.util.Map;
import o.W01;

/* loaded from: classes4.dex */
public class Z01 extends C7176j1 {
    public final /* synthetic */ W01.f Y;

    public Z01(W01.f fVar, Iterator it) {
        super(it);
        this.Y = fVar;
    }

    @Override // o.C7176j1, java.util.Iterator
    public Object next() {
        return ((Map.Entry) this.X.next()).getValue();
    }
}
