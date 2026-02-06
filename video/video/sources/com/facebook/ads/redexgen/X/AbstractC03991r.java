package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import o.C2638Cg0;
import o.C8077mf;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b'\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H¦\u0002¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002J\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0016R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006!"}, d2 = {"Lkotlin/collections/AbstractList;", C2638Cg0.S4, "Lkotlin/collections/AbstractCollection;", "", "<init>", "()V", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "iterator", "", "indexOf", "element", "(Ljava/lang/Object;)I", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "equals", "", "other", "", "hashCode", "SubList", "IteratorImpl", "ListIteratorImpl", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.1r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC03991r<E> extends AbstractC0606Ai<E> implements List<E> {
    public static byte[] A00;
    public static String[] A01 = {"6o2kpFJ0aaKm", "Y3S9bP6f9KV4WNew3rE8YV0aKQTHvm3f", "vXqfzKlSrGtNrV", "d6q688tFOEkRTmoIavyEO3LGte2Y3zBG", "hfbtQesRf9zCxbPjGMA7grfwj2jMjSJI", "c4b5mEHWRN6KgilP3rpF8phuKVuohhIP", "BtMaQ2U4oqVznSkaM81HDKd2rmhi1ZrT", "jI38cxImdo4ZItvpXhBUuKHr68ZY1LLb"};
    public static final C2266qk A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            if (A01[4].charAt(15) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "AnDFYrIpGP8RiZY0rYL1oA82wmurUP9n";
            copyOfRange[i4] = (byte) (i5 - 84);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-19, C8077mf.p, 3, C8077mf.r, -1, C8077mf.u, 7, 13, C8077mf.n, -66, 7, 17, -66, C8077mf.n, 13, C8077mf.u, -66, 17, 19, C8077mf.p, C8077mf.p, 13, C8077mf.r, C8077mf.u, 3, 2, -66, 4, 13, C8077mf.r, -66, C8077mf.r, 3, -1, 2, C2638Cg0.x7, 13, C8077mf.n, 10, C8077mf.A, -66, 1, 13, 10, 10, 3, 1, C8077mf.u, 7, 13, C8077mf.n};
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException(A06(0, 51, 74));
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(A06(0, 51, 74));
    }

    public abstract E get(int i);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (C2256qY.A0C(e2, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public int lastIndexOf(E e) {
        AbstractC03991r<E> abstractC03991r = this;
        ListIterator<E> listIterator = abstractC03991r.listIterator(abstractC03991r.size());
        while (listIterator.hasPrevious()) {
            if (C2256qY.A0C(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException(A06(0, 51, 74));
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException(A06(0, 51, 74));
    }

    static {
        A07();
        A02 = new C2266qk(null);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z = obj instanceof List;
        String[] strArr = A01;
        if (strArr[7].charAt(28) != strArr[6].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "QAWRpf6o5gcxm1";
        strArr2[0] = "2gyTGgFlMxEu";
        if (z) {
            return A02.A06(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return A02.A02(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0606Ai, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0605Ah(this);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C04001s(this, 0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C04001s(this, i);
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        return new AnonymousClass16(this, i, i2);
    }
}
