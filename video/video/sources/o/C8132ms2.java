package o;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: o.ms2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8132ms2 extends S2 {
    private static final long serialVersionUID = 8692300188161871514L;
    public final InterfaceC3189Hs2 Y;

    public C8132ms2(Collection collection, InterfaceC3189Hs2 interfaceC3189Hs2) {
        super(collection);
        if (interfaceC3189Hs2 != null) {
            this.Y = interfaceC3189Hs2;
            return;
        }
        throw new IllegalArgumentException("Transformer must not be null");
    }

    public static Collection e(Collection collection, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C8132ms2(collection, interfaceC3189Hs2);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return d().add(f(obj));
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        return d().addAll(h(collection));
    }

    public Object f(Object obj) {
        return this.Y.a(obj);
    }

    public Collection h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            arrayList.add(f(obj));
        }
        return arrayList;
    }
}
