package o;

import java.util.Iterator;
import java.util.Map;
import o.W01;

/* loaded from: classes4.dex */
public class Y01 extends C7176j1 {
    public final /* synthetic */ W01.b Y;

    public Y01(W01.b bVar, Iterator it) {
        super(it);
        this.Y = bVar;
    }

    @Override // o.C7176j1, java.util.Iterator
    public Object next() {
        return ((Map.Entry) super.next()).getKey();
    }
}
