package o;

import java.util.Comparator;

/* renamed from: o.Rs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4165Rs2 implements Comparator {
    public Comparator X;
    public InterfaceC3189Hs2 Y;

    public C4165Rs2(InterfaceC3189Hs2 interfaceC3189Hs2) {
        this(interfaceC3189Hs2, new WG());
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.X.compare(this.Y.a(obj), this.Y.a(obj2));
    }

    public C4165Rs2(InterfaceC3189Hs2 interfaceC3189Hs2, Comparator comparator) {
        this.X = comparator;
        this.Y = interfaceC3189Hs2;
    }
}
