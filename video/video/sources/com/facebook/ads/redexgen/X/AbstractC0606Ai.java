package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH¦\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0015¢\u0006\u0002\u0010\u0017J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0001\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0015H\u0014¢\u0006\u0002\u0010\u001aR\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lkotlin/collections/AbstractCollection;", C2638Cg0.S4, "", "<init>", "()V", "size", "", "getSize", "()I", "iterator", "", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "toString", "", "toArray", "", "", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.Ai */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0606Ai<E> implements Collection<E> {
    public static byte[] A00;

    static {
        A0B();
    }

    public static /* synthetic */ CharSequence A09(AbstractC0606Ai abstractC0606Ai, Object obj) {
        return A08(abstractC0606Ai, obj);
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{C8077mf.H, 66, 94, 95, 69, C8077mf.z, 117, 89, 90, 90, 83, 85, 66, 95, 89, 88, 31, 10, 6, 5, 58, 47, 56, C3307Iz.c0, 62, 35, C3307Iz.X, 36, 106, 35, 57, 106, 36, C3307Iz.X, 62, 106, 57, ED2.a, 58, 58, C3307Iz.X, 56, 62, 47, C3307Iz.f0, 106, C3307Iz.d0, C3307Iz.X, 56, 106, 56, 47, C3307Iz.c0, C3307Iz.f0, 103, C3307Iz.X, 36, C3307Iz.Y, 51, 106, C3307Iz.a0, C3307Iz.X, C3307Iz.Y, C3307Iz.Y, 47, C3307Iz.a0, 62, 35, C3307Iz.X, 36, C3307Iz.V, 69, C3307Iz.d0, ED2.a, ED2.a, C3307Iz.d0, 52, 8, 1, 8, 0, 8, 3, C8077mf.C, C8077mf.H};
    }

    public abstract int A0C();

    @Override // java.util.Collection
    public final boolean add(E e) {
        throw new UnsupportedOperationException(A0A(19, 51, 93));
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(A0A(19, 51, 93));
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException(A0A(19, 51, 93));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // java.util.Collection, java.util.List
    public boolean contains(E e) {
        AbstractC0606Ai<E> abstractC0606Ai = this;
        if ((abstractC0606Ai instanceof Collection) && abstractC0606Ai.isEmpty()) {
            return false;
        }
        for (E e2 : abstractC0606Ai) {
            if (C2256qY.A0C(e2, e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C2256qY.A09(collection, A0A(77, 8, 122));
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException(A0A(19, 51, 93));
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(A0A(19, 51, 93));
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(A0A(19, 51, 93));
    }

    public static final CharSequence A08(AbstractC0606Ai abstractC0606Ai, Object obj) {
        return obj == abstractC0606Ai ? A0A(0, 17, 33) : String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return A0C();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC2258qa.A02(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C2256qY.A09(tArr, A0A(72, 5, 90));
        return (T[]) AbstractC2258qa.A03(this, tArr);
    }

    public final String toString() {
        return C0d.A03(this, A0A(17, 2, 49), A0A(70, 1, 109), A0A(71, 1, 15), 0, null, new AZ() { // from class: com.facebook.ads.redexgen.X.1t
            @Override // com.facebook.ads.redexgen.X.AZ
            public final Object AAK(Object obj) {
                return AbstractC0606Ai.A09(AbstractC0606Ai.this, obj);
            }
        }, 24, null);
    }
}
